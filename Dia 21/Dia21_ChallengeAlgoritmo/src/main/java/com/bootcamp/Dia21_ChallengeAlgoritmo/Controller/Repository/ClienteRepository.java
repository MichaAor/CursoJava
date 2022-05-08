package com.bootcamp.Dia21_ChallengeAlgoritmo.Controller.Repository;

import com.bootcamp.Dia21_ChallengeAlgoritmo.Model.Cliente;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ClienteRepository extends MongoRepository<Cliente,String> {
}
