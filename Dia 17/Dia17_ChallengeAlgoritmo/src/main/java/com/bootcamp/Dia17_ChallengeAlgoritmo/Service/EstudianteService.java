package com.bootcamp.Dia17_ChallengeAlgoritmo.Service;

import com.bootcamp.Dia17_ChallengeAlgoritmo.Model.EstudianteModel;
import com.bootcamp.Dia17_ChallengeAlgoritmo.Respository.EstudianteRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;

import java.util.ArrayList;
import java.util.Optional;

public class EstudianteService {
    @Autowired
    private EstudianteRepository estudianteRepository;
    public ResponseEntity<ArrayList<EstudianteModel>> getAllEstudiantes(){
        try {
            ArrayList<EstudianteModel> estudiantes = new ArrayList<EstudianteModel>();
            estudianteRepository.findAll().forEach(estudiantes::add);
            if (estudiantes.isEmpty()) {
                return new ResponseEntity<>(HttpStatus.NO_CONTENT);
            }
            return new ResponseEntity<>(estudiantes, HttpStatus.OK);
        } catch (Exception e) {
            return new ResponseEntity<>(HttpStatus.INTERNAL_SERVER_ERROR);
        }
    }

    public ResponseEntity<Optional<EstudianteModel>>getEstudianteByDni(String dni) {
        try {
            Optional<EstudianteModel> user = estudianteRepository.findById(dni);
            if (user.isEmpty()) {
                return new ResponseEntity<>(HttpStatus.NO_CONTENT);
            }
            return new ResponseEntity<>(user, HttpStatus.OK);
        } catch (Exception e) {
            return new ResponseEntity<>(null,HttpStatus.INTERNAL_SERVER_ERROR);
        }
    }

    public ResponseEntity<ArrayList<EstudianteModel>> getEstudianteByName(String name) {
        try {
            ArrayList<EstudianteModel> user = estudianteRepository.getEstudiantesByName(name);
            if (user.isEmpty()) {
                return new ResponseEntity<>(HttpStatus.NO_CONTENT);
            }
            return new ResponseEntity<>(user, HttpStatus.OK);
        } catch (Exception e) {
            return new ResponseEntity<>(null,HttpStatus.INTERNAL_SERVER_ERROR);
        }
    }

    public ResponseEntity<EstudianteModel> register(EstudianteModel estudianteModel) {
        try {
            if(estudianteRepository.findById(estudianteModel.getDni()) != null){
                return new ResponseEntity<>(HttpStatus.NOT_ACCEPTABLE);
            }
            EstudianteModel estudiante = estudianteRepository.save(estudianteModel);
            return new ResponseEntity<>(estudiante, HttpStatus.OK);
        } catch (Exception e) {
            return new ResponseEntity<>(null,HttpStatus.INTERNAL_SERVER_ERROR);
        }
    }

    public ResponseEntity deleteEstudiante(String dni) {
        try {
            estudianteRepository.deleteById(dni);
            Optional<EstudianteModel> user = estudianteRepository.findById(dni);
            if (user.isEmpty()) {
                return new ResponseEntity<>(HttpStatus.NO_CONTENT);
            }
            return new ResponseEntity<>(user, HttpStatus.OK);
        } catch (Exception e) {
            return new ResponseEntity<>(HttpStatus.INTERNAL_SERVER_ERROR);
        }
    }
}
