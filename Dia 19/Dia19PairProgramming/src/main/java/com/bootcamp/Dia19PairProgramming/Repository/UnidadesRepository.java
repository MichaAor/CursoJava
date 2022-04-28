package com.bootcamp.Dia19PairProgramming.Repository;

import com.bootcamp.Dia19PairProgramming.Model.Unidad;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface UnidadesRepository extends MongoRepository<Unidad,String> {
}
