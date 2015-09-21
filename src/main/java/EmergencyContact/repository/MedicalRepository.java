package EmergencyContact.repository;

import EmergencyContact.domain.Medical;
import org.springframework.data.repository.CrudRepository;

/**
 * Created by graham on 2015/09/20.
 */
public interface MedicalRepository extends CrudRepository<Medical, Long> {
}
