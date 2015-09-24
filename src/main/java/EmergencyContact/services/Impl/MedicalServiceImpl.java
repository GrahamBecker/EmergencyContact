package EmergencyContact.services.Impl;

import EmergencyContact.domain.Medical;
import EmergencyContact.repository.MedicalRepository;
import EmergencyContact.services.MedicalService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;
import java.util.Set;

/**
 * Created by graham on 2015/09/22.
 */
@Service
public class MedicalServiceImpl implements MedicalService{

    @Autowired
    private MedicalRepository repo;
    //private final MedicalRepository repo = new MedicalRepositroyImpl();


    @Override
    public Medical findById(Long id) {
        return repo.findById(id);
    }

    @Override
    public Medical save(Medical entity){
        return repo.save(entity);
    }
    @Override
    public Medical update(Medical entity){
        return repo.save(entity);
    }
    @Override
    public void delete(Medical entity){
        repo.delete(entity);
    }

    @Override
    public List<Medical> findAll(){
        List<Medical> allMedicals = new ArrayList<>();
        Iterable<Medical> medicals = repo.findAll();
        for(Medical medical : medicals){
            allMedicals.add(medical);
        }
        return allMedicals;
    }
}
