package com.bootcamp.Dia17_ChallengeAlgoritmo.Service;

import com.bootcamp.Dia17_ChallengeAlgoritmo.Model.MateriaModel;
import com.bootcamp.Dia17_ChallengeAlgoritmo.Respository.MateriaRepository;
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

    public ResponseEntity<ArrayList<MateriaModel>> getAllMaterias(){
        try {
            ArrayList<MateriaModel> materias = new ArrayList<MateriaModel>();
            materiaRepository.findAll().forEach(materias::add);
            if (materias.isEmpty()) {
                return new ResponseEntity<>(HttpStatus.NO_CONTENT);
            }
            return new ResponseEntity<>(materias, HttpStatus.OK);
        } catch (Exception e) {
            return new ResponseEntity<>(HttpStatus.INTERNAL_SERVER_ERROR);
        }
    }

    public ResponseEntity<Optional<MateriaModel>>getMateriaByCod(String codMateria) {
        try {
            Optional<MateriaModel> materias = materiaRepository.findById(codMateria);
            if (materias.isEmpty()) {
                return new ResponseEntity<>(HttpStatus.NO_CONTENT);
            }
            return new ResponseEntity<>(materias, HttpStatus.OK);
        } catch (Exception e) {
            return new ResponseEntity<>(null,HttpStatus.INTERNAL_SERVER_ERROR);
        }
    }



    public ResponseEntity<MateriaModel> registerMateria(MateriaModel materia) {
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
            Optional<MateriaModel> materia = materiaRepository.findById(codMateria);
            if (materia.isEmpty()) {
                return new ResponseEntity<>(HttpStatus.NO_CONTENT);
            }
            return new ResponseEntity<>(materia, HttpStatus.OK);
        } catch (Exception e) {
            return new ResponseEntity<>(HttpStatus.INTERNAL_SERVER_ERROR);
        }
    }
}
