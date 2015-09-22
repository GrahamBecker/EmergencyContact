package EmergencyContact.api;

import EmergencyContact.domain.User;
import EmergencyContact.services.UserService;
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
public class UserPage {
    @Autowired
    private UserService service;
    //-------------------Retrieve All Users--------------------------------------------------------
    @RequestMapping(value = "/users/", method = RequestMethod.GET)
    public ResponseEntity<List<User>> listAllUsers() {
        List<User> Users = (List<User>) service.findAll();
        if(Users.isEmpty()){
            return new ResponseEntity<List<User>>(HttpStatus.NO_CONTENT);//You many decide to return HttpStatus.NOT_FOUND
        }
        return new ResponseEntity<List<User>>(Users, HttpStatus.OK);
    }
    //-------------------Retrieve Single User--------------------------------------------------------
    @RequestMapping(value = "/user/{id}", method = RequestMethod.GET, produces = MediaType.APPLICATION_JSON_VALUE)
    public ResponseEntity<User> getUser(@PathVariable("id") long id) {
        System.out.println("Fetching User with id " + id);
        User User = service.findById(id);
        if (User == null) {
            System.out.println("User with id " + id + " not found");
            return new ResponseEntity<User>(HttpStatus.NOT_FOUND);
        }
        return new ResponseEntity<User>(User, HttpStatus.OK);
    }
    //-------------------Create a User--------------------------------------------------------
    @RequestMapping(value = "/user/create", method = RequestMethod.POST)
    public ResponseEntity<Void> createUser(@RequestBody User user, UriComponentsBuilder ucBuilder) {
        System.out.println("Creating User " + user.getFirstName());
// USE THIS IF YOU WANT TO CHECK UNIQUE OBJECT
// if (SubjectService.isSubjectExist(Subject)) {
// System.out.println("A Subject with name " + Subject.getName() + " already exist");
// return new ResponseEntity<Void>(HttpStatus.CONFLICT);
// }
        service.save(user);
        HttpHeaders headers = new HttpHeaders();
        headers.setLocation(ucBuilder.path("/subject/{id}").buildAndExpand(user.getId()).toUri());
        return new ResponseEntity<Void>(headers, HttpStatus.CREATED);
    }
    //------------------- Update a User --------------------------------------------------------
    @RequestMapping(value = "/user/update/{id}", method = RequestMethod.PUT)
    public ResponseEntity<User> updateUser(@PathVariable("id") long id, @RequestBody User User) {
        System.out.println("Updating User " + id);
        User currentUser = service.findById(id);
        if (currentUser==null) {
            System.out.println("User with id " + id + " not found");
            return new ResponseEntity<User>(HttpStatus.NOT_FOUND);
        }
        User updatedUser = new User
                .Builder(currentUser.getId())
                .copy(currentUser)
                .build();
        service.update(updatedUser);
        return new ResponseEntity<User>(updatedUser, HttpStatus.OK);
    }
    //------------------- Delete a Subject --------------------------------------------------------
    @RequestMapping(value = "/user/delete/{id}", method = RequestMethod.DELETE)
    public ResponseEntity<User> deleteUser(@PathVariable("id") long id) {
        System.out.println("Fetching & Deleting User with id " + id);
        User user = service.findById(id);
        if (user == null) {
            System.out.println("Unable to delete. User with id " + id + " not found");
            return new ResponseEntity<User>(HttpStatus.NOT_FOUND);
        }
        service.delete(user);
        return new ResponseEntity<User>(HttpStatus.NO_CONTENT);
    }
}
