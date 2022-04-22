package com.bootcamp.Dia11_ChallengeAlgoritmo.Controller;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.io.IOException;

import static com.bootcamp.Dia11_ChallengeAlgoritmo.Service.UsuarioService.*;

@RestController
@RequestMapping("/usuarios")
public class UsuarioController {
    @GetMapping("/todos")
    public ResponseEntity mostrarUsuarios() throws IOException {
        String rta = consultarUsuarios();
        if(rta == null){
            return ResponseEntity.status(404).body("NO SE ENCUENTRA NINGUN REGITRO");
        }
        return ResponseEntity.status(201).body(rta);
    }


    @GetMapping("/{dni}")
    public ResponseEntity mostrarXdni(@PathVariable("dni") String dni) throws IOException {
        if(dni == null){
            return ResponseEntity.status(400).body("CAMPOS INCOMPLETOS,REINTENTE");
        }
        if(dni.length()<=0 ^ dni.length() >8){
            return ResponseEntity.status(400).body("DNI INVALIDO,REINTENTE");
        }
        String rta = consultarUsuarioXdni(dni);
        if(rta == null){
            return ResponseEntity.status(400).body("NO SE ENCUENTRA USUARIO SEGUN DNI INGRESADO,REINTENTE");
        }
        return ResponseEntity.status(201).body(rta);
    }


    @PostMapping("/create")
    public ResponseEntity crearUsuario(@PathVariable("nombre") String nombre, @PathVariable("apellido") String apellido,
                                       @PathVariable("dni") String dni) throws IOException {
        if(nombre == null || apellido == null || dni == null){
            return ResponseEntity.status(400).body("CAMPOS INCOMPLETOS,REINTENTE");
        }
        if(dni.length()<=0 ^ dni.length() >8){
            return ResponseEntity.status(400).body("DNI INVALIDO,REINTENTE");
        }
        String rta = registrarUsuario(nombre,apellido,dni);
        if(rta == null){
            return ResponseEntity.status(400).body("ERROR AL REGISTRAR ((DNI YA EXISTENTE))");
        }
        return ResponseEntity.status(201).body(rta);
    }

    @DeleteMapping("/borrar/{dni}")
    public ResponseEntity borrarXdni(@PathVariable("dni") String dni) throws IOException {
        if(dni == null){
            return ResponseEntity.status(400).body("CAMPOS INCOMPLETOS,REINTENTE");
        }
        if(dni.length()<=0 ^ dni.length() >8){
            return ResponseEntity.status(400).body("DNI INVALIDO,REINTENTE");
        }
        String rta = borrarUsuarioXdni(dni);
        if(rta == null){
            return ResponseEntity.status(404).body("NO ESTA REGISTRADO NINGUN USUARIO EL DNI INGRESADO");
        }
        return ResponseEntity.status(200).body(rta);
    }

}
