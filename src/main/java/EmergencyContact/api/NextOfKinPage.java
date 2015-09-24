package EmergencyContact.api;

import EmergencyContact.domain.NextOfKin;
import EmergencyContact.services.NextOfKinService;
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
@RequestMapping("/api/nok/**")
public class NextOfKinPage {
    @Autowired
    private NextOfKinService service;
    //-------------------Retrieve All NextOfKins--------------------------------------------------------
    @RequestMapping(value = "/nextofkin/", method = RequestMethod.GET)
    public ResponseEntity<List<NextOfKin>> listAllNOK() {
        List<NextOfKin> NextOfKins = (List<NextOfKin>) service.findAll();
        if(NextOfKins.isEmpty()){
            return new ResponseEntity<List<NextOfKin>>(HttpStatus.NO_CONTENT);//You many decide to return HttpStatus.NOT_FOUND
        }
        return new ResponseEntity<List<NextOfKin>>(NextOfKins, HttpStatus.OK);
    }
    //-------------------Retrieve Single NextOfKin--------------------------------------------------------
    @RequestMapping(value = "/nextofkin/{id}", method = RequestMethod.GET, produces = MediaType.APPLICATION_JSON_VALUE)
    public ResponseEntity<NextOfKin> getNextOfKin(@PathVariable("id") long id) {
        System.out.println("Fetching NextOfKin with id " + id);
        NextOfKin NextOfKin = service.findById(id);
        if (NextOfKin == null) {
            System.out.println("NextOfKin with id " + id + " not found");
            return new ResponseEntity<NextOfKin>(HttpStatus.NOT_FOUND);
        }
        return new ResponseEntity<NextOfKin>(NextOfKin, HttpStatus.OK);
    }
    //-------------------Create a NextOfKin--------------------------------------------------------
    @RequestMapping(value = "/nextofkin/create", method = RequestMethod.POST)
    public ResponseEntity<Void> createNextOfKin(@RequestBody NextOfKin nextOfKin, UriComponentsBuilder ucBuilder) {
        System.out.println("Creating NextOfKin " + nextOfKin.getId());
// USE THIS IF YOU WANT TO CHECK UNIQUE OBJECT
// if (SubjectService.isSubjectExist(Subject)) {
// System.out.println("A Subject with name " + Subject.getName() + " already exist");
// return new ResponseEntity<Void>(HttpStatus.CONFLICT);
// }
        service.save(nextOfKin);
        HttpHeaders headers = new HttpHeaders();
        headers.setLocation(ucBuilder.path("/nextofkin/{id}").buildAndExpand(nextOfKin.getId()).toUri());
        return new ResponseEntity<Void>(headers, HttpStatus.CREATED);
    }
    //------------------- Update a NextOfKin --------------------------------------------------------
    @RequestMapping(value = "/nextofkin/update/{id}", method = RequestMethod.PUT)
    public ResponseEntity<NextOfKin> updateNextOfKin(@PathVariable("id") long id, @RequestBody NextOfKin NextOfKin) {
        System.out.println("Updating NextOfKin " + id);
        NextOfKin currentNextOfKin = service.findById(id);
        if (currentNextOfKin==null) {
            System.out.println("NextOfKin with id " + id + " not found");
            return new ResponseEntity<NextOfKin>(HttpStatus.NOT_FOUND);
        }
        NextOfKin updatedNextOfKin = new NextOfKin
                .Builder(currentNextOfKin.getId())
                .copy(currentNextOfKin)
                .build();
        service.update(updatedNextOfKin);
        return new ResponseEntity<NextOfKin>(updatedNextOfKin, HttpStatus.OK);
    }
    //------------------- Delete a NextOfKin --------------------------------------------------------
    @RequestMapping(value = "/nextofkin/delete/{id}", method = RequestMethod.DELETE)
    public ResponseEntity<NextOfKin> deleteNextOfKin(@PathVariable("id") long id) {
        System.out.println("Fetching & Deleting NextOfKin with id " + id);
        NextOfKin nextOfKin = service.findById(id);
        if (nextOfKin == null) {
            System.out.println("Unable to delete. NextOfKin with id " + id + " not found");
            return new ResponseEntity<NextOfKin>(HttpStatus.NOT_FOUND);
        }
        service.delete(nextOfKin);
        return new ResponseEntity<NextOfKin>(HttpStatus.NO_CONTENT);
    }
}
