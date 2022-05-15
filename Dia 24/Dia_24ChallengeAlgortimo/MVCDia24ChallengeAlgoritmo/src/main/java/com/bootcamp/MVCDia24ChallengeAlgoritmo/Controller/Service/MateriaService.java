package com.bootcamp.MVCDia24ChallengeAlgoritmo.Controller.Service;


import com.bootcamp.MVCDia24ChallengeAlgoritmo.Controller.Respository.MateriaRepository;
import com.bootcamp.MVCDia24ChallengeAlgoritmo.Model.Materia;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class MateriaService {
    @Autowired
    MateriaRepository mr;

    public ArrayList<Materia> getAllMaterias() {
        return (ArrayList<Materia>) mr.getAllMateria();
    }

    public Materia getMateriaByCod(long codMat) {
        return mr.getMateriaByCodMat(codMat);
    }

    public List<Materia> getMateriaByNombre(String nombre) {
        return mr.getMateriasByNombre(nombre);
    }

    public void registerMateria(Materia materia) {
        mr.saveMateria(materia);
    }

    public void modifyMateria(Materia materia, long codMat) {
        materia.setCodMat(codMat);
        mr.saveMateria(materia);
    }

    public void deleteMateria(long codMateria) {
        mr.deleteMateria(codMateria);
    }

    ///////////////////////
    public List<Materia> getContentPage(int numPag, int numSize){
        return mr.getContentPage(numPag,numSize);
    }
    public int getTotalPagesPage(int numPag,int numSize){
        return mr.getTotalPagesPage(numPag,numSize);
    }
    public long getTotalElementsPage(int numPag,int numSize){
        return mr.getTotalElementsPage(numPag,numSize);
    }

    ///////////////////////
    public List<Materia> getContentSort(int numPag,int numSize,String sort,String sortField){
        return mr.getContentSort(numPag,numSize,sort,sortField);
    }
    public int getTotalPagesSort(int numPag,int numSize,String sort,String sortField){
        return mr.getTotalPagesSort(numPag,numSize,sort,sortField);
    }
    public long getTotalElementsSort(int numPag,int numSize,String sort,String sortField){
        return mr.getTotalElementsSort(numPag,numSize,sort,sortField);
    }

}
