package com.bootcamp.Dia12_ChallengeAlgoritmo.Controller;

import com.bootcamp.Dia12_ChallengeAlgoritmo.Model.UserModel;
import com.bootcamp.Dia12_ChallengeAlgoritmo.Service.UserService;
import org.apache.catalina.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import javax.swing.text.html.Option;
import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/users")
public class UserController {
    @Autowired
    UserService userService;

        @GetMapping
        public ResponseEntity<List<UserModel>> getAllUsers() {
            return userService.getAllUser();
        }


        @GetMapping("/{dni}")
        public ResponseEntity<Optional<UserModel>> getUserByDni(@PathVariable String dni) {
            return userService.getUserByDni(dni);
        }

        @PostMapping()
        public ResponseEntity<UserModel> createUser(@RequestBody UserModel userBody) {
            return userService.createUser(userBody);
        }

        @PutMapping()
        public ResponseEntity<UserModel> modifyUser(@RequestBody UserModel userBody) {
            return userService.createUser(userBody);
        }

        @DeleteMapping("/{dni}")
        public ResponseEntity deleteUser(@PathVariable String dni){
            return userService.deleteUserByDni(dni);
        }

    }