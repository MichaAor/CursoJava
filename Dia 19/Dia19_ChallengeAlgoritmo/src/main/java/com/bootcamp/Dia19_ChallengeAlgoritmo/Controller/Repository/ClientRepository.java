package com.bootcamp.Dia19_ChallengeAlgoritmo.Controller.Repository;

import com.bootcamp.Dia19_ChallengeAlgoritmo.Model.Client;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ClientRepository extends MongoRepository<Client,String> {
    Client getClientByDni(String dni);
}
