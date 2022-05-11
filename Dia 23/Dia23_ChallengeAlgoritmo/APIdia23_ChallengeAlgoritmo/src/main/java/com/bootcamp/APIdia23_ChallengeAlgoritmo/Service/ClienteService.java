package com.bootcamp.APIdia23_ChallengeAlgoritmo.Service;


import com.bootcamp.APIdia23_ChallengeAlgoritmo.Controller.ClienteController;
import com.bootcamp.APIdia23_ChallengeAlgoritmo.Model.Cliente;
import com.bootcamp.APIdia23_ChallengeAlgoritmo.Repository.ClienteRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;

@Service
public class ClienteService {
    @Autowired
    ClienteRepository cr;

    public ArrayList<Cliente> getAllClientes(){
        return (ArrayList<Cliente>) cr.findAll();
    }

    public Cliente getClienteByDni(long dni){
        return cr.getByDni(dni);
    }

    public void saveCliente(Cliente cliente){
        cr.save(cliente);
    }

    public void deleteCliente(long dni){
        cr.deleteById(dni);
    }

    public void modifyCliente(Cliente cliente,long dni){
        cliente.setDni(dni);
        cr.save(cliente);
    }
}
