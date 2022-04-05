package com.company;

import com.company.ejInterfaces.Auto;
import com.company.ejInterfaces.Perro;
import com.company.ejPairProgramming.ejPairProgramming;
import static com.company.ejArrays.ejArr.motrarEjArr;

public class Main {

    public static void main(String[] args) {
        //EJ1
        motrarEjArr();
        //EJ2
        ejPairProgramming ej = new ejPairProgramming();
        ej.ejecutarEj();
        //EJ3
        Auto auto = new Auto();
        auto.metrosEnTiempo();
        Perro perro = new Perro();
        perro.metrosEnTiempo();
    }

}
