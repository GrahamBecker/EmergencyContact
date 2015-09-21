package EmergencyContact.repository;

import EmergencyContact.domain.User;
import org.springframework.data.repository.CrudRepository;

/**
 * Created by graham on 2015/09/20.
 */
public interface UserRepository extends CrudRepository<User, Long> {
}
