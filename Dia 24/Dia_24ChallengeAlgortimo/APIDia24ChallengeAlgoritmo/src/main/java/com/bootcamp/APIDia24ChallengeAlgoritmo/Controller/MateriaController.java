package com.bootcamp.APIDia24ChallengeAlgoritmo.Controller;


import com.bootcamp.APIDia24ChallengeAlgoritmo.Model.Materia;
import com.bootcamp.APIDia24ChallengeAlgoritmo.Service.MateriaService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.List;

@RestController
@RequestMapping("/materias")
public class MateriaController {
    @Autowired
    MateriaService ms;

    @GetMapping
    public ArrayList<Materia> getAllMateria() {
        return ms.getAllMaterias();
    }

    @GetMapping("/Pcont/{pagNum}/{pagSize}")
    public List<Materia> getAll(@PathVariable("pagNum") int pagNum,
                                   @PathVariable("pagSize") int pagSize) {
        return ms.getAllPage(pagNum,pagSize);
    }

    @GetMapping("/PTPag/{actual}/{size}")
    public int getTotalPageByPage(@PathVariable int actual,@PathVariable int size){
        return ms.getTotalPagesPage(actual,size);
    }

    @GetMapping("/PElPag/{actual}/{size}")
    public long getTotalElementsByPage(@PathVariable int actual,@PathVariable int size){
        return ms.getTotalElementsPage(actual,size);
    }


    @GetMapping("/Scont/{actual}/{size}/{sort}/{sortField}")
    public List<Materia> getEstSort(@PathVariable int actual,@PathVariable int size,@PathVariable String sort,@PathVariable String sortField){
        return ms.getContentBySort(actual,size,sort,sortField);
    }

    @GetMapping("/STPag/{actual}/{size}/{sort}/{sortField}")
    public int getTotalPageBySort(@PathVariable int actual,@PathVariable int size,@PathVariable String sort,@PathVariable String sortField){
        return ms.getTPagBySort(actual,size,sort,sortField);
    }

    @GetMapping("/SElPag/{actual}/{size}/{sort}/{sortField}")
    public long getTotalElementsBySort(@PathVariable int actual,@PathVariable int size,@PathVariable String sort,@PathVariable String sortField){
        return ms.getTElBySort(actual,size,sort,sortField);
    }



    @GetMapping("/{codMat}")
    public Materia getMateriaByCodMat(@PathVariable("codMat") long codMat) {
        return ms.getMateriaByCod(codMat);
    }

    @GetMapping("/nombre/{nombre}")
    public List<Materia> getMateriaByCodMat(@PathVariable("nombre") String nombre) {
        return ms.byNombre(nombre);
    }


    @PostMapping
    public void registerMateria(@RequestBody Materia materia) {
        ms.registerMateria(materia);
    }


    @PutMapping("/update/{codMat}")
    public void modifyMateria(@RequestBody Materia materia,
                                 @PathVariable("codMat") long codMat){
        ms.modifyMateria(materia,codMat);
    }

    @DeleteMapping("/delete/{codMat}")
    public void deleteMateria(@PathVariable("codMat") long codMat){
        ms.deleteMateria(codMat);
    }

}
