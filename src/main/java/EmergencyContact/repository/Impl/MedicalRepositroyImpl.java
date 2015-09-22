package EmergencyContact.repository.Impl;

import EmergencyContact.domain.Medical;
import EmergencyContact.repository.MedicalRepository;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

/**
 * Created by graham on 2015/09/22.
 */
public class MedicalRepositroyImpl implements MedicalRepository {
    Map<String, Medical> lists = new HashMap<>();

    public MedicalRepositroyImpl(){

    }

    @Override
    public Medical findById(String s){
        return lists.get(s);
    }

    @Override
    public Medical save(Medical entity){
        return lists.put(entity.getId(), entity);
    }

    @Override
    public Medical update(Medical entity){
        return lists.put(entity.getId(), entity);
    }

    @Override
    public void delete(Medical entity){
        lists.remove(entity.getId());
    }

    @Override
    public void delete(Iterable<? extends Medical> iterable) {

    }

    @Override
    public void deleteAll() {

    }

    @Override
    public <S extends Medical> Iterable<S> save(Iterable<S> iterable) {
        return null;
    }

    @Override
    public Medical findOne(String s) {
        return null;
    }

    @Override
    public boolean exists(String s) {
        return false;
    }

    @Override
    public Set<Medical> findAll(){
        Set<Medical> set = new HashSet<>();
        for(Map.Entry<String, Medical> entry : lists.entrySet()){
            set.add(entry.getValue());
        }
        return set;
    }

    @Override
    public Iterable<Medical> findAll(Iterable<String> iterable) {
        return null;
    }

    @Override
    public long count() {
        return 0;
    }

    @Override
    public void delete(String s) {

    }
}
