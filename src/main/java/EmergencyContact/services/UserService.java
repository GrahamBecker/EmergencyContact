package EmergencyContact.services;

import EmergencyContact.domain.Medical;
import EmergencyContact.domain.NextOfKin;
import EmergencyContact.domain.User;

import java.util.List;

/**
 * Created by graham on 2015/09/20.
 */
public interface UserService {
    List<User> getAllUsers();
    List<NextOfKin> getAllNextOfKin();
    List<Medical> getAllMedical();
}
