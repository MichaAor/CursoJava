package com.bootcamp.ApiDia23.Controller.Service;


import com.bootcamp.ApiDia23.Controller.Repository.ClientRepository;
import com.bootcamp.ApiDia23.Model.Client;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;

@Service
public class ClientService {
    @Autowired
    ClientRepository cr;

    public ArrayList<Client> getAllClients(){
        return (ArrayList<Client>) cr.findAll();
    }

    public Client getClientByDni(String dni){
        return cr.getClientByDni(dni);
    }

    public void registerClient(Client client){
        cr.save(client);
    }

    public void modifyClient(Client client,String dni){
        client.setDni(dni);
        cr.save(client);
    }

    public void deleteClient(String dni){
        cr.deleteById(dni);
    }
}
