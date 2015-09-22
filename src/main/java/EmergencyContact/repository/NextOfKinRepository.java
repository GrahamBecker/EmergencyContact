package EmergencyContact.repository;

import EmergencyContact.domain.NextOfKin;
import org.springframework.data.repository.CrudRepository;

/**
 * Created by graham on 2015/09/20.
 */
public interface NextOfKinRepository extends CrudRepository<NextOfKin,Long> {

    NextOfKin findById(Long s);

    NextOfKin update(NextOfKin entity);

    Iterable<NextOfKin> findAll(Iterable<Long> iterable);

    void delete(Long s);
}
