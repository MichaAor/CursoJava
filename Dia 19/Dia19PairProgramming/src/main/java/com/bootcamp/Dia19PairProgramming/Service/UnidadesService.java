package com.bootcamp.Dia19PairProgramming.Service;

import com.bootcamp.Dia19PairProgramming.Model.Unidad;
import com.bootcamp.Dia19PairProgramming.Repository.UnidadesRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;

@Service
public class UnidadesService {
    @Autowired
    UnidadesRepository unidadesRepository;

    public Unidad getUnidadesByID(String id){
        return unidadesRepository.findById(id).get();
    }

    public ArrayList<Unidad> getAllUnidades(){
        return (ArrayList<Unidad>) unidadesRepository.findAll();
    }

    public String registrarUnidad(Unidad unidad){
        unidadesRepository.save(unidad);
        return "Registrado";
    }

    public String modificarUnidad(String id, Unidad unidad){
        Unidad unidad1 = unidadesRepository.findById(id).get();
        unidad1 = unidad;
        return "Modificado";
    }

    public String borrarUnidad(String id){
        unidadesRepository.deleteById(id);
        return "Unidad Eliminada";
    }
}
