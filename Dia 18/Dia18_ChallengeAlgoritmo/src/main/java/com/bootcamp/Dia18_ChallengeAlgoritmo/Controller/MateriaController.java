package com.bootcamp.Dia18_ChallengeAlgoritmo.Controller;

import com.bootcamp.Dia18_ChallengeAlgoritmo.Controller.Service.MateriaService;
import com.bootcamp.Dia18_ChallengeAlgoritmo.Model.Materia;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.Optional;

@RestController
@RequestMapping("/materias")
public class MateriaController {
    @Autowired
    MateriaService materiaService;

    @GetMapping
    public ResponseEntity<ArrayList<Materia>> getAllMaterias() {
            return materiaService.getAllMaterias();
    }

    @GetMapping("/materia/{codMateria}")
    public ResponseEntity<Optional<Materia>> getMateriaByCode(@PathVariable("codMateria") String codMateria) {
        if(codMateria == null){
            return new ResponseEntity<>(HttpStatus.NOT_ACCEPTABLE);
        }
        return materiaService.getMateriaByCod(codMateria);
    }


    @PostMapping("/materia")
    public ResponseEntity<Materia> registerMateria(@RequestBody Materia materiaBody) {
        return materiaService.registerMateria(materiaBody);
    }

    @PutMapping("/materia")
    public ResponseEntity<Materia> modifyMateria(@RequestBody Materia materiaBody) {
        return materiaService.registerMateria(materiaBody);
    }

    @DeleteMapping("/materia/{codMateria}")
    public ResponseEntity deleteMateria(@PathVariable("codMateria") String codMateria){
        if(codMateria == null){
            return new ResponseEntity<>(HttpStatus.NOT_ACCEPTABLE);
        }
        return materiaService.deleteMateria(codMateria);
    }
}
