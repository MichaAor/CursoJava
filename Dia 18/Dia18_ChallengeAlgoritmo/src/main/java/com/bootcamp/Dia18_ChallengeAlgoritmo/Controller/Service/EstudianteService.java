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

    public ArrayList<Estudiante> getAllEstudiantes(){
        try {
            ArrayList<Estudiante> estudiantes = new ArrayList<Estudiante>();
            estudianteRepository.findAll().forEach(estudiantes::add);
            if (estudiantes.isEmpty()) {
                return null;
            }
            return estudiantes;
        } catch (Exception e) {
            return new ArrayList<Estudiante>();
        }
    }

    public ResponseEntity<Optional<Estudiante>>getEstudianteByDni(String dni) {
        try {
            Optional<Estudiante> user = estudianteRepository.findById(dni);
            if (user.isEmpty()) {
                return new ResponseEntity<>(HttpStatus.NO_CONTENT);
            }
            return new ResponseEntity<>(user, HttpStatus.OK);
        } catch (Exception e) {
            return new ResponseEntity<>(null,HttpStatus.INTERNAL_SERVER_ERROR);
        }
    }

    public ResponseEntity<ArrayList<Estudiante>> getEstudiantesByName(String name) {
        try {
            ArrayList<Estudiante> user = estudianteRepository.getEstudiantesByName(name);
            if (user.isEmpty()) {
                return new ResponseEntity<>(HttpStatus.NO_CONTENT);
            }
            return new ResponseEntity<>(user, HttpStatus.OK);
        } catch (Exception e) {
            return new ResponseEntity<>(null,HttpStatus.INTERNAL_SERVER_ERROR);
        }
    }

    public Estudiante registerEstudiante(Estudiante estudiante) {
        try {
            if(estudianteRepository.getEstudianteByDni(estudiante.getDni()) != null){
                return null;
            }
             estudianteRepository.save(estudiante);
            return estudiante;
        } catch (Exception e) {
            return null;
        }
    }

    public ResponseEntity deleteEstudiante(String dni) {
        try {
            estudianteRepository.deleteById(dni);
            Optional<Estudiante> user = estudianteRepository.findById(dni);
            if (!user.isEmpty()) {
                return new ResponseEntity<>(HttpStatus.INTERNAL_SERVER_ERROR);
            }
            return new ResponseEntity<>(user, HttpStatus.OK);
        } catch (Exception e) {
            return new ResponseEntity<>(HttpStatus.INTERNAL_SERVER_ERROR);
        }
    }
}
