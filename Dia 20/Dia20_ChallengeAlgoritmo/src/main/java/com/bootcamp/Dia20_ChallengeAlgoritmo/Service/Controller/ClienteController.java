package com.bootcamp.Dia20_ChallengeAlgoritmo.Service.Controller;

import com.bootcamp.Dia20_ChallengeAlgoritmo.Model.Cliente;
import com.bootcamp.Dia20_ChallengeAlgoritmo.Service.ClienteService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

@Controller
@RequestMapping
public class ClienteController {
    @Autowired
    ClienteService service;

    @GetMapping
    public String getAllClientes(Model model) {
        model.addAttribute("clientes", service.getAllClientes());
        return "index";
    }

    @GetMapping("/create")
    public String showForCliente(Model model) {
        Cliente cliente = new Cliente();
        model.addAttribute("cliente", cliente);
        return "createCliente";
    }

    @PostMapping("/create")
    public String saveCliente(@ModelAttribute("cliente") Cliente cliente) {
       service.registrarCliente(cliente);
        return "redirect:/";
    }

    @GetMapping("/update/{dni}")
    public String updateCliente(@PathVariable("dni") String dni, Model model) {
        Cliente cliente = service.getClienteById(dni);
        model.addAttribute("cliente", cliente);
        return "update_cliente";
    }

    @PostMapping("/update/{dni}")
    public String updateCliente(@ModelAttribute("cliente") Cliente cliente, @PathVariable("dni") String dni) {
        //unidad.setId(id);
        service.registrarCliente(cliente);
        return "redirect:/";
    }
}
