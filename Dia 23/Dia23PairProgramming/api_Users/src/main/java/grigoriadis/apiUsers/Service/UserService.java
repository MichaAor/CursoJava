package grigoriadis.apiUsers.Service;

import grigoriadis.apiUsers.Model.User;
import grigoriadis.apiUsers.Repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;

@Service
public class UserService {
    @Autowired
    UserRepository ur;
    public ArrayList<User> findAll() { return (ArrayList<User>) ur.findAll(); }
    public User findById(long id) { return ur.findById(id); }
    public User findByDni(long dni) { return ur.findByDni(dni); }
    public void update(User nUser) {
        User user=findById(nUser.getId());
        user.setDni(nUser.getDni());
        user.setLastName(nUser.getLastName());
        user.setName(nUser.getName());
        user.setPhNumber(nUser.getPhNumber());
        ur.save(user);
    }
    public void delete(User user) { ur.delete(user); }

    public void save(User nUser) { ur.save(nUser); }
}
