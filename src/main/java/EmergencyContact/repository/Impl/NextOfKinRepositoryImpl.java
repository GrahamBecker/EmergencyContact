package EmergencyContact.repository.Impl;

import EmergencyContact.domain.NextOfKin;
import EmergencyContact.repository.NextOfKinRepository;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

/**
 * Created by graham on 2015/09/22.
 */
public class NextOfKinRepositoryImpl implements NextOfKinRepository {
    Map<String, NextOfKin> lists = new HashMap<>();

    public NextOfKinRepositoryImpl(){

    }

    @Override
    public NextOfKin findById(String s){
        return lists.get(s);
    }

    @Override
    public NextOfKin save(NextOfKin entity){
        return lists.put(entity.getId(), entity);
    }

    @Override
    public NextOfKin update(NextOfKin entity){
        return lists.put(entity.getId(), entity);
    }

    @Override
    public void delete(NextOfKin entity){
        lists.remove(entity.getId());
    }

    @Override
    public void delete(Iterable<? extends NextOfKin> iterable) {

    }

    @Override
    public void deleteAll() {

    }

    @Override
    public <S extends NextOfKin> Iterable<S> save(Iterable<S> iterable) {
        return null;
    }

    @Override
    public NextOfKin findOne(String s) {
        return null;
    }

    @Override
    public boolean exists(String s) {
        return false;
    }

    @Override
    public Set<NextOfKin> findAll(){
        Set<NextOfKin> set = new HashSet<>();
        for(Map.Entry<String, NextOfKin> entry : lists.entrySet()){
            set.add(entry.getValue());
        }
        return set;
    }

    @Override
    public Iterable<NextOfKin> findAll(Iterable<String> iterable) {
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
