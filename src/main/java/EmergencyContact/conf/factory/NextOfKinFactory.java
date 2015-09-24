package EmergencyContact.conf.factory;

import EmergencyContact.domain.NextOfKin;

/**
 * Created by graham on 2015/09/20.
 */
public class NextOfKinFactory {
    public static NextOfKin createNextOfKin(Long id, String firstName, String lastName, String relationship, String contact){

        NextOfKin nok = new NextOfKin
                .Builder(id)
                .lastName(lastName)
                .firstName(firstName)
                .relationship(relationship)
                .contact(contact)
                .build();
        return nok;
    }
}
