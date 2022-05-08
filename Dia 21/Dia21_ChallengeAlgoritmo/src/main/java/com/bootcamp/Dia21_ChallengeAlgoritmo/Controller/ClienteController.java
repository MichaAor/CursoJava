package com.bootcamp.Dia21_ChallengeAlgoritmo.Controller;

import com.bootcamp.Dia21_ChallengeAlgoritmo.Controller.Service.ClienteService;
import com.bootcamp.Dia21_ChallengeAlgoritmo.Model.Cliente;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.multipart.MultipartFile;

import java.io.IOException;

@Controller
@RequestMapping("/clientes")
public class ClienteController {
    @Autowired
    ClienteService service;

    @GetMapping
    public String getAllClientes(Model model) {
        model.addAttribute("clientes", service.getAllClientes());
        return "index";
    }

    @GetMapping("/find")
    public String getClienteByDni(@RequestParam("dni")String dni,Model model){
        model.addAttribute("clientes",service.getClienteById(dni));
        return "index";
    }

    @GetMapping("/create")
    public String showForCliente(Model model) {
        Cliente cliente = new Cliente();
        model.addAttribute("cliente", cliente);
        return "createCliente";
    }

    @PostMapping("/create")
    public String saveCliente(@ModelAttribute("cliente") Cliente cliente,
                              @RequestParam("imagen") MultipartFile imagen) throws IOException {
        service.registrarCliente(cliente,imagen);
        return "redirect:/clientes";
    }

    @GetMapping("/update/{dni}")
    public String updateCliente(@PathVariable("dni") String dni, Model model) {
        Cliente cliente = service.getClienteById(dni);
        model.addAttribute("cliente", cliente);
        return "update_cliente";
    }
/*
    @PostMapping("/update/{dni}")
    public String updateCliente(@ModelAttribute("cliente") Cliente cliente, @PathVariable("dni") String dni) {
        //unidad.setId(id);
        service.registrarCliente(cliente);
        return "redirect:/clientes";
    }*/
}
