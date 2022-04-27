package com.Bootcamp.Dia16_ChallengeAlgoritmo.Service;

import com.Bootcamp.Dia16_ChallengeAlgoritmo.Model.UserModel;
import com.Bootcamp.Dia16_ChallengeAlgoritmo.Respository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.Optional;

@Service
public class UserService implements UserDetailsService {
    @Autowired
    private UserRepository userRepository;

    @Autowired
    PasswordEncoder bcryptEncoder;

    public ResponseEntity<ArrayList<UserModel>> getAllUsers(){
        try {
            ArrayList<UserModel> users = new ArrayList<UserModel>();
            userRepository.findAll().forEach(users::add);
            if (users.isEmpty()) {
                return new ResponseEntity<>(HttpStatus.NO_CONTENT);
            }
            return new ResponseEntity<>(users, HttpStatus.OK);
        } catch (Exception e) {
            return new ResponseEntity<>(HttpStatus.INTERNAL_SERVER_ERROR);
        }
    }

    public ResponseEntity<Optional<UserModel>>getUserByEmail(String email) {
        try {
            Optional<UserModel> user = userRepository.getUserByEmail(email);
            if (user.isEmpty()) {
                return new ResponseEntity<>(HttpStatus.NO_CONTENT);
            }
            return new ResponseEntity<>(user, HttpStatus.OK);
        } catch (Exception e) {
            return new ResponseEntity<>(null,HttpStatus.INTERNAL_SERVER_ERROR);
        }
    }

    public ResponseEntity<ArrayList<UserModel>> getUsersByName(String name) {
        try {
            ArrayList<UserModel> user = userRepository.getUsersByName(name);
            if (user.isEmpty()) {
                return new ResponseEntity<>(HttpStatus.NO_CONTENT);
            }
            return new ResponseEntity<>(user, HttpStatus.OK);
        } catch (Exception e) {
            return new ResponseEntity<>(null,HttpStatus.INTERNAL_SERVER_ERROR);
        }
    }

    public ResponseEntity<UserModel> registerUser(UserModel userBody) {
        try {
            if(userRepository.findByEmail(userBody.getEmail()) != null){
                return new ResponseEntity<>(HttpStatus.NOT_ACCEPTABLE);
            }
            userBody.setPassword(bcryptEncoder.encode(userBody.getPassword()));
            UserModel user = userRepository.save(userBody);
            return new ResponseEntity<>(user, HttpStatus.OK);
        } catch (Exception e) {
            return new ResponseEntity<>(null,HttpStatus.INTERNAL_SERVER_ERROR);
        }
    }

    public ResponseEntity deleteUserByEmail(String email) {
        try {
            userRepository.deleteById(email);
            Optional<UserModel> user = userRepository.findById(email);
            if (user.isEmpty()) {
                return new ResponseEntity<>(HttpStatus.NO_CONTENT);
            }
            return new ResponseEntity<>(user, HttpStatus.OK);
        } catch (Exception e) {
            return new ResponseEntity<>(HttpStatus.INTERNAL_SERVER_ERROR);
        }
    }

    public ResponseEntity validationLogin(String email, String password){
            if(this.getUserByEmail(email) !=null) {
                UserModel userModel = userRepository.findByEmail(email);
                if (userModel.getPassword().compareTo(password) == 0) {
                    return new ResponseEntity<>(HttpStatus.OK);
                }
            }
        return new ResponseEntity<>(HttpStatus.NOT_ACCEPTABLE);
    }

    @Override
    public UserDetails loadUserByUsername(String email) throws UsernameNotFoundException {
        UserModel users = userRepository.findByEmail(email);
        if (users == null) {
            throw new UsernameNotFoundException("El email no existe " + email);
        }
        return new org.springframework.security.core.userdetails.User(users.getEmail(), users.getPassword(),
                new ArrayList<>());
    }


}
