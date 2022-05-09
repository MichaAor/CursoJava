package com.bootcamp.Dia22_ChallengeAlgoritmo.Controller;

import com.bootcamp.Dia22_ChallengeAlgoritmo.Controller.Service.EstudianteService;
import com.bootcamp.Dia22_ChallengeAlgoritmo.Model.Estudiante;
import com.bootcamp.Dia22_ChallengeAlgoritmo.Model.Inscripcion;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

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
    public String modifyEstudiante(@PathVariable("dni") long dni, Model model) {
        Estudiante estudiante = es.getEstudianteByDni(dni);
        model.addAttribute("estudiante", estudiante);
        return "EstudianteTemplates/EstudianteEdit";
    }
    @PostMapping("/update/{dni}")
    public String modifyEstudiante(@ModelAttribute("estudiante") Estudiante estudiante,
                                   @PathVariable("dni") long dni) {
        es.modifyEstudiante(estudiante,dni);
        return "redirect:/estudiantes";
    }

    @GetMapping("/delete/{dni}")
    public String deleteEstudiante(@PathVariable("dni") long dni){
       es.deleteEstudiante(dni);
       return "redirect:/estudiantes";
    }


    @GetMapping("/find")
    public String getEstudianteByDni(@RequestParam("dni") long dni, Model model) {
        model.addAttribute("estudiantes",es.getEstudianteByDni(dni));
        return "EstudianteTemplates/EstudianteIndex";
    }


}
