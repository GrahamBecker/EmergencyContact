package EmergencyContact.services.Impl;

import EmergencyContact.domain.NextOfKin;
import EmergencyContact.repository.NextOfKinRepository;
import EmergencyContact.services.NextOfKinService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;
import java.util.Set;

/**
 * Created by graham on 2015/09/22.
 */
@Service
public class NextOfKinServiceImpl implements NextOfKinService {

    @Autowired
    private NextOfKinRepository repo;
   // private final NextOfKinRepository repo = new NextOfKinRepositoryImpl();


    @Override
    public NextOfKin findById(Long id) {
        return repo.findById(id);
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
    public List<NextOfKin> findAll(){
        List<NextOfKin> allNextOfKins = new ArrayList<>();
        Iterable<NextOfKin> nextOfKins = repo.findAll();
        for(NextOfKin nextOfKin : nextOfKins){
            allNextOfKins.add(nextOfKin);
        }
        return allNextOfKins;
    }
}
