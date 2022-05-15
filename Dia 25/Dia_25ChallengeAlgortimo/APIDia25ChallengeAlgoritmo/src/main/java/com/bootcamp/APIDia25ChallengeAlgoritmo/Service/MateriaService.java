package com.bootcamp.APIDia25ChallengeAlgoritmo.Service;


import com.bootcamp.APIDia25ChallengeAlgoritmo.Model.Materia;
import com.bootcamp.APIDia25ChallengeAlgoritmo.Respository.MateriaRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.PageRequest;
import org.springframework.data.domain.Pageable;
import org.springframework.data.domain.Sort;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class MateriaService {
    @Autowired
    MateriaRepository mr;

    public ArrayList<Materia> getAllMaterias() {
        return (ArrayList<Materia>) mr.findAll();
    }

    public List<Materia> getAllPage(int pagNum, int pagSize){
        Pageable ammount= PageRequest.of(pagNum-1, pagSize);
        List<Materia> materias = mr.findAll(ammount).getContent();
        return materias;
    }

    public int getTotalPagesPage(int pagNum, int pagSize){
        Pageable ammount= PageRequest.of(pagNum-1, pagSize);
        int total  = mr.findAll(ammount).getTotalPages();
        return total;
    }

    public long getTotalElementsPage(int pagNum,int pagSize){
        Pageable ammount= PageRequest.of(pagNum-1, pagSize);
        long total  = mr.findAll(ammount).getTotalElements();
        return total;
    }


        public List<Materia> getContentBySort(int actual, int size, String sort, String sortField){
            Pageable cant= PageRequest.of(actual-1, size,sort.equals("asc")? Sort.by(sortField).ascending():Sort.by(sortField).descending());
        return mr.findAll(cant).getContent();
    }

    public int getTPagBySort(int actual, int size, String sort, String sortField){
        Pageable cant= PageRequest.of(actual-1, size, sort.equals("asc")? Sort.by(sortField).ascending():Sort.by(sortField).descending());
        return mr.findAll(cant).getTotalPages();
    }

    public long getTElBySort(int actual, int size, String sort, String sortField){
        Pageable cant= PageRequest.of(actual-1, size, sort.equals("asc")? Sort.by(sortField).ascending():Sort.by(sortField).descending());
        return mr.findAll(cant).getTotalElements();
    }

    public Materia getMateriaByCod(long codMat) {
        return mr.getMateriaByCodMat(codMat);
    }

    public ArrayList<Materia> byNombre(String nombre)
    {
        return mr.byNombre(nombre);
    }


    public void registerMateria(Materia materia) {
        mr.save(materia);
    }

    public void modifyMateria(Materia materia, long codMat) {
        materia.setCodMat(codMat);
        mr.save(materia);
    }

    public void deleteMateria(long codMateria) {
        mr.deleteById(codMateria);
    }
}
