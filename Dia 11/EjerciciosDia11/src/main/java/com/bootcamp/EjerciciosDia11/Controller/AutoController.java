package com.bootcamp.EjerciciosDia11.Controller;

import com.bootcamp.EjerciciosDia11.Model.Auto;
import org.springframework.web.bind.annotation.*;

import javax.websocket.server.*;

@RestController
@RequestMapping("/api")
public class AutoController {
         //LO MISMO DE ABAJO PERO MAS LARGO
        @PostMapping("/mostrar")
        public String mostrarAutos() {
            return "Mostrando autos";
        }

        @PostMapping("/mostrar/{patente}")
        public String mostrarAutosPorPatente(@PathParam("patente") String patente) {
            return "Mostrando auto de x patente";
        }

        /*@PathParam("marca") String marca,
                                @PathParam("puerta") int puertas,
                                @PathParam("patente") String patente*/
        @GetMapping("/create")
        public String crearAuto(@PathParam("modelo") String modelo){
            Auto auto = new Auto(modelo);
            return auto.toString();
        }

        @DeleteMapping("/delete")
        public String borrarPorPatente(@PathParam("patente") String patente) {
            return "se borro el auto segun la patente ingresada";
        }

    }

