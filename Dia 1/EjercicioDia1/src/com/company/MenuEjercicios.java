package com.company;

import java.util.Arrays;
import java.util.Scanner;

import static com.company.Ejercicios.*;

public class MenuEjercicios {

    public static void mostrarMenu(){
        System.out.println("/---Ejercicios dia 1---/");
        ejecutarEjercicios();
    }

    public static void ejecutarEjercicios(){
        Scanner sc = new Scanner(System.in);
        System.out.println("Que ejercicio desea visualizar? ");
        switch (sc.nextInt()){
            case 1:
                ej1();
                break;
            case 2:
                ej2();
                break;
            case 3:
                System.out.println(Arrays.toString(numPares()));
                break;
            case 4:
                Game game = new Game();
                game.mostrarGame();
                break;
            case 0:
                break;
            default:
                System.out.println("Opcion incorrecta: ");
                break;
        }
    }

}
