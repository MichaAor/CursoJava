package com.Bootcamp.Dia15_ChallengeAlgoritmo.Respository;

import com.Bootcamp.Dia15_ChallengeAlgoritmo.Model.CustomerModel;
import org.springframework.data.mongodb.repository.MongoRepository;

import java.util.ArrayList;

public interface CustomerRepository extends MongoRepository<CustomerModel,String> {
    ArrayList<CustomerModel> getCustomersByName(String name);
}
