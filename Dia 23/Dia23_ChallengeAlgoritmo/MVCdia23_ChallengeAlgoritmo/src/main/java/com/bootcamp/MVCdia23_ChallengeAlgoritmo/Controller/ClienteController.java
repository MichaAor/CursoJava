package com.bootcamp.MVCdia23_ChallengeAlgoritmo.Controller;

import com.bootcamp.MVCdia23_ChallengeAlgoritmo.Controller.Service.ClienteService;
import com.bootcamp.MVCdia23_ChallengeAlgoritmo.Model.Cliente;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

@Controller
@RequestMapping("/clientes")
public class ClienteController {
    @Autowired
    ClienteService cs;

    @GetMapping
    public String getAllClientes(Model model){
        model.addAttribute("clientes",cs.getAllClientes());
        return "ClienteIndex";
    }

    @GetMapping("/find")
    public String getClienteByDni(@RequestParam("dni") long dni, Model model) {
        model.addAttribute("clientes",cs.getClienteByDni(dni));
        return "ClienteIndex";
    }


    @GetMapping("/create")
    public String showFormCliente(Model model) {
        Cliente cliente = new Cliente();
        model.addAttribute("cliente", cliente);
        return "ClienteCreate";
    }

    @PostMapping("/create")
    public String registerCliente(@ModelAttribute("cliente") Cliente cliente) {
        cs.saveCliente(cliente);
        return "redirect:/clientes";
    }


    @GetMapping("/update/{dni}")
    public String modifyCliente(@PathVariable("dni") long dni, Model model) {
        Cliente cliente = cs.getClienteByDni(dni);
        model.addAttribute("cliente", cliente);
        return "ClienteEdit";
    }

    @PostMapping("/update/{dni}")
    public String modifyCliente(@ModelAttribute("cliente") Cliente cliente,
                             @PathVariable("dni") long dni) {
        cs.modifyCliente(cliente,dni);
        return "redirect:/clientes";
    }


    @GetMapping("/delete/{dni}")
    public String deleteCliente(@PathVariable("dni") long dni){
        cs.deleteCliente(dni);
        return "redirect:/clientes";
    }

}

