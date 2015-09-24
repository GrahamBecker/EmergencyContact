package EmergencyContact.services.Impl;

import EmergencyContact.domain.NextOfKin;
import EmergencyContact.domain.User;
import EmergencyContact.repository.UserRepository;
import EmergencyContact.services.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;
import java.util.Set;

/**
 * Created by graham on 2015/09/20.
 */
@Service
public class UserServiceImpl implements UserService{

    @Autowired
    private UserRepository repo;
    //private final UserRepository repo = new UserRepositoryImpl();


    @Override
    public User findById(Long id) {
        return repo.findById(id);
    }
    @Override
    public User save(User entity){
        return repo.save(entity);
    }
    @Override
    public User update(User entity){
        return repo.save(entity);
    }
    @Override
    public void delete(User entity){
        repo.delete(entity);
    }
 //   @Override
 //   public Set<User> findAll(){
 //       return (Set<User>) repo.findAll();
 //   }

    @Override
    public List<User> findAll(){
        List<User> allUsers = new ArrayList<>();
        Iterable<User> users = repo.findAll();
        for(User user : users){
            allUsers.add(user);
        }
        return allUsers;
    }


}

