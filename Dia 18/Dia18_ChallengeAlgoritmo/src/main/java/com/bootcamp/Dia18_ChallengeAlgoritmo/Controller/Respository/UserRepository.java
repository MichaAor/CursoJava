package com.bootcamp.Dia18_ChallengeAlgoritmo.Controller.Respository;

import com.bootcamp.Dia18_ChallengeAlgoritmo.Model.User;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface UserRepository extends JpaRepository<User,String> {
    //Optional<User> getUserByEmail(String email);
    User getUserByEmail(String email);
}
