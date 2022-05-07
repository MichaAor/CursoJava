package com.bootcamp.ApiDia23.Controller;

import com.bootcamp.ApiDia23.Controller.Service.ClientService;
import com.bootcamp.ApiDia23.Model.Client;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

@Controller
@RequestMapping("/clients")
public class ClientController {
    @Autowired
    ClientService cs;

    @GetMapping
    public String getAllClients(Model model){
        model.addAttribute("clients",cs.getAllClients());
        return "clientIndex";
    }

    @GetMapping("/find")
    public String getClientByDni(Model model,@RequestParam String dni){
        model.addAttribute("clients",cs.getClientByDni(dni));
        return "clientIndex";
    }

    @GetMapping("/create")
    public String showFormClient(Model model){
        Client client = new Client();
        model.addAttribute("client",client);
        return "clientCreate";
    }

    @PostMapping("/create")
    public String registerClient(@ModelAttribute("client") Client client){
        cs.registerClient(client);
        return "redirect:/clients";
    }

    @GetMapping("/update/{dni}")
    public String showFormModifyClient(@PathVariable("dni")String dni, Model model){
        Client client = cs.getClientByDni(dni);
        model.addAttribute("client",client);
        return "clientUpdate";
    }

    @PostMapping("/update/{dni}")
    public String modifyClient(@ModelAttribute("client") Client client, @PathVariable("dni")String dni){
        cs.modifyClient(client,dni);
        return "redirect:/clients";
    }

    @GetMapping("/delete/{dni}")
    public String deleteClient(@PathVariable("dni") String dni){
        cs.deleteClient(dni);
        return "redirect:/clients";
    }



    
    
    

}
