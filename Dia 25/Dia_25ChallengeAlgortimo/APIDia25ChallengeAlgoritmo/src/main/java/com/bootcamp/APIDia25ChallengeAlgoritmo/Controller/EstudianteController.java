package com.bootcamp.APIDia25ChallengeAlgoritmo.Controller;

import com.bootcamp.APIDia25ChallengeAlgoritmo.Model.Estudiante;
import com.bootcamp.APIDia25ChallengeAlgoritmo.Service.EstudianteService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.List;

@RestController
@RequestMapping("/estudiantes")
//@Api(value = "Controller Estudiantes")
public class EstudianteController {
    @Autowired
    EstudianteService es;

    @GetMapping
    public ArrayList<Estudiante> getAllEstudiantes() {
        return es.getAllEstudiantes();
    }

    @GetMapping("/Pcont/{pagNum}/{pagSize}")
    public List<Estudiante> getAll(@PathVariable("pagNum") int pagNum,
                                   @PathVariable("pagSize") int pagSize) {
        return es.getAllPage(pagNum,pagSize);
    }

    @GetMapping("/PTPag/{actual}/{size}")
    public int getTotalPageByPage(@PathVariable int actual,@PathVariable int size){
        return es.getTotalPagesPage(actual,size);
    }

    @GetMapping("/PElPag/{actual}/{size}")
    public long getTotalElementsByPage(@PathVariable int actual,@PathVariable int size){
        return es.getTotalElementsPage(actual,size);
    }


    @GetMapping("/Scont/{actual}/{size}/{sort}/{sortField}")
    public List<Estudiante> getEstSort(@PathVariable int actual,@PathVariable int size,@PathVariable String sort,@PathVariable String sortField){
      return es.getContentBySort(actual,size,sort,sortField);
    }

    @GetMapping("/STPag/{actual}/{size}/{sort}/{sortField}")
    public int getTotalPageBySort(@PathVariable int actual,@PathVariable int size,@PathVariable String sort,@PathVariable String sortField){
        return es.getTPagBySort(actual,size,sort,sortField);
    }

    @GetMapping("/SElPag/{actual}/{size}/{sort}/{sortField}")
    public long getTotalElementsBySort(@PathVariable int actual,@PathVariable int size,@PathVariable String sort,@PathVariable String sortField){
        return es.getTElBySort(actual,size,sort,sortField);
    }




    @GetMapping("/dni/{dni}")
    public Estudiante getEstudianteByDni(@PathVariable("dni") long dni) {
        return es.byId(dni);
    }

    @GetMapping("/nombre/{nombre}")
    public ArrayList<Estudiante> getEstudiantesByNombre(@PathVariable("nombre") String nombre) {
        return es.byNombre(nombre);
    }

    @GetMapping("/apellido/{apellido}")
    public ArrayList<Estudiante> getEstudiantesByName(@PathVariable("apellido") String apellido) {
        return es.byApellido(apellido);
    }

    @PostMapping
    public void registerEstudiante(@RequestBody Estudiante estudiante) {
        es.registerEstudiante(estudiante);
    }


    @PutMapping("/update/{dni}")
    public void modifyEstudiante(@RequestBody Estudiante estudiante,
                                 @PathVariable("dni") long dni) {
        es.modifyEstudiante(estudiante,dni);
    }

    @DeleteMapping("/delete/{dni}")
    public void deleteEstudiante(@PathVariable("dni") long dni){
       es.deleteEstudiante(dni);
    }





}
