package com.company.ejercicios;

import java.util.Scanner;

public class EJ1 {
    public static void ej1(){
        Scanner sc = new Scanner(System.in);
        int val1,val2;
        char res;
            System.out.println("////Calculadora//// \nIngrese un numero: ");
            val1 = sc.nextInt();
            System.out.println("Ingrese otro numero");
            val2 = sc.nextInt();
            System.out.println("Que operacion desea realizar: \na.Suma \nb.Resta \nc.Multiplicacion \nd.Division");
            res = sc.next().charAt(0);

            switch (res) {
                case 'a':
                    System.out.println("Suma: " + (val1 + val2));
                    break;
                case 'b':
                    System.out.println("Resta: " + (val1 - val2));
                    break;
                case 'c':
                    System.out.println("Multiplicacion: " + (val1 * val2));
                    break;
                case 'd':
                    System.out.println("Division: " + (val1 / val2));
                    break;
                default:
                    System.out.println("Ingreso uno opcion Incorrecta");
                    break;
            }
    }

}
