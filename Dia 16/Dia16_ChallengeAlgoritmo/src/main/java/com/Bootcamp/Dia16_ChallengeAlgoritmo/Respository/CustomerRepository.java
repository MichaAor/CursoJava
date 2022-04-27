package com.Bootcamp.Dia16_ChallengeAlgoritmo.Respository;

import com.Bootcamp.Dia16_ChallengeAlgoritmo.Model.CustomerModel;
import org.springframework.data.mongodb.repository.MongoRepository;

import java.util.ArrayList;

public interface CustomerRepository extends MongoRepository<CustomerModel,String> {
    ArrayList<CustomerModel> getCustomersByName(String name);
}
