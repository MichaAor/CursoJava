package com.bootcamp.Dia18_ChallengeAlgoritmo.Controller.Respository;

import com.bootcamp.Dia18_ChallengeAlgoritmo.Model.Estudiante;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import java.util.ArrayList;

@Repository
public interface EstudianteRepository extends CrudRepository<Estudiante,String> {
    ArrayList<Estudiante> getEstudiantesByName(String name);
    Estudiante getEstudianteByDni(String dni);
}
