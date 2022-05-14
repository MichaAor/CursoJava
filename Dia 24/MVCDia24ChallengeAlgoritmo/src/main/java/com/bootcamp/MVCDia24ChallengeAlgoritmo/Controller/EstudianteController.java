package com.bootcamp.MVCDia24ChallengeAlgoritmo.Controller;


import com.bootcamp.MVCDia24ChallengeAlgoritmo.Controller.Service.EstudianteService;
import com.bootcamp.MVCDia24ChallengeAlgoritmo.Model.Estudiante;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

import java.util.List;

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

    @GetMapping("/page/{pagNum}/{pagSize}")
    public String getAllEstPage(Model model, @PathVariable int pagNum, @PathVariable int pagSize){
        model.addAttribute("estudiantes", es.getContentPage(pagNum,pagSize));
        model.addAttribute("totalPage", es.getTotalPagesPage(pagNum,pagSize));
        model.addAttribute("totalElements", es.getTotalElementsPage(pagNum,pagSize));
        model.addAttribute("numPageActual", pagNum);
        model.addAttribute("numSize", pagSize);
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


    @GetMapping("/findDni")
    public String getEstudianteByDni(@RequestParam("dni") long dni, Model model) {
        model.addAttribute("estudiantes",es.getEstudianteByDni(dni));
        return "EstudianteTemplates/EstudianteIndex";
    }

    @GetMapping("/findNombre")
    public String getEstudiantesByNombre(@RequestParam("nombre") String nombre, Model model) {
        model.addAttribute("estudiantes",es.getEstudianteByNombre(nombre));
        return "EstudianteTemplates/EstudianteIndex";
    }

    @GetMapping("/findApellido")
    public String getEstudiantesByApellido(@RequestParam("apellido") String apellido, Model model) {
        model.addAttribute("estudiantes",es.getEstudianteByApellido(apellido));
        return "EstudianteTemplates/EstudianteIndex";
    }

}
