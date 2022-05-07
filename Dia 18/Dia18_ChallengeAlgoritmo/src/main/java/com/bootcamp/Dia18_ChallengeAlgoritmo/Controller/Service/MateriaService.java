package com.bootcamp.Dia18_ChallengeAlgoritmo.Controller.Service;

import com.bootcamp.Dia18_ChallengeAlgoritmo.Controller.Respository.MateriaRepository;
import com.bootcamp.Dia18_ChallengeAlgoritmo.Model.Materia;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;

@Service
public class MateriaService {
    @Autowired
    MateriaRepository mr;

    public ArrayList<Materia> getAllMaterias() {
        return (ArrayList<Materia>) mr.findAll();
    }

    public Materia getMateriaByCod(String codMat) {
        return mr.getMateriaByCodMat(codMat);
    }

    public void registerMateria(Materia materia) {
        mr.save(materia);
    }

    public void modifyMateria(Materia materia, String codMat) {
        materia.setCodMat(codMat);
        mr.save(materia);
    }

    public void deleteMateria(String codMateria) {
        mr.deleteById(codMateria);
    }

    /*
    public ResponseEntity<ArrayList<Materia>> getAllMaterias(){
        try {
            ArrayList<Materia> materias = new ArrayList<Materia>();
            mr.findAll().forEach(materias::add);
            if (materias.isEmpty()) {
                return new ResponseEntity<>(HttpStatus.NO_CONTENT);
            }
            return new ResponseEntity<>(materias, HttpStatus.OK);
        } catch (Exception e) {
            return new ResponseEntity<>(HttpStatus.INTERNAL_SERVER_ERROR);
        }
    }

    public ResponseEntity<Optional<Materia>>getMateriaByCod(String codMateria) {
        try {
            Optional<Materia> materias = mr.findById(codMateria);
            if (materias.isEmpty()) {
                return new ResponseEntity<>(HttpStatus.NO_CONTENT);
            }
            return new ResponseEntity<>(materias, HttpStatus.OK);
        } catch (Exception e) {
            return new ResponseEntity<>(null,HttpStatus.INTERNAL_SERVER_ERROR);
        }
    }



    public ResponseEntity<Materia> registerMateria(Materia materia) {
        try {
            if(mr.getMateriaByCodMat(materia.getCodMateria()) != null){
                return new ResponseEntity<>(HttpStatus.NOT_ACCEPTABLE);
            }
            mr.save(materia);
            return new ResponseEntity<>(materia, HttpStatus.OK);
        } catch (Exception e) {
            return new ResponseEntity<>(null,HttpStatus.INTERNAL_SERVER_ERROR);
        }
    }

    public ResponseEntity deleteUser(String codMateria) {
        try {
            mr.deleteById(codMateria);
            Optional<Materia> materia = mr.findById(codMateria);
            if (!materia.isEmpty()) {
                return new ResponseEntity<>(HttpStatus.INTERNAL_SERVER_ERROR);
            }
            return new ResponseEntity<>(materia, HttpStatus.OK);
        } catch (Exception e) {
            return new ResponseEntity<>(HttpStatus.INTERNAL_SERVER_ERROR);
        }
    }
    */

}
