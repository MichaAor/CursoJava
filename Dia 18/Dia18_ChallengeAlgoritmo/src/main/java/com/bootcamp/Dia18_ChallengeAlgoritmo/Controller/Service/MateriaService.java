package com.bootcamp.Dia18_ChallengeAlgoritmo.Controller.Service;

import com.bootcamp.Dia18_ChallengeAlgoritmo.Controller.Respository.MateriaRepository;
import com.bootcamp.Dia18_ChallengeAlgoritmo.Model.Materia;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.Optional;

@Service
public class MateriaService {
    @Autowired
    private MateriaRepository materiaRepository;

    public ResponseEntity<ArrayList<Materia>> getAllMaterias(){
        try {
            ArrayList<Materia> materias = new ArrayList<Materia>();
            materiaRepository.findAll().forEach(materias::add);
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
            Optional<Materia> materias = materiaRepository.findById(codMateria);
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
            if(materiaRepository.findMateriaByCodMateria(materia.getCodMateria()) != null){
                return new ResponseEntity<>(HttpStatus.NOT_ACCEPTABLE);
            }
            materiaRepository.save(materia);
            return new ResponseEntity<>(materia, HttpStatus.OK);
        } catch (Exception e) {
            return new ResponseEntity<>(null,HttpStatus.INTERNAL_SERVER_ERROR);
        }
    }

    public ResponseEntity deleteMateria(String codMateria) {
        try {
            materiaRepository.deleteById(codMateria);
            Optional<Materia> materia = materiaRepository.findById(codMateria);
            if (!materia.isEmpty()) {
                return new ResponseEntity<>(HttpStatus.INTERNAL_SERVER_ERROR);
            }
            return new ResponseEntity<>(materia, HttpStatus.OK);
        } catch (Exception e) {
            return new ResponseEntity<>(HttpStatus.INTERNAL_SERVER_ERROR);
        }
    }
}
