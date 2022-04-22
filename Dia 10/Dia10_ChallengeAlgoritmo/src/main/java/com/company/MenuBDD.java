package com.company;

import com.company.Service.ConsultarDatos;
import com.company.Service.EliminarDatos;
import com.company.Service.ListadoGeneral;
import com.company.Service.RegistrarDatos;
import com.mongodb.client.*;
import org.bson.Document;

import java.util.Scanner;



public class MenuBDD {
    public MenuBDD() {}

    public void mostrarMenu() throws InterruptedException {
        Scanner sc = new Scanner(System.in);
        char rta = 's';
        System.out.println("/---Challenge dia 10---/");
        do {
            ejecutarEjercicios();
            System.out.println("Desea probar con otra tarea? s/n");
            rta = sc.next().charAt(0);
        }while(rta == 's');
    }

    public void ejecutarEjercicios() throws InterruptedException {
        Scanner sc = new Scanner(System.in);
        System.out.println("Ingrese el num de la tarea que desea realizar ");
        System.out.println("1.Registrar Datos:  \n2.Consultar Datos: " +
                "\n3.Eliminar Datos \n4.Listado General");
        switch (sc.nextInt()){
            case 1:
                    RegistrarDatos.registrar();
                break;
            case 2:
                sc = new Scanner(System.in);
                System.out.println("Ingrese el dni de la persona a consultar: ");
                    ConsultarDatos.consultar(sc.nextInt());
                break;
            case 3:
                sc = new Scanner(System.in);
                System.out.println("Ingrese el dni de la persona a eliminar: ");
                EliminarDatos.eliminar(sc.nextInt());
                break;
            case 4:
                ListadoGeneral.listarCollection();
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
