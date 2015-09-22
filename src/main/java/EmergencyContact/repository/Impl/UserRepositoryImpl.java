package EmergencyContact.repository.Impl;

import EmergencyContact.domain.User;
import EmergencyContact.repository.UserRepository;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

/**
 * Created by graham on 2015/09/22.
 */
public class UserRepositoryImpl implements UserRepository{
    Map<String, User> lists = new HashMap<>();

    public UserRepositoryImpl(){

    }

    @Override
    public User findById(String s){
        return lists.get(s);
    }

    @Override
    public User save(User entity){
        return lists.put(entity.getId(), entity);
    }

    @Override
    public User update(User entity){
        return lists.put(entity.getId(), entity);
    }

    @Override
    public void delete(User entity){
        lists.remove(entity.getId());
    }

    @Override
    public void delete(Iterable<? extends User> iterable) {

    }

    @Override
    public void deleteAll() {

    }

    @Override
    public <S extends User> Iterable<S> save(Iterable<S> iterable) {
        return null;
    }

    @Override
    public User findOne(String s) {
        return null;
    }

    @Override
    public boolean exists(String s) {
        return false;
    }

    @Override
    public Set<User> findAll(){
        Set<User> set = new HashSet<>();
        for(Map.Entry<String, User> entry : lists.entrySet()){
            set.add(entry.getValue());
        }
        return set;
    }

    @Override
    public Iterable<User> findAll(Iterable<String> iterable) {
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
