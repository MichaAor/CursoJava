package com.bootcamp.APIDia24ChallengeAlgoritmo.Controller;

import com.bootcamp.APIDia24ChallengeAlgoritmo.Model.Estudiante;
import com.bootcamp.APIDia24ChallengeAlgoritmo.Service.EstudianteService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
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

    @GetMapping("/page/content/{pagNum}/{pagSize}")
    public List<Estudiante> getAll(@PathVariable("pagNum") int pagNum,
                                   @PathVariable("pagSize") int pagSize) {
        return es.getAllPage(pagNum,pagSize);
    }

    @GetMapping("/page/tPages/{pagNum}/{pagSize}")
    public long getTotalPagesPage(@PathVariable("pagNum") int pagNum,
                                   @PathVariable("pagSize") int pagSize) {
        return es.getTotalPagesPage(pagNum,pagSize);
    }

    @GetMapping("/page/tEl/{pagNum}/{pagSize}")
    public long getTotalElementsPage(@PathVariable("pagNum") int pagNum,
                                  @PathVariable("pagSize") int pagSize) {
        return es.getTotalElementsPage(pagNum,pagSize);
    }



    @GetMapping("/asc/content/{pagNum}/{pagSize}")
    public List<Estudiante> getAscAll(@PathVariable("pagNum") int pagNum,
                                      @PathVariable("pagSize") int pagSize) {
        return es.asc(pagNum,pagSize);
    }

    @GetMapping("/asc/tPages/{pagNum}/{pagSize}")
    public int getAscTotalPages(@PathVariable("pagNum") int pagNum,
                                      @PathVariable("pagSize") int pagSize) {
        return es.getTotalPagesAsc(pagNum,pagSize);
    }

    @GetMapping("/asc/tEl/{pagNum}/{pagSize}")
    public long getAscTotalElements(@PathVariable("pagNum") int pagNum,
                                @PathVariable("pagSize") int pagSize) {
        return es.getTotalElementsAsc(pagNum,pagSize);
    }

    @GetMapping("/desc/content/{pagNum}/{pagSize}")
    public List<Estudiante> getDescAll(@PathVariable("pagNum") int pagNum,
                                       @PathVariable("pagSize") int pagSize) {
        return es.desc(pagNum,pagSize);
    }

    @GetMapping("/desc/tPages/{pagNum}/{pagSize}")
    public int getDescTotalPages(@PathVariable("pagNum") int pagNum,
                                       @PathVariable("pagSize") int pagSize) {
        return es.getTotalPagesDes(pagNum,pagSize);
    }

    @GetMapping("/desc/tEl/{pagNum}/{pagSize}")
    public long getDescTotalElements(@PathVariable("pagNum") int pagNum,
                                 @PathVariable("pagSize") int pagSize) {
        return es.getTotalElementsDes(pagNum,pagSize);
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
