package com.bootcamp.Dia22_ChallengeAlgoritmo.Controller.Service;

import com.bootcamp.Dia22_ChallengeAlgoritmo.Controller.Respository.UserRepository;
import com.bootcamp.Dia22_ChallengeAlgoritmo.Model.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.Optional;

@Service
public class UserService{
    @Autowired
    private UserRepository userRepository;

    public ResponseEntity<ArrayList<User>> getAllUsers(){
        try {
            ArrayList<User> users = new ArrayList<User>();
            userRepository.findAll().forEach(users::add);
            if (users.isEmpty()) {
                return new ResponseEntity<>(HttpStatus.NO_CONTENT);
            }
            return new ResponseEntity<>(users, HttpStatus.OK);
        } catch (Exception e) {
            return new ResponseEntity<>(HttpStatus.INTERNAL_SERVER_ERROR);
        }
    }

    public ResponseEntity<Optional<User>>getUserByEmail(String email) {
        try {
            Optional<User> user = userRepository.getUserByEmail(email);
            if (user.isEmpty()) {
                return new ResponseEntity<>(HttpStatus.NO_CONTENT);
            }
            return new ResponseEntity<>(user, HttpStatus.OK);
        } catch (Exception e) {
            return new ResponseEntity<>(null,HttpStatus.INTERNAL_SERVER_ERROR);
        }
    }

    public ResponseEntity<User> registerUser(User userBody) {
        try {
            if(userRepository.findByEmail(userBody.getEmail()) != null){
                return new ResponseEntity<>(HttpStatus.NOT_ACCEPTABLE);
            }
                userRepository.save(userBody);
            return new ResponseEntity<>(userBody, HttpStatus.OK);
        } catch (Exception e) {
            return new ResponseEntity<>(null,HttpStatus.INTERNAL_SERVER_ERROR);
        }
    }

    public ResponseEntity deleteUserByEmail(String email) {
        try {
            userRepository.deleteById(email);
            Optional<User> user = userRepository.findById(email);
            if (!user.isEmpty()) {
                return new ResponseEntity<>(HttpStatus.INTERNAL_SERVER_ERROR);
            }
            return new ResponseEntity<>(user, HttpStatus.OK);
        } catch (Exception e) {
            return new ResponseEntity<>(HttpStatus.INTERNAL_SERVER_ERROR);
        }
    }
}
