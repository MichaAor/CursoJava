package com.aviones.repository;

import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

import com.aviones.models.AvionModel;

@Repository
public interface AvionesRepository extends MongoRepository<AvionModel, String>{

}
