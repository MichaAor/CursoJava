package com.bootcamp.MVCDia25ChallengeAlgoritmo.Controller;


import com.bootcamp.MVCDia25ChallengeAlgoritmo.Controller.Service.MateriaService;
import com.bootcamp.MVCDia25ChallengeAlgoritmo.Model.Materia;
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

    @GetMapping("/page/{pagNum}/{pagSize}")
    public String getAllMatPage(Model model, @PathVariable int pagNum, @PathVariable int pagSize){
        model.addAttribute("materias", ms.getContentPage(pagNum,pagSize));
        model.addAttribute("totalPage", ms.getTotalPagesPage(pagNum,pagSize));
        model.addAttribute("totalElements", ms.getTotalElementsPage(pagNum,pagSize));
        model.addAttribute("numPageActual", pagNum);
        model.addAttribute("numSize", pagSize);
        return "MateriaTemplates/MateriaIndex";
    }

    @GetMapping("/sort/{pagNum}/{pagSize}/{sort}/{sortfield}")
    public String getAllMatSort(Model model, @PathVariable int pagNum,
                                @PathVariable int pagSize,
                                @PathVariable String sort,
                                @PathVariable String sortField){
        model.addAttribute("materias", ms.getContentSort(pagNum,pagSize,sort,sortField));
        model.addAttribute("totalPage", ms.getTotalPagesSort(pagNum,pagSize,sort,sortField));
        model.addAttribute("totalElements", ms.getTotalElementsSort(pagNum,pagSize,sort,sortField));
        model.addAttribute("numPageActual", pagNum);
        model.addAttribute("numSize", pagSize);
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

    @GetMapping("/findCod")
    public String getMateriaByCod(@RequestParam("codMat") long codMat, Model model) {
        model.addAttribute("materias",ms.getMateriaByCod(codMat));
        return "MateriaTemplates/MateriaIndex";
    }

    @GetMapping("/findNombre")
    public String getMateriaByNombre(@RequestParam("nombre") String nombre, Model model) {
        model.addAttribute("materias",ms.getMateriaByNombre(nombre));
        return "MateriaTemplates/MateriaIndex";
    }



}
