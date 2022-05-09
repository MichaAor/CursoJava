package com.bootcamp.Dia22_ChallengeAlgoritmo.Controller.Service;

import com.bootcamp.Dia22_ChallengeAlgoritmo.Controller.Respository.EstudianteRepository;
import com.bootcamp.Dia22_ChallengeAlgoritmo.Controller.Respository.InscripcionRepository;
import com.bootcamp.Dia22_ChallengeAlgoritmo.Controller.Respository.MateriaRepository;
import com.bootcamp.Dia22_ChallengeAlgoritmo.Model.Estudiante;
import com.bootcamp.Dia22_ChallengeAlgoritmo.Model.Inscripcion;
import com.bootcamp.Dia22_ChallengeAlgoritmo.Model.Materia;
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

    public boolean registrarInscripcion(long dniEst,long codMat){
        if(er.getEstudianteByDni(dniEst) != null || mr.getMateriaByCodMat(codMat) != null){
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

    public boolean deleteInscripcion(long id){
        if(!ir.existsById(id));{
            return false;
        }
    }
}
