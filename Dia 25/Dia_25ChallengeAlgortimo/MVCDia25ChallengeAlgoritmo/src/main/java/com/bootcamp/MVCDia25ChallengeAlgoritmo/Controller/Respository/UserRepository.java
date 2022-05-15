package com.bootcamp.MVCDia25ChallengeAlgoritmo.Controller.Respository;


import com.bootcamp.MVCDia25ChallengeAlgoritmo.Model.User;
import org.springframework.stereotype.Repository;
import org.springframework.web.client.RestTemplate;

import java.util.ArrayList;

@Repository
public class UserRepository{

    public ArrayList<User> getAllUsers(){
        RestTemplate rt = new RestTemplate();
        String url = "http://localhost:8081/users";
        ArrayList<User> users = rt.getForObject(url,ArrayList.class);
        return users;
    }

    public User getUserByEmail(String email){
        RestTemplate rt = new RestTemplate();
        String url = "http://localhost:8081/users/"+email;
        User cliente = rt.getForObject(url,User.class);
        return cliente;
    }

    public void saveUser(User user){
        RestTemplate rt = new RestTemplate();
        String url = "http://localhost:8081/users";
        rt.postForObject(url,user,User.class);
    }

    public void deleteUser(String email){
        String url = "http://localhost:8081/users/delete/"+email;
        RestTemplate rt = new RestTemplate();
        rt.delete(url);
    }

    public void modifyUser(User user,String email){
        String url = "http://localhost:8081/users/update/"+email;
        RestTemplate rt = new RestTemplate();
        rt.postForObject(url,user,User.class);
    }
}
