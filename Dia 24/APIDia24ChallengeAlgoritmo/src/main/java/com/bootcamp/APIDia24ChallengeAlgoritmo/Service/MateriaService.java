package com.bootcamp.APIDia24ChallengeAlgoritmo.Service;


import com.bootcamp.APIDia24ChallengeAlgoritmo.Model.Estudiante;
import com.bootcamp.APIDia24ChallengeAlgoritmo.Model.Materia;
import com.bootcamp.APIDia24ChallengeAlgoritmo.Respository.MateriaRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Service;

import java.util.ArrayList;

@Service
public class MateriaService {
    @Autowired
    MateriaRepository mr;

    public ArrayList<Materia> getAllMaterias() {
        return (ArrayList<Materia>) mr.findAll();
    }

    public Page<Materia> getAll(int pagNum, int pagSize){
        Pageable ammount= PageRequest.of(pagNum-1, pagSize);
        return mr.findAll(ammount);
    }

    public Page<Materia> asc(int pagNum, int pagSize) {
        Pageable ammount= PageRequest.of(pagNum-1, pagSize);
        return mr.ascendant(ammount);
    }

    public Page<Materia> desc(int pagNum, int pagSize) {
        Pageable ammount= PageRequest.of(pagNum-1, pagSize);
        return mr.descendant(ammount);
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
