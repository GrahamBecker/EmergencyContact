package EmergencyContact.repository;

import java.util.Set;

/**
 * Created by graham on 2015/09/22.
 */
public interface CrudRepository<S, ID> {

    public S findById(ID id);

    public S save(S entity);

    public S update(S entity);

    public void delete(S entity);

    public Set<S> findAll();
}
