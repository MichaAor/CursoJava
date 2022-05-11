package com.bootcamp.APIdia23_ChallengeAlgoritmo.Controller;

import com.bootcamp.APIdia23_ChallengeAlgoritmo.Model.Cliente;
import com.bootcamp.APIdia23_ChallengeAlgoritmo.Service.ClienteService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;

@RestController
@RequestMapping("/clientes")
public class ClienteController {
    @Autowired
    ClienteService cs;

    @GetMapping
    public ArrayList<Cliente> getAllClientes(){
        return cs.getAllClientes();
    }

    @GetMapping("/{dni}")
    public Cliente getClienteByDni(@PathVariable("dni") long dni) {
        return cs.getClienteByDni(dni);
    }


    @PostMapping
    public void registerCliente(@RequestBody Cliente cliente) {
        cs.saveCliente(cliente);
    }

    @PostMapping("/update/{dni}")
    public void modifyCliente(@RequestBody Cliente cliente,
                             @PathVariable("dni") long dni) {
        cs.modifyCliente(cliente,dni);
    }


    @DeleteMapping("/delete/{dni}")
    public void deleteCliente(@PathVariable("dni") long dni){
        cs.deleteCliente(dni);
    }

}

