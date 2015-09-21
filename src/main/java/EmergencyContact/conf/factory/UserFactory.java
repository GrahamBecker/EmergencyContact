package EmergencyContact.conf.factory;

import EmergencyContact.domain.User;

import java.util.Map;

/**
 * Created by graham on 2015/09/20.
 */
public class UserFactory {

    public static User createUser(Map<String,String> values){

        User user = new User
                .Builder(values.get("lastName"))
                .firstName(values.get("firstName"))
                .dob(values.get("dob"))
                .address(values.get("address"))
                .contact(values.get("contact"))
                .build();
        return user;
    }


}
