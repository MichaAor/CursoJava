package com.bootcamp.APIDia24ChallengeAlgoritmo.Respository;

import com.bootcamp.APIDia24ChallengeAlgoritmo.Model.Estudiante;
import com.bootcamp.APIDia24ChallengeAlgoritmo.Model.Inscripcion;
import com.bootcamp.APIDia24ChallengeAlgoritmo.Model.Materia;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface InscripcionRepository extends JpaRepository<Inscripcion,Long> {
    public boolean existsByMateria(Materia materia);
    public boolean existsByEstudiante(Estudiante estudiante);
}
