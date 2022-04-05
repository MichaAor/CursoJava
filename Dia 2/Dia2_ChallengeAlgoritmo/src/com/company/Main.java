package com.company;

import java.util.Arrays;
import java.util.Locale;
import java.util.Scanner;

import static com.company.Ej3.ej3;
import static com.company.Ej4.ej4;
import static com.company.Ej5.ej5;

public class Main {

    public static void main(String[] args) {
            //ej1();
            //ej2();
            //ej3();
        //ej4();
        ej5();

    }

    //Ej1
    public static void ej1(){
        Scanner sc = new Scanner(System.in);
        int val1,val2;
        char res,rta = 's';
        do {
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
            rta = seguir();
        }while(rta == 's');
    }

    public static void ej2(){
        Scanner sc = new Scanner(System.in);
        System.out.println("Ingrese una palabra: ");
        String st = sc.nextLine();String ax = st.toUpperCase(Locale.ROOT);
        int j =0;
        char[] pop = new char[st.length()];
        for(int i=0;i<ax.length();i++){
            if(st.charAt(i) == ax.charAt(i)){
                pop[j] = st.charAt(i);
                j++;
            }
        }
        for(int i=0;i<pop.length;i++){
            System.out.println(pop[i]);
        }
    }


    public static char seguir(){
        Scanner sc  = new Scanner(System.in);
        System.out.println("Desea Continuar? s/n");
        return sc.next().charAt(0);
    }
}
