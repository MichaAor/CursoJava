package com.bootcamp.Dia17_ChallengeAlgoritmo.Controller;

import com.bootcamp.Dia17_ChallengeAlgoritmo.Model.MateriaModel;
import com.bootcamp.Dia17_ChallengeAlgoritmo.Service.MateriaService;
import io.swagger.annotations.Api;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.Optional;

@RestController
@RequestMapping("/materias")
@Api(value = "Controller Materias")
public class MateriaController {
    @Autowired
    MateriaService materiaService;

    @GetMapping
    public ResponseEntity<ArrayList<MateriaModel>> getAllMaterias() {
            return materiaService.getAllMaterias();
    }

    @GetMapping("/materia/{codMateria}")
    public ResponseEntity<Optional<MateriaModel>> getMateriaByCode(@PathVariable("codMateria") String codMateria) {
        if(codMateria == null){
            return new ResponseEntity<>(HttpStatus.NOT_ACCEPTABLE);
        }
        return materiaService.getMateriaByCod(codMateria);
    }


    @PostMapping("/materia")
    public ResponseEntity<MateriaModel> registerMateria(@RequestBody MateriaModel materiaBody) {
        return materiaService.registerMateria(materiaBody);
    }

    @PutMapping("/materia")
    public ResponseEntity<MateriaModel> modifyMateria(@RequestBody MateriaModel materiaBody) {
        return materiaService.registerMateria(materiaBody);
    }

    @DeleteMapping("/{codMateria}")
    public ResponseEntity deleteMateria(@PathVariable("codMateria") String codMateria){
        if(codMateria == null){
            return new ResponseEntity<>(HttpStatus.NOT_ACCEPTABLE);
        }
        return materiaService.deleteMateria(codMateria);
    }
}
