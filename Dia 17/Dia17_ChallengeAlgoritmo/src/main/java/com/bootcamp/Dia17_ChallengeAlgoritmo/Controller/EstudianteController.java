package com.bootcamp.Dia17_ChallengeAlgoritmo.Controller;

import com.bootcamp.Dia17_ChallengeAlgoritmo.Model.EstudianteModel;
import com.bootcamp.Dia17_ChallengeAlgoritmo.Service.EstudianteService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.Optional;

@RestController
@RequestMapping("/estudiantes")
//@Api(value = "Controller Estudiantes")
public class EstudianteController {
    @Autowired
    EstudianteService estudianteService;

    @GetMapping
    public ResponseEntity<ArrayList<EstudianteModel>> getAllEstudiantes() {
        return estudianteService.getAllEstudiantes();
    }

    @GetMapping("/estudiante/{dni}")
    public ResponseEntity<Optional<EstudianteModel>> getEstudianteByDni(@PathVariable("dni") String dni) {
        if(dni == null){
            return new ResponseEntity<>(HttpStatus.NOT_ACCEPTABLE);
        }
        return estudianteService.getEstudianteByDni(dni);
    }

    @GetMapping("/{name}")
    public ResponseEntity<ArrayList<EstudianteModel>> getEstudiantesByName(@PathVariable("name") String name) {
        if(name == null){
            return new ResponseEntity<>(HttpStatus.NOT_ACCEPTABLE);
        }
        return estudianteService.getEstudiantesByName(name);
    }

    @PostMapping("/estudiante")
    public ResponseEntity<EstudianteModel> registerEstudiante(@RequestBody EstudianteModel estudianteModel) {
        return estudianteService.registerEstudiante(estudianteModel);
    }
    @PutMapping("/estudiante")
    public ResponseEntity<EstudianteModel> modifyUser(@RequestBody EstudianteModel estudianteModel) {
        return estudianteService.registerEstudiante(estudianteModel);
    }

    @DeleteMapping("/{dni}")
    public ResponseEntity deleteEstudiante(@PathVariable("dni") String dni){
        if(dni == null){
            return new ResponseEntity<>(HttpStatus.NOT_ACCEPTABLE);
        }
        return estudianteService.deleteEstudiante(dni);
    }
}
