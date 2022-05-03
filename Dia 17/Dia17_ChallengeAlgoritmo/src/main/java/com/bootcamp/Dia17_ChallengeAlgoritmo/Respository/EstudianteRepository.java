package com.bootcamp.Dia17_ChallengeAlgoritmo.Respository;

import com.bootcamp.Dia17_ChallengeAlgoritmo.Model.EstudianteModel;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import java.util.ArrayList;
import java.util.Optional;

@Repository
public interface EstudianteRepository extends JpaRepository<EstudianteModel,String> {
    ArrayList<EstudianteModel> getEstudiantesByName(String name);
    EstudianteModel getEstudianteByDni(String dni);

    @Query("select u from Estudiantes u where u.dni like '123'")
    ArrayList<EstudianteModel> findUsersWithDni();
}
