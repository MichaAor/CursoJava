package com.bootcamp.Dia18_ChallengeAlgoritmo.Controller.Respository;

import com.bootcamp.Dia18_ChallengeAlgoritmo.Model.User;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import java.util.Optional;

@Repository
public interface UserRepository extends CrudRepository<User,String> {
    Optional<User> getUserByEmail(String email);
    User findByEmail(String email);
}
