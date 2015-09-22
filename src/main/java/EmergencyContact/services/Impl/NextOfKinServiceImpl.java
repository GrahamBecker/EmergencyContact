package EmergencyContact.services.Impl;

import EmergencyContact.domain.NextOfKin;
import EmergencyContact.repository.Impl.NextOfKinRepositoryImpl;
import EmergencyContact.repository.NextOfKinRepository;
import EmergencyContact.services.NextOfKinService;

import java.util.Set;

/**
 * Created by graham on 2015/09/22.
 */
public class NextOfKinServiceImpl implements NextOfKinService {
    private final NextOfKinRepository repo = new NextOfKinRepositoryImpl();


    @Override
    public NextOfKin findById(String s) {
        return repo.findById(s);
    }
    @Override
    public NextOfKin save(NextOfKin entity){
        return repo.save(entity);
    }
    @Override
    public NextOfKin update(NextOfKin entity){
        return repo.save(entity);
    }
    @Override
    public void delete(NextOfKin entity){
        repo.delete(entity);
    }
    @Override
    public Set<NextOfKin> findAll(){
        return (Set<NextOfKin>) repo.findAll();
    }
}
