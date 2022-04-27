package com.Bootcamp.Dia15_ChallengeAlgoritmo.Controller;

import com.Bootcamp.Dia15_ChallengeAlgoritmo.Model.UserModel;
import com.Bootcamp.Dia15_ChallengeAlgoritmo.Request.LoginRequest;
import com.Bootcamp.Dia15_ChallengeAlgoritmo.Service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/users/auth")
public class AuthController {
       @Autowired
       UserService userService;

        @GetMapping("/login")
        public ResponseEntity<?> loginUser(@RequestBody LoginRequest loginRequest){
            return userService.validationLogin(loginRequest.getEmail(),loginRequest.getPassword());
        }

        @PostMapping("/register")
        public ResponseEntity<UserModel> registerUser(@RequestBody UserModel userBody) {
            return userService.registerUser(userBody);
        }

}


