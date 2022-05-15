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
    public ArrayList<Estudiante> getEstudianteByNombre(String nombre) {
        return er.getEstudianteByNombre(nombre);
    }
    public ArrayList<Estudiante> getEstudianteByApellido(String apellido) {
        return er.getEstudianteByApellido(apellido);
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
    public List<Estudiante> getContentSort(int numPag,int numSize,String sort,String sortField){
        return er.getContentSort(numPag,numSize,sort,sortField);
    }
    public int getTotalPagesSort(int numPag,int numSize,String sort,String sortField){
        return er.getTotalPagesSort(numPag,numSize,sort,sortField);
    }
    public long getTotalElementsSort(int numPag,int numSize,String sort,String sortField){
        return er.getTotalElementsSort(numPag,numSize,sort,sortField);
    }

}
