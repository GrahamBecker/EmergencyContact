package EmergencyContact.services;

import java.util.List;
import java.util.Set;

/**
 * Created by graham on 2015/09/22.
 */
public interface Services<S,ID> {

    public S findById(ID id);

    public S save(S entity);

    public S update(S entity);

    public void delete(S entity);

    public List<S> findAll();
}
