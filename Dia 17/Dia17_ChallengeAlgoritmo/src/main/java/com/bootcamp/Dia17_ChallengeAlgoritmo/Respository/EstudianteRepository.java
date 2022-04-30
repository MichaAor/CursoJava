package com.bootcamp.Dia17_ChallengeAlgoritmo.Respository;

import com.bootcamp.Dia17_ChallengeAlgoritmo.Model.EstudianteModel;
import com.bootcamp.Dia17_ChallengeAlgoritmo.Model.UserModel;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import java.util.ArrayList;
import java.util.Optional;

@Repository
public interface EstudianteRepository extends CrudRepository<EstudianteModel,String> {
    ArrayList<EstudianteModel> getEstudiantesByName(String name);
    EstudianteModel getEstudianteByDni(String dni);
}
