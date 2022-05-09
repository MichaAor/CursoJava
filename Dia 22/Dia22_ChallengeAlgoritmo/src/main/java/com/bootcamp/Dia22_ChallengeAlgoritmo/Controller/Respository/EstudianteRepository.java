package com.bootcamp.Dia22_ChallengeAlgoritmo.Controller.Respository;

import com.bootcamp.Dia22_ChallengeAlgoritmo.Model.Estudiante;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface EstudianteRepository extends JpaRepository<Estudiante,Long> {
    Estudiante getEstudianteByDni(long dni);
}
