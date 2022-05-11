package com.bootcamp.Dia22_ChallengeAlgoritmo.Controller;

import com.bootcamp.Dia22_ChallengeAlgoritmo.Controller.Service.MateriaService;
import com.bootcamp.Dia22_ChallengeAlgoritmo.Model.Materia;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

@Controller
@RequestMapping("/materias")
public class MateriaController {
    @Autowired
    MateriaService ms;

    @GetMapping
    public String getAllMaterias(Model model) {
        model.addAttribute("materias", ms.getAllMaterias());
        return "MateriaTemplates/MateriaIndex";
    }

    @GetMapping("/create")
    public String showFormMateria(Model model) {
        Materia materia= new Materia();
        model.addAttribute("materia",materia);
        return "MateriaTemplates/MateriaCreate";
    }

    @PostMapping("/create")
    public String registerMateria(@ModelAttribute("materia") Materia materia) {
        ms.registerMateria(materia);
        return "redirect:/materias";
    }


    @GetMapping("/update/{codMat}")
    public String modifyMateria(@PathVariable("codMat") long codMat, Model model) {
        Materia materia = ms.getMateriaByCod(codMat);
        model.addAttribute("materia", materia);
        return "MateriaTemplates/MateriaEdit";
    }
    @PostMapping("/update/{codMat}")
    public String modifyMateria(@ModelAttribute("materia") Materia materia,
                                   @PathVariable("codMat") long codMat) {
        ms.modifyMateria(materia,codMat);
        return "redirect:/materias";
    }

    @GetMapping("/deleteInscripcion/{codMat}")
    public String deleteMateria(@PathVariable("codMat") long codMat){
        ms.deleteMateria(codMat);
        return "redirect:/materias";
    }

    @GetMapping("/find")
    public String getMateriaByCod(@RequestParam("codMat") long codMat, Model model) {
        model.addAttribute("materias",ms.getMateriaByCod(codMat));
        return "MateriaTemplates/MateriaIndex";
    }

}
