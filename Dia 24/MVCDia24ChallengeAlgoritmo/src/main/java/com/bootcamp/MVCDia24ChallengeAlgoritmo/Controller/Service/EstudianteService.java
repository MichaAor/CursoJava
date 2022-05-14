package com.bootcamp.MVCDia24ChallengeAlgoritmo.Controller.Service;

import com.bootcamp.MVCDia24ChallengeAlgoritmo.Controller.Respository.EstudianteRepository;
import com.bootcamp.MVCDia24ChallengeAlgoritmo.Model.Estudiante;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

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

    ///////////////////////
    public List<Estudiante> getContentPage(int numPag,int numSize){
        return er.getContentPage(numPag,numSize);
    }
    public int getTotalPagesPage(int numPag,int numSize){
        return er.getTotalPagesPage(numPag,numSize);
    }
    public long getTotalElementsPage(int numPag,int numSize){
        return er.getTotalElementsPage(numPag,numSize);
    }

    ///////////////////////
    public List<Estudiante> getContentAsc(int numPag,int numSize){
        return er.getContentAsc(numPag,numSize);
    }
    public int getTotalPagesAsc(int numPag,int numSize){
        return er.getTotalPagesAsc(numPag,numSize);
    }
    public long getTotalElementsAsc(int numPag,int numSize){
        return er.getTotalElementsAsc(numPag,numSize);
    }

    ///////////////////////
    public List<Estudiante> getContentDesc(int numPag,int numSize){
        return er.getContentDesc(numPag,numSize);
    }
    public int getTotalPagesDes(int numPag,int numSize){
       return er.getTotalPagesAsc(numPag,numSize);
    }
    public long getTotalElementsDes(int numPag,int numSize){
        return er.getTotalElementsPage(numPag,numSize);
    }


}
