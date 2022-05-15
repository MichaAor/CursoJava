package com.bootcamp.APIDia24ChallengeAlgoritmo.Respository;

import com.bootcamp.APIDia24ChallengeAlgoritmo.Model.User;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface UserRepository extends JpaRepository<User,String> {
    User getUserByEmail(String email);
}
