package com.company;

import com.company.Challenge.Estudiante;
import com.company.Challenge.Profesor;
import com.company.Challenge.Servicio;
import com.company.Review.Logger;

public class Main {
    public static void main(String[] args) {
        ///CHALLENGE
        Estudiante estudiante = new Estudiante("Misael", "Flores", 41902013, "Soltero", "Programacion");
        Profesor profesor = new Profesor("Pablo", "Garnik", 21796433, "Casado", 1997, 12, "Java");
        Servicio servicio = new Servicio("Analia", "Petric", 47123578, "Soltera", 1989, 12, "Secretaria");

        System.out.println(estudiante.toString());
        System.out.println(profesor.toString());
        System.out.println(servicio.toString());

    }


}
