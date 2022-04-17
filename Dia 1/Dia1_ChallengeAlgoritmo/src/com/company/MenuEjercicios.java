package com.company;

import java.util.Scanner;

import static com.company.Main.*;

public class MenuEjercicios {

    public static void mostrarMenu(){
        System.out.println("/---Challenge dia 1---/");
        ejecutarEjercicios();
    }

    public static void ejecutarEjercicios(){
        Scanner sc = new Scanner(System.in);
        System.out.println("Que ejercicio desea visualizar? ");
        System.out.println(retEjercicios());
        switch (sc.nextInt()){
            case 1:
                ej1();
                break;
            case 2:
                ej2();
                break;
            case 3:
                ej3();
                break;
            case 4:
                ej4();
                break;
            case 5:
                ej5();
                break;
            case 6:
                ej6();
                break;
            case 0:
                break;
            default:
                System.out.println("Opcion incorrecta: ");
                break;
        }

    }
    public static String retEjercicios(){
        return  "1. Realizar un algoritmo que permita calcular el índice de masa corporal de una persona, ingresando sus valores del peso y la altura" +
                "\n2. Realizar un programa para el cálculo de las raíces de ecuación de segundo grado, el programa debe diferenciar entre las raíces imaginarias, raíces distintas, raíces iguales." +
                "\n3. Realizar un programa para calcular el promedio de tres notas, e indique si el promedio es menor de 10 que muestre reprobado, si es mayor que 10 pero menor que 15 aprobado, y mayor de 15 eximido." +
                "\n4. Realizar un programa que indique el mayor de tres valores numéricos." +
                "\n5. Realizar un programa que indique el menor de tres valores numéricos." +
                "\n6. Crea una aplicación que pida un número por teclado y después comprobaremos si el número introducido es capicúa, es decir, que se lee igual sin importar la dirección. Por ejemplo, si introducimos 30303 es capicúa, si introducimos 30430 no es capicua. Piensa cómo puedes dar la vuelta al número. Una forma de pasar un número a un array es esta Character.getNumericValue(cadena.charAt(posicion)).\n";
    }
}
