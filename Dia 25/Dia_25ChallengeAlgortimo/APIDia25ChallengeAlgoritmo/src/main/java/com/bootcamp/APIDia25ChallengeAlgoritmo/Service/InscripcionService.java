package com.bootcamp.APIDia25ChallengeAlgoritmo.Service;


import com.bootcamp.APIDia25ChallengeAlgoritmo.Model.Estudiante;
import com.bootcamp.APIDia25ChallengeAlgoritmo.Model.Inscripcion;
import com.bootcamp.APIDia25ChallengeAlgoritmo.Model.Materia;
import com.bootcamp.APIDia25ChallengeAlgoritmo.Respository.EstudianteRepository;
import com.bootcamp.APIDia25ChallengeAlgoritmo.Respository.InscripcionRepository;
import com.bootcamp.APIDia25ChallengeAlgoritmo.Respository.MateriaRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.PageRequest;
import org.springframework.data.domain.Pageable;
import org.springframework.data.domain.Sort;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class InscripcionService {
    @Autowired
    InscripcionRepository ir;
    @Autowired
    MateriaRepository mr;
    @Autowired
    EstudianteRepository er;

    public ArrayList<Inscripcion> getAllInscripciones(){
        ArrayList<Inscripcion> inscripciones = (ArrayList<Inscripcion>) ir.findAll();
        return inscripciones;
    }

    public List<Inscripcion> getAllPage(int pagNum, int pagSize){
        Pageable ammount= PageRequest.of(pagNum-1, pagSize);
        List<Inscripcion> inscripcions = ir.findAll(ammount).getContent();
        return inscripcions;
    }

    public int getTotalPagesPage(int pagNum, int pagSize){
        Pageable ammount= PageRequest.of(pagNum-1, pagSize);
        int total  = ir.findAll(ammount).getTotalPages();
        return total;
    }

    public long getTotalElementsPage(int pagNum,int pagSize){
        Pageable ammount= PageRequest.of(pagNum-1, pagSize);
        long total  = ir.findAll(ammount).getTotalElements();
        return total;
    }


    public List<Inscripcion> getContentBySort(int actual, int size, String sort, String sortField){
        Pageable cant= PageRequest.of(actual-1, size, sort.equals("asc")? Sort.by(sortField).ascending():Sort.by(sortField).descending());
        return ir.findAll(cant).getContent();
    }

    public int getTPagBySort(int actual, int size, String sort, String sortField){
        Pageable cant= PageRequest.of(actual-1, size, sort.equals("asc")? Sort.by(sortField).ascending():Sort.by(sortField).descending());
        return ir.findAll(cant).getTotalPages();
    }

    public long getTElBySort(int actual, int size, String sort, String sortField){
        Pageable cant= PageRequest.of(actual-1, size, sort.equals("asc")? Sort.by(sortField).ascending():Sort.by(sortField).descending());
        return ir.findAll(cant).getTotalElements();
    }





    public boolean registrarInscripcion(long codMat,long dniEst){
        if(!er.existsByDni(dniEst)  || ! mr.existsByCodMat(codMat)){
            return false;
        }
        Estudiante estudiante = er.getEstudianteByDni(dniEst);
        Materia materia = mr.getMateriaByCodMat(codMat);
        if(ir.existsByEstudiante(estudiante) && ir.existsByMateria(materia)){
            return false;
        }
        Inscripcion inscripcion = new Inscripcion(materia,estudiante);
        ir.save(inscripcion);
        return true;
    }

    public boolean deleteInscripcion(long id) {
        if(!ir.existsById(id)){
            return false;
        }
        ir.deleteById(id);
        return true;
    }

    public List<Inscripcion> getInsByEstNomb(String nombre) {
        return ir.byEstudianteNomb(nombre);
    }

    public List<Inscripcion> getInsByMatNomb(String nombre) {
        return ir.byMateriaNomb(nombre);
    }
}
