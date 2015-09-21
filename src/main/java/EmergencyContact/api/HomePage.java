package EmergencyContact.api;


import EmergencyContact.domain.User;
import EmergencyContact.services.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;
import java.util.List;

/**
 * Created by graham on 2015/09/20.
 */

@RestController
@RequestMapping("/api/**")
public class HomePage {
    @Autowired
    private UserService service;
    @RequestMapping(value = "home",method = RequestMethod.GET)
    public String Index(){
        return "This is a Home Page";
    }
    @RequestMapping(value = "/course",method = RequestMethod.GET)
    public User getUser(){
        User user = new User.Builder("Becker")
                .firstName("Graham")
                .id("ICE001")
                .dob("20/11/1984")
                .address("15 Oranje Street")
                .build();
        return user;
    }
    @RequestMapping(value = "users", method = RequestMethod.GET)
    public List<User> getUsers(){
        return service.getAllUsers();
    }
}
