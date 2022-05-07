package com.bootcamp.Dia22PairProgramming.Controller;

import com.bootcamp.Dia22PairProgramming.Model.Especialidad;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.client.RestTemplate;

import java.util.ArrayList;

@Controller
@RequestMapping("/especialidades")
public class EspecialidadController {


    @GetMapping
    public String getAllEspecialidades(Model model){
        String uri = "http://localhost:8081/especialidades/list";
        RestTemplate restTemplate = new RestTemplate();
        ArrayList especialidades = restTemplate.getForObject(uri,ArrayList.class);

        model.addAttribute("especialidades",especialidades);
        return "EspecialidadIndex";
    }

    @GetMapping("/create")
    public String showFormEspecialidad(Model model){
        Especialidad especialidad = new Especialidad();
        model.addAttribute("especialidad",especialidad);
        return "EspecialidadCreate";
    }

    @PostMapping("/create")
    public String registerEspecialidad(@ModelAttribute("especialidad") Especialidad especialidad){
        String uri = "http://localhost:8081/especialidades/create";
        RestTemplate restTemplate = new RestTemplate();
        restTemplate.postForObject(uri,especialidad,Especialidad.class);
        return "redirect:/especialidades";
    }

    @GetMapping("/update/{dni}")
    public String showFormModifyEspecialidad(@PathVariable("dni")String dni, Model model){
        String uri = "http://localhost:8081";
        RestTemplate restTemplate = new RestTemplate();
        Especialidad especialidad = restTemplate.getForObject(uri,Especialidad.class);
        return "clientUpdate";
    }
/*
    @PostMapping("/update/{dni}")
    public String modifyEspecialidad(@ModelAttribute("especialidad") Especialidad especialidad, @PathVariable("id")String id){
        String uri = "uriApi";
        RestTemplate restTemplate = new RestTemplate();
        Especialidad especialidad = restTemplate.getForObject(uri,Especialidad.class);
        return "redirect:/especialidades";
    }
*/
    @GetMapping("/delete/{dni}")
    public String deleteClient(@PathVariable("dni") String dni){

        return "redirect:/especialidades";
    }
}
