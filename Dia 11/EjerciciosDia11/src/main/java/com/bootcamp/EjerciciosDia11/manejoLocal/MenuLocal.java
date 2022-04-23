package com.bootcamp.EjerciciosDia11.manejoLocal;

import java.io.IOException;
import java.util.Scanner;

import static com.bootcamp.EjerciciosDia11.Services.AutoServices.*;


public class MenuLocal {
    public MenuLocal() {}

    public void mostrarMenu() throws IOException {
        Scanner sc = new Scanner(System.in);
        char rta = 's';
        System.out.println("/---PAIR PROGRAMMING DIA 11---/");
        do {
            ejecutarEjercicios();
            System.out.println("Desea probar con otra tarea? s/n");
            rta = sc.next().charAt(0);
        }while(rta == 's');
    }

    public void ejecutarEjercicios() throws IOException {
        Scanner sc = new Scanner(System.in);
        System.out.println("Ingrese el num de la tarea que desea realizar ");
        System.out.println("1.Registrar el auto:  \n2.Consultar auto por patente: " +
                "\n3.Eliminar auto patente \n4.Listado General\n0.Para salir");
        switch (sc.nextInt()){
            case 1:
                String modelo,marca,patente;
                int cantPuertas; float precio;
                sc = new Scanner(System.in);
                System.out.println("Ingrese es su modelo");
                modelo = sc.nextLine();
                System.out.println("Ingrese es su marca");
                marca = sc.nextLine();
                System.out.println("Ingrese es su patente");
                patente = sc.nextLine();
                System.out.println("Ingrese es su cantidad de puertas");
                cantPuertas = sc.nextInt();
                System.out.println("Ingrese es su precio");
                precio = sc.nextFloat();
                System.out.println(registrarAuto(modelo,marca,patente,precio,cantPuertas));
                break;
            case 2:
                sc = new Scanner(System.in);
                System.out.println("Ingrese la PATENTE del Auto a consultar: ");
                System.out.println(consultarAutoXpatente(sc.nextLine()));
                break;
            case 3:
                sc = new Scanner(System.in);
                System.out.println("Ingrese la PATENTE del Auto a eliminar: ");
                System.out.println(borrarAutoXpatente(sc.nextLine()));
                break;
            case 4:
                System.out.println(consultarTodos());
                break;
            case 0:
                System.exit(0);
                break;
            default:
                System.err.println("Opcion incorrecta: ");
                break;
        }

    }
}
