package com.bootcamp.Dia17_ChallengeAlgoritmo.Respository;

import com.bootcamp.Dia17_ChallengeAlgoritmo.Model.MateriaModel;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface MateriaRepository extends CrudRepository<MateriaModel,String> {
}
