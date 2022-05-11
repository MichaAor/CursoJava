package com.bootcamp.MVCDia24ChallengeAlgoritmo.Controller.Service;

import com.bootcamp.MVCDia24ChallengeAlgoritmo.Controller.Respository.EstudianteRepository;
import com.bootcamp.MVCDia24ChallengeAlgoritmo.Model.Estudiante;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;

@Service
public class EstudianteService {
    @Autowired
    EstudianteRepository er;

    public ArrayList<Estudiante> getAllEstudiantes() {
        return (ArrayList<Estudiante>) er.getAllEstudiantes();
    }

    public Estudiante getEstudianteByDni(long dni) {
        return er.getEstudianteByDni(dni);
    }


    public void registerEstudiante(Estudiante estudiante) {
        er.saveEstudiante(estudiante);
    }

    public void modifyEstudiante(Estudiante estudiante, long dni) {
        er.modifyEstudiante(estudiante,dni);
    }

    public void deleteEstudiante(long dni) {
        er.deleteEstudiante(dni);
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
