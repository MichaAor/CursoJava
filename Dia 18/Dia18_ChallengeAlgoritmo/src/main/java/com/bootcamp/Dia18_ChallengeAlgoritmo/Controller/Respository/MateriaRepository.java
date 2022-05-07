package com.bootcamp.Dia18_ChallengeAlgoritmo.Controller.Respository;

import com.bootcamp.Dia18_ChallengeAlgoritmo.Model.Materia;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface MateriaRepository extends JpaRepository<Materia,String> {
    Materia getMateriaByCodMat(String codMat);
}
