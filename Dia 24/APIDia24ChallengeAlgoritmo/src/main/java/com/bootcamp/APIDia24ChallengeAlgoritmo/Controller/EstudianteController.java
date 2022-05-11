package com.bootcamp.APIDia24ChallengeAlgoritmo.Controller;

import com.bootcamp.APIDia24ChallengeAlgoritmo.Model.Estudiante;
import com.bootcamp.APIDia24ChallengeAlgoritmo.Service.EstudianteService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;

@RestController
@RequestMapping("/estudiantes")
//@Api(value = "Controller Estudiantes")
public class EstudianteController {
    @Autowired
    EstudianteService es;

    @GetMapping
    public ArrayList<Estudiante> getAllEstudiantes() {
        return es.getAllEstudiantes();
    }

    @GetMapping("/{dni}")
    public Estudiante getEstudianteByDni(@PathVariable("dni") long dni) {
        return es.getEstudianteByDni(dni);
    }

    @PostMapping
    public void registerEstudiante(@RequestBody Estudiante estudiante) {
        es.registerEstudiante(estudiante);
    }


    @PutMapping("/update/{dni}")
    public void modifyEstudiante(@RequestBody Estudiante estudiante,
                                   @PathVariable("dni") long dni) {
        es.modifyEstudiante(estudiante,dni);
    }

    @DeleteMapping("/delete/{dni}")
    public void deleteEstudiante(@PathVariable("dni") long dni){
       es.deleteEstudiante(dni);
    }





}
