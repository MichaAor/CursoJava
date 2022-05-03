package com.bootcamp.Dia18_ChallengeAlgoritmo.Controller.Service;

import com.bootcamp.Dia18_ChallengeAlgoritmo.Controller.Respository.EstudianteRepository;
import com.bootcamp.Dia18_ChallengeAlgoritmo.Model.Estudiante;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.Optional;

@Service
public class EstudianteService {
    @Autowired
    private EstudianteRepository estudianteRepository;

    public ArrayList<Estudiante> getAllEstudiantes() {
        return (ArrayList<Estudiante>) estudianteRepository.findAll();
    }

    public Estudiante getEstudianteByDni(String dni) {
        return estudianteRepository.getEstudianteByDni(dni);
    }

    public ResponseEntity<ArrayList<Estudiante>> getEstudiantesByName(String name) {
        try {
            ArrayList<Estudiante> user = estudianteRepository.getEstudiantesByName(name);
            if (user.isEmpty()) {
                return new ResponseEntity<>(HttpStatus.NO_CONTENT);
            }
            return new ResponseEntity<>(user, HttpStatus.OK);
        } catch (Exception e) {
            return new ResponseEntity<>(null, HttpStatus.INTERNAL_SERVER_ERROR);
        }
    }

    public void registerEstudiante(Estudiante estudiante) {
        estudianteRepository.save(estudiante);
    }

    public void modifyEstudiante(Estudiante estudiante, String dni) {
        estudiante.setDni(dni);
        estudianteRepository.save(estudiante);
    }

    public void deleteEstudiante(String dni) {
        estudianteRepository.deleteById(dni);
    }
}
