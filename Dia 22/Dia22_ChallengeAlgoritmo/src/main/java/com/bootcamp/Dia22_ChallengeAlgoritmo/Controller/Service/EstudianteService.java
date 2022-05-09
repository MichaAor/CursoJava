package com.bootcamp.Dia22_ChallengeAlgoritmo.Controller.Service;

import com.bootcamp.Dia22_ChallengeAlgoritmo.Controller.Respository.EstudianteRepository;
import com.bootcamp.Dia22_ChallengeAlgoritmo.Model.Estudiante;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;

@Service
public class EstudianteService {
    @Autowired
    EstudianteRepository er;

    public ArrayList<Estudiante> getAllEstudiantes() {
        return (ArrayList<Estudiante>) er.findAll();
    }

    public Estudiante getEstudianteByDni(long dni) {
        return er.getEstudianteByDni(dni);
    }


    public void registerEstudiante(Estudiante estudiante) {
        er.save(estudiante);
    }

    public void modifyEstudiante(Estudiante estudiante, long dni) {
        estudiante.setDni(dni);
        er.save(estudiante);
    }

    public void deleteEstudiante(long dni) {
        er.deleteById(dni);
    }

        /*
    public ResponseEntity<ArrayList<Estudiante>> getEstudiantesByName(String name) {
        try {
            ArrayList<Estudiante> user = er.getEstudiantesByName(name);
            if (user.isEmpty()) {
                return new ResponseEntity<>(HttpStatus.NO_CONTENT);
            }
            return new ResponseEntity<>(user, HttpStatus.OK);
        } catch (Exception e) {
            return new ResponseEntity<>(null, HttpStatus.INTERNAL_SERVER_ERROR);
        }
    }
*/
}
