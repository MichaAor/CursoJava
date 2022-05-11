package com.bootcamp.MVCdia23_ChallengeAlgoritmo.Controller.Service;

import com.bootcamp.MVCdia23_ChallengeAlgoritmo.Controller.Repository.ClienteRepository;
import com.bootcamp.MVCdia23_ChallengeAlgoritmo.Model.Cliente;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

import java.util.ArrayList;

@Service
public class ClienteService {
    @Autowired
    ClienteRepository cr;

    public ArrayList<Cliente> getAllClientes(){
        return cr.getAllClientes();
    }

    public Cliente getClienteByDni(long dni){
        return cr.getClienteByDni(dni);
    }

    public void saveCliente(Cliente cliente){
        cr.saveCliente(cliente);
    }

    public void deleteCliente(long dni){
        cr.deleteCliente(dni);
    }

    public void modifyCliente(Cliente cliente,long dni){
        cr.modifyCliente(cliente,dni);
    }
}
