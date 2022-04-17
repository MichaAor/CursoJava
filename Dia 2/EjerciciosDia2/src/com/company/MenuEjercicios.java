package com.company;

import com.company.ejInterfaces.Auto;
import com.company.ejInterfaces.Perro;
import com.company.ejPairProgramming.PairProgramming;

import java.util.Scanner;

import static com.company.ejArrays.ejArr.motrarEjArr;

public class MenuEjercicios {
    public static void mostrarMenu(){
        System.out.println("/---Ejercicios DIA 2---/");
        ejecutarEjercicios();
    }

    public static void ejecutarEjercicios(){
        Scanner sc = new Scanner(System.in);
        System.out.println("Que ejercicio desea visualizar? ");
        System.out.println(retEjercicios());
        switch (sc.nextInt()){
            case 1:
                motrarEjArr();
                break;
            case 2:
                PairProgramming ej = new PairProgramming();
                ej.ejecutarEj();
                break;
            case 3:
                Auto auto = new Auto();
                auto.metrosEnTiempo();
                Perro perro = new Perro();
                perro.metrosEnTiempo();
                break;
            case 0:
                break;
            default:
                System.out.println("Opcion incorrecta: ");
                break;
        }

    }
    public static String retEjercicios(){
        return  "2.Ejercicio Pair Programming: BATALLA NAVAL (CON 1 BARQUITO)";
    }
}
