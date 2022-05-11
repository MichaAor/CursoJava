package com.bootcamp.APIDia24ChallengeAlgoritmo.Respository;

import com.bootcamp.APIDia24ChallengeAlgoritmo.Model.Materia;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface MateriaRepository extends JpaRepository<Materia,Long> {
    Materia getMateriaByCodMat(long codMat);
    boolean existsByCodMat(long codMat);
}
