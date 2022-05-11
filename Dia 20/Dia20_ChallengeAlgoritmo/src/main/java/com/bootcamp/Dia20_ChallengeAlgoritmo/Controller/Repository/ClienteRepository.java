package com.bootcamp.Dia20_ChallengeAlgoritmo.Controller.Repository;

import com.bootcamp.Dia20_ChallengeAlgoritmo.Model.Cliente;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

import java.util.ArrayList;

@Repository
public interface ClienteRepository extends MongoRepository<Cliente,String> {
    ArrayList<Cliente> getClienteByNombre(String nombre;
}
