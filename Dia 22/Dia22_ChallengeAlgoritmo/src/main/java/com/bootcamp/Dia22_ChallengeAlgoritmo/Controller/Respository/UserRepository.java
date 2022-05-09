package com.bootcamp.Dia22_ChallengeAlgoritmo.Controller.Respository;

import com.bootcamp.Dia22_ChallengeAlgoritmo.Model.User;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface UserRepository extends JpaRepository<User,String> {
    User getUserByEmail(String email);
}
