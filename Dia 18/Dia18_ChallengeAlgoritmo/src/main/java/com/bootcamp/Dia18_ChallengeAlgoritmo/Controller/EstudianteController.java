package com.bootcamp.Dia18_ChallengeAlgoritmo.Controller;

import com.bootcamp.Dia18_ChallengeAlgoritmo.Controller.Service.EstudianteService;
import com.bootcamp.Dia18_ChallengeAlgoritmo.Model.Estudiante;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.Optional;

@Controller
@RequestMapping("/estudiantes")
//@Api(value = "Controller Estudiantes")
public class EstudianteController {
    @Autowired
    EstudianteService estudianteService;

    @GetMapping
    public String getAllEstudiantes(Model model) {
        model.addAttribute("estudiantes",estudianteService.getAllEstudiantes());
        return "EstudienteTemplates/EstudianteIndex";
    }

    @GetMapping("/estudiante/{dni}")
    public ResponseEntity<Optional<Estudiante>> getEstudianteByDni(@PathVariable("dni") String dni) {
        if(dni == null){
            return new ResponseEntity<>(HttpStatus.NOT_ACCEPTABLE);
        }
        return estudianteService.getEstudianteByDni(dni);
    }

    @GetMapping("/{name}")
    public ResponseEntity<ArrayList<Estudiante>> getEstudiantesByName(@PathVariable("name") String name) {
        if(name == null){
            return new ResponseEntity<>(HttpStatus.NOT_ACCEPTABLE);
        }
        return estudianteService.getEstudiantesByName(name);
    }

    @GetMapping("/estudiante")
    public String showFormEstudiantes(Model model) {
        Estudiante estudiante = new Estudiante();
        model.addAttribute("estudiante",estudiante);
        return "EstudianteTemplates/EstudianteCreate";
    }

    @PostMapping("/estudiante")
    public String registerEstudiante(@ModelAttribute("estudiante") Estudiante estudiante) {
        estudianteService.registerEstudiante(estudiante);
        return "redirect:/estudiantes";
    }



    @PutMapping("/estudiante")
    public Estudiante modifyUser(@RequestBody Estudiante estudiante) {
        return estudianteService.registerEstudiante(estudiante);
    }

    @DeleteMapping("/estudiante/{dni}")
    public ResponseEntity deleteEstudiante(@PathVariable("dni") String dni){
        if(dni == null){
            return new ResponseEntity<>(HttpStatus.NOT_ACCEPTABLE);
        }
        return estudianteService.deleteEstudiante(dni);
    }
}
