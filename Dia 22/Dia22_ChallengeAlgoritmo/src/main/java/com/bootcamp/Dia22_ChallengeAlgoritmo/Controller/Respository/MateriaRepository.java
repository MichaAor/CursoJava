package com.bootcamp.Dia22_ChallengeAlgoritmo.Controller.Respository;

import com.bootcamp.Dia22_ChallengeAlgoritmo.Model.Materia;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface MateriaRepository extends CrudRepository<Materia,String> {
    Materia findMateriaByCodMateria(String codMateria);
}
