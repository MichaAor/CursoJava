package com.bootcamp.APIDia25ChallengeAlgoritmo.Controller;


import com.bootcamp.APIDia25ChallengeAlgoritmo.InscripcionRequest;
import com.bootcamp.APIDia25ChallengeAlgoritmo.Model.Inscripcion;
import com.bootcamp.APIDia25ChallengeAlgoritmo.Service.InscripcionService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.List;

@RestController
@RequestMapping("/inscripciones")
public class InscripcionController {
    @Autowired
    InscripcionService is;

    @GetMapping
    public ArrayList<Inscripcion> getAllInscripciones(Model model){
       return is.getAllInscripciones();
    }

    @GetMapping("/Pcont/{pagNum}/{pagSize}")
    public List<Inscripcion> getAll(@PathVariable("pagNum") int pagNum,
                                @PathVariable("pagSize") int pagSize) {
        return is.getAllPage(pagNum,pagSize);
    }

    @GetMapping("/PTPag/{actual}/{size}")
    public int getTotalPageByPage(@PathVariable int actual,@PathVariable int size){
        return is.getTotalPagesPage(actual,size);
    }

    @GetMapping("/PElPag/{actual}/{size}")
    public long getTotalElementsByPage(@PathVariable int actual,@PathVariable int size){
        return is.getTotalElementsPage(actual,size);
    }


    @GetMapping("/Scont/{actual}/{size}/{sort}/{sortField}")
    public List<Inscripcion> getEstSort(@PathVariable int actual,@PathVariable int size,@PathVariable String sort,@PathVariable String sortField){
        return is.getContentBySort(actual,size,sort,sortField);
    }

    @GetMapping("/STPag/{actual}/{size}/{sort}/{sortField}")
    public int getTotalPageBySort(@PathVariable int actual,@PathVariable int size,@PathVariable String sort,@PathVariable String sortField){
        return is.getTPagBySort(actual,size,sort,sortField);
    }

    @GetMapping("/SElPag/{actual}/{size}/{sort}/{sortField}")
    public long getTotalElementsBySort(@PathVariable int actual,@PathVariable int size,@PathVariable String sort,@PathVariable String sortField){
        return is.getTElBySort(actual,size,sort,sortField);
    }

    @PostMapping
    public void registrarInscripcion(@RequestBody InscripcionRequest ir) {
        is.registrarInscripcion(ir.getCodMat(),ir.getDniEst());
    }

    @GetMapping("/estudiante/{nombre}")
    public List<Inscripcion> getInsByEstNomb(@PathVariable("nombre") String nombre) {
       return is.getInsByEstNomb(nombre);
    }

    @GetMapping("/materia/{nombre}")
    public List<Inscripcion> getInsByMatNomb(@PathVariable("nombre") String nombre) {
        return is.getInsByMatNomb(nombre);
    }



    @DeleteMapping("/{id}")
    public void deleteInscripcion(@PathVariable("id") long id) {
        is.deleteInscripcion(id);
    }
}
