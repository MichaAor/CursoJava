package com.bootcamp.APIDia24ChallengeAlgoritmo.Controller;


import com.bootcamp.APIDia24ChallengeAlgoritmo.Model.Materia;
import com.bootcamp.APIDia24ChallengeAlgoritmo.Service.MateriaService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;

@RestController
@RequestMapping("/materias")
public class MateriaController {
    @Autowired
    MateriaService ms;

    @GetMapping
    public ArrayList<Materia> getAllMateria() {
        return ms.getAllMaterias();
    }

    @GetMapping("/{codMat}")
    public Materia getMateriaByCodMat(@PathVariable("codMat") long codMat) {
        return ms.getMateriaByCod(codMat);
    }

    @PostMapping
    public void registerMateria(@RequestBody Materia materia) {
        ms.registerMateria(materia);
    }


    @PutMapping("/update/{codMat}")
    public void modifyMateria(@RequestBody Materia materia,
                                 @PathVariable("codMat") long codMat){
        ms.modifyMateria(materia,codMat);
    }

    @DeleteMapping("/delete/{codMat}")
    public void deleteMateria(@PathVariable("codMat") long codMat){
        ms.deleteMateria(codMat);
    }

}
