package EmergencyContact.api;

import EmergencyContact.domain.Medical;
import EmergencyContact.services.MedicalService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.util.UriComponentsBuilder;
import java.util.List;

/**
 * Created by graham on 2015/09/22.
 */
@RestController
@RequestMapping("/api/**")
public class MedicalPage {
    @Autowired
    private MedicalService service;
    //-------------------Retrieve All Medicals--------------------------------------------------------
    @RequestMapping(value = "/medical/", method = RequestMethod.GET)
    public ResponseEntity<List<Medical>> listAllMedicals() {
        List<Medical> Medicals = (List<Medical>) service.findAll();
        if(Medicals.isEmpty()){
            return new ResponseEntity<List<Medical>>(HttpStatus.NO_CONTENT);//You many decide to return HttpStatus.NOT_FOUND
        }
        return new ResponseEntity<List<Medical>>(Medicals, HttpStatus.OK);
    }
    //-------------------Retrieve Single Medical--------------------------------------------------------
    @RequestMapping(value = "/medical/{id}", method = RequestMethod.GET, produces = MediaType.APPLICATION_JSON_VALUE)
    public ResponseEntity<Medical> getMedical(@PathVariable("id") long id) {
        System.out.println("Fetching Medical with id " + id);
        Medical Medical = service.findById(id);
        if (Medical == null) {
            System.out.println("Medical with id " + id + " not found");
            return new ResponseEntity<Medical>(HttpStatus.NOT_FOUND);
        }
        return new ResponseEntity<Medical>(Medical, HttpStatus.OK);
    }
    //-------------------Create a Medical--------------------------------------------------------
    @RequestMapping(value = "/medical/create", method = RequestMethod.POST)
    public ResponseEntity<Void> createMedical(@RequestBody Medical medical, UriComponentsBuilder ucBuilder) {
        System.out.println("Creating User " + medical.getId());
// USE THIS IF YOU WANT TO CHECK UNIQUE OBJECT
// if (SubjectService.isSubjectExist(Subject)) {
// System.out.println("A Subject with name " + Subject.getName() + " already exist");
// return new ResponseEntity<Void>(HttpStatus.CONFLICT);
// }
        service.save(medical);
        HttpHeaders headers = new HttpHeaders();
        headers.setLocation(ucBuilder.path("/medical/{id}").buildAndExpand(medical.getId()).toUri());
        return new ResponseEntity<Void>(headers, HttpStatus.CREATED);
    }
    //------------------- Update a Medical --------------------------------------------------------
    @RequestMapping(value = "/medical/update/{id}", method = RequestMethod.PUT)
    public ResponseEntity<Medical> updateMedical(@PathVariable("id") long id, @RequestBody Medical Medical) {
        System.out.println("Updating Medical " + id);
        Medical currentMedical = service.findById(id);
        if (currentMedical==null) {
            System.out.println("Medical with id " + id + " not found");
            return new ResponseEntity<Medical>(HttpStatus.NOT_FOUND);
        }
        Medical updatedMedical = new Medical
                .Builder(currentMedical.getId())
                .copy(currentMedical)
                .build();
        service.update(updatedMedical);
        return new ResponseEntity<Medical>(updatedMedical, HttpStatus.OK);
    }
    //------------------- Delete a Medical --------------------------------------------------------
    @RequestMapping(value = "/medical/delete/{id}", method = RequestMethod.DELETE)
    public ResponseEntity<Medical> deleteMedical(@PathVariable("id") long id) {
        System.out.println("Fetching & Deleting Medical with id " + id);
        Medical medical = service.findById(id);
        if (medical == null) {
            System.out.println("Unable to delete. Medical with id " + id + " not found");
            return new ResponseEntity<Medical>(HttpStatus.NOT_FOUND);
        }
        service.delete(medical);
        return new ResponseEntity<Medical>(HttpStatus.NO_CONTENT);
    }
}
