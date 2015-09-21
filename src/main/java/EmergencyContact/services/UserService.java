package EmergencyContact.services;

import EmergencyContact.domain.Medical;
import EmergencyContact.domain.NextOfKin;

import java.util.List;

/**
 * Created by graham on 2015/09/20.
 */
public interface UserService {
    List<NextOfKin> getAllNextOfKin();
    List<Medical> getAllMedical();
}
