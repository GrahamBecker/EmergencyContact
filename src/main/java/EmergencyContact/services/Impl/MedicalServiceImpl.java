package EmergencyContact.services.Impl;

import EmergencyContact.domain.Medical;
import EmergencyContact.repository.Impl.MedicalRepositroyImpl;
import EmergencyContact.repository.MedicalRepository;
import EmergencyContact.services.MedicalService;

import java.util.Set;

/**
 * Created by graham on 2015/09/22.
 */
public class MedicalServiceImpl implements MedicalService{

    private final MedicalRepository repo = new MedicalRepositroyImpl();


    @Override
    public Medical findById(Long s) {
        return repo.findById(s);
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
    public Set<Medical> findAll(){
        return (Set<Medical>) repo.findAll();
    }
}
