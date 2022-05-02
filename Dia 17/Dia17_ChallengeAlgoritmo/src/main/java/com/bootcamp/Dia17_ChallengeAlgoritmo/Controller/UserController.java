package com.bootcamp.Dia17_ChallengeAlgoritmo.Controller;

import com.bootcamp.Dia17_ChallengeAlgoritmo.Model.UserModel;
import com.bootcamp.Dia17_ChallengeAlgoritmo.Service.UserService;
import io.swagger.annotations.Api;
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
    public ResponseEntity<ArrayList<UserModel>> getAllUsers() {
        return userService.getAllUsers();
    }

    @GetMapping("/user/{email}")
    public ResponseEntity<Optional<UserModel>> getUserByEmail(@PathVariable("email") String email) {
        if(email == null){
            return new ResponseEntity<>(HttpStatus.NOT_ACCEPTABLE);
        }
        return userService.getUserByEmail(email);
    }

    @PostMapping("/user")
    public ResponseEntity<UserModel> registerUser(@RequestBody UserModel userBody) {
        return userService.registerUser(userBody);
    }

    @PutMapping("/user")
    public ResponseEntity<UserModel> modifyUser(@RequestBody UserModel userBody) {
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
