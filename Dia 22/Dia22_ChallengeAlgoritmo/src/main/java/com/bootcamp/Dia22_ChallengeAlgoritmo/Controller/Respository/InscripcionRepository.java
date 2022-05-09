package com.bootcamp.Dia22_ChallengeAlgoritmo.Controller.Respository;

import com.bootcamp.Dia22_ChallengeAlgoritmo.Model.Estudiante;
import com.bootcamp.Dia22_ChallengeAlgoritmo.Model.Inscripcion;
import com.bootcamp.Dia22_ChallengeAlgoritmo.Model.Materia;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface InscripcionRepository extends JpaRepository<Inscripcion,Long> {
    public boolean existsByMateria(Materia materia);
    public boolean existsByEstudiante(Estudiante estudiante);
}
