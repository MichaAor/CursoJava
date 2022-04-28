package com.bootcamp.Dia17_ChallengeAlgoritmo.Respository;

import com.bootcamp.Dia17_ChallengeAlgoritmo.Model.UserModel;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import java.util.ArrayList;
import java.util.Optional;

@Repository
public interface UserRepository extends CrudRepository<UserModel,String> {
    ArrayList<UserModel> getUsersByName(String name);
    Optional<UserModel> getUserByEmail(String email);
    UserModel findByEmail(String email);
}
