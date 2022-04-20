package com.bootcamp.EjerciciosDia11.Controllers;

import org.springframework.web.bind.annotation.*;


import javax.websocket.server.PathParam;

import java.io.IOException;

import static com.bootcamp.EjerciciosDia11.Services.AutoServices.*;

@RestController
@RequestMapping("/api")
public class AutoController {
    @PostMapping("/mostrar")
    public String mostrarAutos() throws IOException {
        return consultarTodos();
    }

    @PostMapping("/mostrar/{patente}")
    public String buscarPorPatente(@PathParam("patente") String patente) throws IOException {
        return consultarAuto(patente);
    }


    @GetMapping("/create")
    public String crearAuto(@PathParam("modelo") String modelo,@PathParam("marca") String marca,
                            @PathParam("patente") String patente,@PathParam("precio") float precio,
                            @PathParam("cantPuertas") int cantPuertas ) throws IOException {
        return registrarAuto(modelo, marca, patente, precio, cantPuertas);
    }

    @DeleteMapping("/delete/{patente}")
    public String borrarPorPatente(@PathParam("patente") String patente) throws IOException {
        return borrarAuto(patente);
    }

}
