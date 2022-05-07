package com.bootcamp.Dia22_ChallengeAlgoritmo.Controller;

import com.bootcamp.Dia22_ChallengeAlgoritmo.Controller.Service.EstudianteService;
import com.bootcamp.Dia22_ChallengeAlgoritmo.Model.Estudiante;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;

@Controller
@RequestMapping("/estudiantes")
//@Api(value = "Controller Estudiantes")
public class EstudianteController {
    @Autowired
    EstudianteService es;

    @GetMapping
    public String getAllEstudiantes(Model model) {
        model.addAttribute("estudiantes", es.getAllEstudiantes());
        return "EstudianteTemplates/EstudianteIndex";
    }

    @GetMapping("/create")
    public String showFormEstudiantes(Model model) {
        Estudiante estudiante = new Estudiante();
        model.addAttribute("estudiante",estudiante);
        return "EstudianteTemplates/EstudianteCreate";
    }

    @PostMapping("/create")
    public String registerEstudiante(@ModelAttribute("estudiante") Estudiante estudiante) {
        es.registerEstudiante(estudiante);
        return "redirect:/estudiantes";
    }


    @GetMapping("/update/{dni}")
    public String modifyEstudiante(@PathVariable("dni") String dni, Model model) {
        Estudiante estudiante = es.getEstudianteByDni(dni);
        model.addAttribute("estudiante", estudiante);
        return "EstudianteTemplates/EstudianteEdit";
    }
    @PostMapping("/update/{dni}")
    public String modifyEstudiante(@ModelAttribute("estudiante") Estudiante estudiante,
                                   @PathVariable("dni") String dni) {
        es.modifyEstudiante(estudiante,dni);
        return "redirect:/estudiantes";
    }

    @GetMapping("/delete/{dni}")
    public String deleteEstudiante(@PathVariable("dni") String dni){
       es.deleteEstudiante(dni);
       return "redirect:/estudiantes";
    }


///////NO PROBADOS
    @GetMapping("/estudiante/{dni}")
    public Estudiante getEstudianteByDni(@PathVariable("dni") String dni) {
        return es.getEstudianteByDni(dni);
    }

    @GetMapping("/{name}")
    public ResponseEntity<ArrayList<Estudiante>> getEstudiantesByName(@PathVariable("name") String name) {
        if(name == null){
            return new ResponseEntity<>(HttpStatus.NOT_ACCEPTABLE);
        }
        return es.getEstudiantesByName(name);
    }
}
