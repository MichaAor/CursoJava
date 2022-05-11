package com.bootcamp.APIDia24ChallengeAlgoritmo.Service;


import com.bootcamp.APIDia24ChallengeAlgoritmo.Model.Estudiante;
import com.bootcamp.APIDia24ChallengeAlgoritmo.Model.Inscripcion;
import com.bootcamp.APIDia24ChallengeAlgoritmo.Model.Materia;
import com.bootcamp.APIDia24ChallengeAlgoritmo.Respository.EstudianteRepository;
import com.bootcamp.APIDia24ChallengeAlgoritmo.Respository.InscripcionRepository;
import com.bootcamp.APIDia24ChallengeAlgoritmo.Respository.MateriaRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;

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
}
