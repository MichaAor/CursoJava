package grigoriadis.apiUsers.Controllers;

import grigoriadis.apiUsers.Model.User;
import grigoriadis.apiUsers.Service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;

@RestController
@RequestMapping("/users")
public class UserController {
    @Autowired
    UserService us;

    @GetMapping
    public ResponseEntity<ArrayList<User>> findAll(){
        try{
            ArrayList<User> users=us.findAll();
            if(users.isEmpty()) return new ResponseEntity<>(null, HttpStatus.BAD_REQUEST);
            return new ResponseEntity<>(users, HttpStatus.OK);
        }catch (Exception e){ return new ResponseEntity<>(null, HttpStatus.INTERNAL_SERVER_ERROR); }
    }
    @GetMapping("/{id}")
    public ResponseEntity<User> findById(@PathVariable("id") long id){
        try{
            User user= us.findById(id);
            if(user!=null) return new ResponseEntity<>(user, HttpStatus.OK);
                return new ResponseEntity<>(null, HttpStatus.BAD_REQUEST);
        }catch (Exception e){ return new ResponseEntity<>(null, HttpStatus.INTERNAL_SERVER_ERROR); }
    }
    @GetMapping("/dni/{dni}")
    public ResponseEntity<User> findByDni(@PathVariable("dni") long dni){
        try{
            User user= us.findByDni(dni);
            if(user!=null) return new ResponseEntity<>(user, HttpStatus.OK);
            return new ResponseEntity<>(null, HttpStatus.BAD_REQUEST);
        }catch (Exception e){ return new ResponseEntity<>(null, HttpStatus.INTERNAL_SERVER_ERROR); }
    }
    @PostMapping
    public ResponseEntity<User> save(@RequestBody User nUser){
        try{
            if(nUser!=null) { us.save(nUser); return new ResponseEntity<>(nUser, HttpStatus.OK); }
                return new ResponseEntity<>(null, HttpStatus.BAD_REQUEST);
        }catch (Exception e){ return new ResponseEntity<>(null, HttpStatus.INTERNAL_SERVER_ERROR); }
    }
    @PutMapping
    public ResponseEntity<User> update(@RequestBody User upUser){
        try{
            if(us.findById(upUser.getId())!=null){ us.update(upUser); return new ResponseEntity<>(upUser, HttpStatus.OK);}
            return new ResponseEntity<>(null, HttpStatus.BAD_REQUEST);
        }catch (Exception e){ return new ResponseEntity<>(null, HttpStatus.INTERNAL_SERVER_ERROR); }
    }
    @DeleteMapping("/{id}")
    public ResponseEntity<User> delete(@PathVariable("id")long id){
        try{
            User user=us.findById(id);
            if(user!=null) { us.delete(user); return new ResponseEntity<>(user, HttpStatus.OK); }
            return new ResponseEntity<>(null, HttpStatus.BAD_REQUEST);
        }catch (Exception e){ return new ResponseEntity<>(null, HttpStatus.INTERNAL_SERVER_ERROR); }
    }
}
