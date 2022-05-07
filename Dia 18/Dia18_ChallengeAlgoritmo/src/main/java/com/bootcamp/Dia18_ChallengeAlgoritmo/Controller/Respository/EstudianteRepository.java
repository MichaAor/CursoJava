package com.bootcamp.Dia18_ChallengeAlgoritmo.Controller.Respository;

import com.bootcamp.Dia18_ChallengeAlgoritmo.Model.Estudiante;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import java.util.ArrayList;

@Repository
public interface EstudianteRepository extends JpaRepository<Estudiante,String> {
    Estudiante getEstudianteByDni(String dni);
}
