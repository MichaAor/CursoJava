package com.bootcamp.APIDia24ChallengeAlgoritmo.Controller;


import com.bootcamp.APIDia24ChallengeAlgoritmo.InscripcionRequest;
import com.bootcamp.APIDia24ChallengeAlgoritmo.Model.Inscripcion;
import com.bootcamp.APIDia24ChallengeAlgoritmo.Service.InscripcionService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;

@Controller
@RequestMapping("/inscripciones")
public class InscripcionController {
    @Autowired
    InscripcionService is;

    @GetMapping
    public ArrayList<Inscripcion> getAllInscripciones(Model model){
       return is.getAllInscripciones();
    }

    @PostMapping
    public void registrarInscripcion(@RequestBody InscripcionRequest ir) {
        is.registrarInscripcion(ir.getCodMat(),ir.getDniEst());
    }

    @DeleteMapping("/deleteInscripcion/{id}")
    public void deleteInscripcion(@PathVariable("id") long id) {
        is.deleteInscripcion(id);
    }



}
