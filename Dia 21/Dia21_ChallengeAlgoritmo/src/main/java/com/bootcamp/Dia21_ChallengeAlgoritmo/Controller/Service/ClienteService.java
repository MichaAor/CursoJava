package com.bootcamp.Dia21_ChallengeAlgoritmo.Controller.Service;

import com.bootcamp.Dia21_ChallengeAlgoritmo.Controller.Repository.ClienteRepository;
import com.bootcamp.Dia21_ChallengeAlgoritmo.Model.Cliente;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.core.io.Resource;
import org.springframework.stereotype.Service;
import org.springframework.web.multipart.MultipartFile;

import java.io.File;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.Calendar;

@Service
public class ClienteService {
    @Autowired
    ClienteRepository clienteRepository;

    @Autowired
    FilesStorageService fss;

    public Cliente getClienteById(String id){
        Cliente cliente = clienteRepository.findById(id).get();
        String url ="null";
        try {
            Resource fileData = fss.load(cliente.getAvatar());
            url = fileData.getURL().toString();
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
        cliente.setAvatar(url);

        return cliente;
    }

    public ArrayList<Cliente> getAllClientes(){
        ArrayList<Cliente> clientes = (ArrayList<Cliente>) clienteRepository.findAll();
            clientes.forEach(datos->{
                if(datos.getAvatar() != null ) {

                    String url="null";
                    try {
                        Resource fileData = fss.load(datos.getAvatar());
                        url = fileData.getURL().toString();
                    } catch (IOException e) {
                        e.printStackTrace();
                    }
                    datos.setAvatar(url);
                }
                else {
                    datos.setAvatar(null);
                }
            });
        return clientes;
    }



    public void registrarCliente(Cliente cliente, MultipartFile file) {
        String fileUrl=fss.saveUploads(file);
        cliente.setAvatar(fileUrl);
        clienteRepository.save(cliente);
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
