package com.bootcamp.APIDia24ChallengeAlgoritmo.Controller;

import com.bootcamp.APIDia24ChallengeAlgoritmo.Model.Estudiante;
import com.bootcamp.APIDia24ChallengeAlgoritmo.Service.EstudianteService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;

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

    @GetMapping("/page/{pagNum}/{pagSize}")
    public Page<Estudiante> getAll(@PathVariable("pagNum") int pagNum,
                                   @PathVariable("pagSize") int pagSize) {
        return es.getAll(pagNum,pagSize);
    }

    @GetMapping("/asc/{pagNum}/{pagSize}")
    public Page<Estudiante> getAscAll(@PathVariable("pagNum") int pagNum,
                                      @PathVariable("pagSize") int pagSize) {
        return es.asc(pagNum,pagSize);
    }

    @GetMapping("/desc/{pagNum}/{pagSize}")
    public Page<Estudiante> getDescAll(@PathVariable("pagNum") int pagNum,
                                       @PathVariable("pagSize") int pagSize) {
        return es.desc(pagNum,pagSize);
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
