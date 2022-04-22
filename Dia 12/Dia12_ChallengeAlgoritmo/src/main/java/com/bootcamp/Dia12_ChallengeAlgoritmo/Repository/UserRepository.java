package com.bootcamp.Dia12_ChallengeAlgoritmo.Repository;

import com.bootcamp.Dia12_ChallengeAlgoritmo.Model.UserModel;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface UserRepository extends MongoRepository<UserModel,String> {
}
