package com.bootcamp.MVCDia24ChallengeAlgoritmo.Controller;

import com.bootcamp.MVCDia24ChallengeAlgoritmo.Controller.Service.InscripcionService;
import com.bootcamp.MVCDia24ChallengeAlgoritmo.Controller.Service.MateriaService;
import com.bootcamp.MVCDia24ChallengeAlgoritmo.InscripcionRequest;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

@Controller
@RequestMapping("/inscripciones")
public class InscripcionController {
    @Autowired
    InscripcionService is;

    @Autowired
    MateriaService ms;

    @GetMapping
    public String getAllInscripciones(Model model){
        model.addAttribute("inscripciones",is.getAllInscripciones());
        model.addAttribute("materias",ms.getAllMaterias());
        InscripcionRequest inscripcionRequest = new InscripcionRequest();
        model.addAttribute("inscripcionRequest", inscripcionRequest);
        return "InscripcionIndex";
    }

    @GetMapping("/sort/{pagNum}/{pagSize}/{sort}/{sortField}")
    public String getAllInscripciones(Model model,@PathVariable int pagNum,
                                      @PathVariable int pagSize,
                                      @PathVariable String sort,
                                      @PathVariable String sortField){
        model.addAttribute("inscripciones", is.getContentSort(pagNum,pagSize,sort,sortField));
        model.addAttribute("totalPage", is.getTotalPagesSort(pagNum,pagSize,sort,sortField));
        model.addAttribute("totalElements", is.getTotalElementsSort(pagNum,pagSize,sort,sortField));
        model.addAttribute("numPageActual", pagNum);
        model.addAttribute("numSize", pagSize);
        model.addAttribute("materias",ms.getAllMaterias());
        InscripcionRequest inscripcionRequest = new InscripcionRequest();
        model.addAttribute("inscripcionRequest", inscripcionRequest);
        return "InscripcionIndex";
    }




    @PostMapping
    public String registrarInscripcion(@ModelAttribute("inscripcionRequest") InscripcionRequest ir) {
        is.registrarInscripcion(ir);
        return "redirect:/inscripciones";
    }

    @GetMapping("/deleteInscripcion/{id}")
    public String deleteInscripcion(@PathVariable("id") long id) {
        is.deleteInscripcion(id);
        return "redirect:/inscripciones";
    }

    @GetMapping("/findMat")
    public String getMatByCod(@RequestParam("nombre") String nombre, Model model) {
        model.addAttribute("inscripciones",ms.getMateriaByNombre(nombre));
        return "InscripcionIndex";
    }

    @GetMapping("/findEst")
    public String getEstByCod(@RequestParam("nombre") String nombre, Model model) {
        model.addAttribute("inscripciones",ms.getMateriaByNombre(nombre));
        return "InscripcionIndex";
    }







}
