package com.Bootcamp.Dia15_ChallengeAlgoritmo.Respository;

import com.Bootcamp.Dia15_ChallengeAlgoritmo.Model.ProductModel;
import org.springframework.data.mongodb.repository.MongoRepository;

import java.util.ArrayList;

public interface ProductRepository extends MongoRepository<ProductModel,String> {
    ArrayList<ProductModel> getProductsByName(String name);
}
