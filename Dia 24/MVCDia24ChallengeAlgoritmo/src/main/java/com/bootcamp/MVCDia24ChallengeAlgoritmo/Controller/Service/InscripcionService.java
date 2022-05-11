package com.bootcamp.MVCDia24ChallengeAlgoritmo.Controller.Service;

import com.bootcamp.MVCDia24ChallengeAlgoritmo.Controller.Respository.InscripcionRepository;
import com.bootcamp.MVCDia24ChallengeAlgoritmo.InscripcionRequest;
import com.bootcamp.MVCDia24ChallengeAlgoritmo.Model.Inscripcion;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;

@Service
public class InscripcionService {
    @Autowired
    InscripcionRepository ir;

    public ArrayList<Inscripcion> getAllInscripciones(){
        ArrayList<Inscripcion> inscripciones = ir.getAllInscripciones();
        return inscripciones;
    }

    public void registrarInscripcion(InscripcionRequest inscripcionRequest){
        ir.saveInscripcion(inscripcionRequest);
    }

    public void deleteInscripcion(long id) {
       ir.deleteInscripcion(id);
    }
}
