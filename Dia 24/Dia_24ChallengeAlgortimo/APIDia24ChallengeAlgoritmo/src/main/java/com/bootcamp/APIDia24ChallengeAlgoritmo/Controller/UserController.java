package com.bootcamp.APIDia24ChallengeAlgoritmo.Controller;

import com.bootcamp.APIDia24ChallengeAlgoritmo.Model.User;
import com.bootcamp.APIDia24ChallengeAlgoritmo.Service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;

@RestController
@RequestMapping("/users")
//@Api(value = "Controller Users")
public class UserController {
    @Autowired
    UserService us;

    @GetMapping
    public ArrayList<User> getAllUser() {
        return us.getAllUser();
    }

    @GetMapping("/{email}")
    public User getUserByEmail(@PathVariable("email") String email) {
        return us.getUserByEmail(email);
    }

    @PostMapping
    public void registerUser(@RequestBody User user) {
        us.registerUser(user);
    }


    @PutMapping("/update/{email}")
    public void modifyuUser(@RequestBody User user,
                              @PathVariable("email") String email){
        us.modifyUser(user,email);
    }

    @DeleteMapping("/delete/{email}")
    public void deleteUser(@PathVariable("email") String email){
        us.deleteUser(email);
    }
}
