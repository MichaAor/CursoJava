package com.bootcamp.Dia21_ChallengeAlgoritmo.Controller.Repository;

import com.bootcamp.Dia21_ChallengeAlgoritmo.Model.Client;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ClientRepository extends MongoRepository<Client,String> {
    Client getClientByDni(String dni);
}
