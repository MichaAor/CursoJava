package com.bootcamp.Dia18_ChallengeAlgoritmo.Controller;

import com.bootcamp.Dia18_ChallengeAlgoritmo.Controller.Service.UserService;
import com.bootcamp.Dia18_ChallengeAlgoritmo.Model.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.Optional;

@RestController
@RequestMapping("/users")
//@Api(value = "Controller Users")
public class UserController {
    @Autowired
    UserService userService;

    @GetMapping
    public ResponseEntity<ArrayList<User>> getAllUsers() {
        return userService.getAllUsers();
    }

    @GetMapping("/user/{email}")
    public ResponseEntity<Optional<User>> getUserByEmail(@PathVariable("email") String email) {
        if(email == null){
            return new ResponseEntity<>(HttpStatus.NOT_ACCEPTABLE);
        }
        return userService.getUserByEmail(email);
    }

    @PostMapping("/user")
    public ResponseEntity<User> registerUser(@RequestBody User userBody) {
        return userService.registerUser(userBody);
    }

    @PutMapping("/user")
    public ResponseEntity<User> modifyUser(@RequestBody User userBody) {
        return userService.registerUser(userBody);
    }

    @DeleteMapping("/user/{email}")
    public ResponseEntity deleteUser(@PathVariable("email") String email){
        if(email == null){
            return new ResponseEntity<>(HttpStatus.NOT_ACCEPTABLE);
        }
        return userService.deleteUserByEmail(email);
    }
}
