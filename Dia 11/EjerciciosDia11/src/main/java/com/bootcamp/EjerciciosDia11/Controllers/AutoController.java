package com.bootcamp.EjerciciosDia11.Controllers;

import org.springframework.web.bind.annotation.*;
import java.io.IOException;
import static com.bootcamp.EjerciciosDia11.Services.AutoServices.*;

@RestController
@RequestMapping("/api")
public class AutoController {
    @GetMapping("/mostrar")
    public String mostrarAutos() throws IOException {
        return consultarTodos();
    }

    @GetMapping("/mostrar/{patente}")
    public String buscarPorPatente(@PathVariable("patente") String patente) throws IOException {
        return consultarAuto(patente);
    }


    @PostMapping("/create")
    public String crearAuto(@PathVariable("modelo") String modelo,@PathVariable("marca") String marca,
                            @PathVariable("patente") String patente,@PathVariable("precio") float precio,
                            @PathVariable("cantPuertas") int cantPuertas ) throws IOException {
        return registrarAuto(modelo, marca, patente, precio, cantPuertas);
    }

    @DeleteMapping("/delete/{patente}")
    public String borrarPorPatente(@PathVariable("patente") String patente) throws IOException {
        return borrarAuto(patente);
    }

}
