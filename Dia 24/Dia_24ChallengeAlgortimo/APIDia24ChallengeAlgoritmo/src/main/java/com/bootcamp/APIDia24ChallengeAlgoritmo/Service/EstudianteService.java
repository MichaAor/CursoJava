package com.bootcamp.APIDia24ChallengeAlgoritmo.Service;


import com.bootcamp.APIDia24ChallengeAlgoritmo.Model.Estudiante;
import com.bootcamp.APIDia24ChallengeAlgoritmo.Respository.EstudianteRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.PageRequest;
import org.springframework.data.domain.Pageable;
import org.springframework.data.domain.Sort;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class EstudianteService {
    @Autowired
    private EstudianteRepository er;


    public ArrayList<Estudiante> getAllEstudiantes() {
        return (ArrayList<Estudiante>) er.findAll();
    }

    public List<Estudiante> getAllPage(int pagNum, int pagSize){
        Pageable ammount= PageRequest.of(pagNum-1, pagSize);
        List<Estudiante> estudiantes = er.findAll(ammount).getContent();
        return estudiantes;
    }

    public int getTotalPagesPage(int pagNum, int pagSize){
        Pageable ammount= PageRequest.of(pagNum-1, pagSize);
        int total  = er.findAll(ammount).getTotalPages();
        return total;
    }

    public long getTotalElementsPage(int pagNum,int pagSize){
        Pageable ammount= PageRequest.of(pagNum-1, pagSize);
        long total  = er.findAll(ammount).getTotalElements();
        return total;
    }


    public List<Estudiante> getContentBySort(int actual, int size, String sort, String sortField){
        Pageable cant= PageRequest.of(actual-1, size, sort.equals("asc")? Sort.by(sortField).ascending():Sort.by(sortField).descending());
        return er.findAll(cant).getContent();
    }

    public int getTPagBySort(int actual, int size, String sort, String sortField){
        Pageable cant= PageRequest.of(actual-1, size, sort.equals("asc")? Sort.by(sortField).ascending():Sort.by(sortField).descending());
        return er.findAll(cant).getTotalPages();
    }

    public long getTElBySort(int actual, int size, String sort, String sortField){
        Pageable cant= PageRequest.of(actual-1, size, sort.equals("asc")? Sort.by(sortField).ascending():Sort.by(sortField).descending());
        return er.findAll(cant).getTotalElements();
    }



    public Estudiante byId(long dni) {
        return er.getEstudianteByDni(dni);
    }

    public ArrayList<Estudiante> byNombre(String nombre)
    {
        return er.byNombre(nombre);
    }
    public ArrayList<Estudiante> byApellido(String apellido)
    {
        return  er.byApellido(apellido);
    }

    public void registerEstudiante(Estudiante estudiante) {
        er.save(estudiante);
    }

    public void modifyEstudiante(Estudiante estudiante, long dni) {
        estudiante.setDni(dni);
        er.save(estudiante);
    }

    public void deleteEstudiante(long dni) {
        er.deleteById(dni);
    }

}
