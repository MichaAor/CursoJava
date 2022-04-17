package com.company;

import java.util.Scanner;

import static com.company.MenuEjercicios.mostrarMenu;

public class Main {

    public static void main(String[] args) {
        char rta = 's';
        do{
            mostrarMenu();
            rta = seguir();
        }while(rta == 's');

    }


    public static char seguir(){
        Scanner sc  = new Scanner(System.in);
        System.out.println("Desea Continuar? s/n");
        return sc.next().charAt(0);
    }
}
