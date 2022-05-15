package com.bootcamp.MVCDia24ChallengeAlgoritmo.Controller.Service;

import com.bootcamp.MVCDia24ChallengeAlgoritmo.Controller.Respository.InscripcionRepository;
import com.bootcamp.MVCDia24ChallengeAlgoritmo.InscripcionRequest;
import com.bootcamp.MVCDia24ChallengeAlgoritmo.Model.Inscripcion;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class InscripcionService {
    @Autowired
    InscripcionRepository ir;

    public ArrayList<Inscripcion> getAllInscripciones(){
        ArrayList<Inscripcion> inscripciones = ir.getAllInscripciones();
        return inscripciones;
    }

    ///////////////////////
    public List<Inscripcion> getContentPage(int numPag, int numSize){
        return ir.getContentPage(numPag,numSize);
    }
    public int getTotalPagesPage(int numPag,int numSize){
        return ir.getTotalPagesPage(numPag,numSize);
    }
    public long getTotalElementsPage(int numPag,int numSize){
        return ir.getTotalElementsPage(numPag,numSize);
    }

    ///////////////////////
    public List<Inscripcion> getContentSort(int numPag,int numSize,String sort,String sortField){
        return ir.getContentSort(numPag,numSize,sort,sortField);
    }
    public int getTotalPagesSort(int numPag,int numSize,String sort,String sortField){
        return ir.getTotalPagesSort(numPag,numSize,sort,sortField);
    }
    public long getTotalElementsSort(int numPag,int numSize,String sort,String sortField){
        return ir.getTotalElementsSort(numPag,numSize,sort,sortField);
    }

    public void registrarInscripcion(InscripcionRequest inscripcionRequest){
        ir.saveInscripcion(inscripcionRequest);
    }

    public void deleteInscripcion(long id) {
       ir.deleteInscripcion(id);
    }
}
