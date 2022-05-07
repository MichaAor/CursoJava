package com.bootcamp.Dia20_ChallengeAlgoritmo.Controller.Service;

import com.bootcamp.Dia20_ChallengeAlgoritmo.Model.Cliente;
import com.bootcamp.Dia20_ChallengeAlgoritmo.Controller.Repository.ClienteRepository;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.multipart.MultipartFile;

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

    public Cliente getClienteById(String id){
        return clienteRepository.findById(id).get();
    }

    public ArrayList<Cliente> getAllClientes(){
        return (ArrayList<Cliente>) clienteRepository.findAll();
    }

    public void registrarCliente(Cliente cliente, MultipartFile imagen) throws IOException {
        String ruta = "D://Imagenes";
        int index = imagen.getOriginalFilename().indexOf(".");
        String extension = "." + imagen.getOriginalFilename().substring(index+1);
        String nameImagen = Calendar.getInstance().getTimeInMillis() + extension;
        Path rutaAbs = Paths.get(ruta+"//"+nameImagen);
        Files.write(rutaAbs,imagen.getBytes());
        cliente.setAvatar(nameImagen);
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
