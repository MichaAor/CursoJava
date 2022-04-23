package com.bootcamp.EjerciciosDia11.Controllers;

import com.bootcamp.EjerciciosDia11.Models.Auto;
import org.springframework.web.bind.annotation.*;
import java.io.IOException;
import static com.bootcamp.EjerciciosDia11.Services.AutoServices.*;

@RestController
@RequestMapping("/autos")
public class AutoController {
    @GetMapping
    public String mostrarAutos() throws IOException {
        return consultarTodos();
    }

    @GetMapping("/{patente}")
    public String buscarPorPatente(@PathVariable("patente") String patente) throws IOException {
        return consultarAutoXpatente(patente);
    }


    @PostMapping
    public String crearAuto(@RequestBody Auto auto) throws IOException {
        return registrarAuto(auto.getModelo(), auto.getMarca(), auto.getPatente(), auto.getPrecio(), auto.getCantPuertas());
    }

    @DeleteMapping("/{patente}")
    public String borrarPorPatente(@PathVariable("patente") String patente) throws IOException {
        return borrarAutoXpatente(patente);
    }

}
