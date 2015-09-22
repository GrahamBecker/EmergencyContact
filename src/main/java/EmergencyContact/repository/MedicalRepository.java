package EmergencyContact.repository;

import EmergencyContact.domain.Medical;
import org.springframework.data.repository.CrudRepository;

/**
 * Created by graham on 2015/09/20.
 */
public interface MedicalRepository extends CrudRepository<Medical, Long> {

    Medical findById(Long s);

    Medical update(Medical entity);

    Iterable<Medical> findAll(Iterable<Long> iterable);

    void delete(Long s);
}
