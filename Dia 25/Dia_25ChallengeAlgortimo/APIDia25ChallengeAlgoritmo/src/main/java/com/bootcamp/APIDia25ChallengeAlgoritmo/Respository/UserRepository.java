package com.bootcamp.APIDia25ChallengeAlgoritmo.Respository;

import com.bootcamp.APIDia25ChallengeAlgoritmo.Model.User;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface UserRepository extends JpaRepository<User,String> {
    User getUserByEmail(String email);
}
