package com.bootcamp.APIDia24ChallengeAlgoritmo.Service;


import com.bootcamp.APIDia24ChallengeAlgoritmo.Model.Estudiante;
import com.bootcamp.APIDia24ChallengeAlgoritmo.Respository.EstudianteRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Service;

import java.util.ArrayList;

@Service
public class EstudianteService {
    @Autowired
    EstudianteRepository er;

    public ArrayList<Estudiante> getAllEstudiantes() {
        return (ArrayList<Estudiante>) er.findAll();
    }

    public Page<Estudiante> getAll(int pagNum, int pagSize){
        Pageable ammount= PageRequest.of(pagNum-1, pagSize);
        return er.findAll(ammount);
    }

    public Page<Estudiante> asc(int pagNum, int pagSize) {
        Pageable ammount= PageRequest.of(pagNum-1, pagSize);
        return er.ascendant(ammount);
    }

    public Page<Estudiante> desc(int pagNum, int pagSize) {
        Pageable ammount= PageRequest.of(pagNum-1, pagSize);
        return er.descendant(ammount);
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
