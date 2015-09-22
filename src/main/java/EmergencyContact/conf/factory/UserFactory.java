package EmergencyContact.conf.factory;

import EmergencyContact.domain.User;

import java.util.Map;

/**
 * Created by graham on 2015/09/20.
 */
public class UserFactory {

    public static User createUser(Long id, String firstname, String lastname, String dob, String address, String contact) {

        User user = new User
                .Builder(id)
                .firstName(firstname)
                .lastName(lastname)
                .dob(dob)
                .address(address)
                .contact(contact)
                .build();
        return user;
    }


}
