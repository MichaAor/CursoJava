package com.bootcamp.Dia20_ChallengeAlgoritmo.Service;

import com.bootcamp.Dia20_ChallengeAlgoritmo.Model.Cliente;
import com.bootcamp.Dia20_ChallengeAlgoritmo.Repository.ClienteRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;

@Service
public class ClienteService {
    @Autowired
    ClienteRepository clienteRepository;

    public Cliente getClienteById(String id){
        return clienteRepository.findById(id).get();
    }

    public ArrayList<Cliente> getAllClientes(){
        return (ArrayList<Cliente>) clienteRepository.findAll();
    }

    public String registrarCliente(Cliente cliente){
        clienteRepository.save(cliente);
        return "Registrado";
    }

    public String modificarCliente(String id, Cliente cliente){
        Cliente cliente1 = clienteRepository.findById(id).get();
        cliente1 = cliente;
        return "Modificado";
    }

    public String borrarUnidad(String id){
        clienteRepository.deleteById(id);
        return "Cliente Eliminada";
    }
}
