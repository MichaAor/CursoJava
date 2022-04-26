package com.Bootcamp.Dia15_ChallengeAlgoritmo.Respository;

import com.Bootcamp.Dia15_ChallengeAlgoritmo.Model.UserModel;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

import java.util.ArrayList;
import java.util.Optional;

@Repository
public interface UserRepository extends MongoRepository<UserModel,String> {
    ArrayList<UserModel> getUsersByName(String name);
    Optional<UserModel> getUserByEmail(String email);
    UserModel findByEmail(String email);
}
