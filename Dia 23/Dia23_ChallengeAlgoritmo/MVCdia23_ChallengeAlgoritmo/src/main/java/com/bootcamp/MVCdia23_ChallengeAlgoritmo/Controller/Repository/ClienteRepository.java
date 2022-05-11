package com.bootcamp.MVCdia23_ChallengeAlgoritmo.Controller.Repository;

import com.bootcamp.MVCdia23_ChallengeAlgoritmo.Model.Cliente;
import org.springframework.stereotype.Repository;
import org.springframework.web.client.RestTemplate;

import java.util.ArrayList;

@Repository
public class ClienteRepository {
    public ArrayList<Cliente> getAllClientes(){
        RestTemplate rt = new RestTemplate();
        String url = "http://localhost:8081/clientes";
        ArrayList<Cliente> clientes = rt.getForObject(url,ArrayList.class);
        return clientes;
    }

    public Cliente getClienteByDni(long dni){
        RestTemplate rt = new RestTemplate();
        String url = "http://localhost:8081/clientes/"+dni;
        Cliente cliente = rt.getForObject(url,Cliente.class);
        return cliente;
    }

    public void saveCliente(Cliente cliente){
        RestTemplate rt = new RestTemplate();
        String url = "http://localhost:8081/clientes";
        rt.postForObject(url,cliente,Cliente.class);
    }

    public void deleteCliente(long dni){
        String url = "http://localhost:8081/clientes/delete/"+dni;
        RestTemplate rt = new RestTemplate();
        rt.delete(url);
    }

    public void modifyCliente(Cliente cliente,long dni){
        String url = "http://localhost:8081/clientes/update/"+dni;
        RestTemplate rt = new RestTemplate();
        rt.postForObject(url,cliente,Cliente.class);
    }

}
