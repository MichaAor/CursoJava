package com.bootcamp.Dia12_ChallengeAlgoritmo.Repository;

import com.bootcamp.Dia12_ChallengeAlgoritmo.Model.UserModel;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

import java.util.ArrayList;

@Repository
public interface UserRepository extends MongoRepository<UserModel,String> {
    ArrayList<UserModel> getUsersByName(String name);

}
