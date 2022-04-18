package com.company;

import com.mongodb.client.*;
import org.bson.Document;

import java.awt.*;
import java.util.Scanner;



public class MenuBDD {
    private MongoClient mongoClient = MongoClients.create();
    private MongoDatabase mongoDatabase = mongoClient.getDatabase("challenge10");
    private MongoCollection<Document> personasData = mongoDatabase.getCollection("Personas");

    public MenuBDD() {}

    public void mostrarMenu() throws InterruptedException {
        Thread.sleep(1000);
        Scanner sc = new Scanner(System.in);
        char rta = 's';
        System.out.println("/---Challenge dia 10---/");
        do {
            ejecutarEjercicios();
            System.out.println("Desea probar con otra tarea? s/n");
            rta = sc.next().charAt(0);
        }while(rta == 's');
    }

    public void ejecutarEjercicios(){
        Scanner sc = new Scanner(System.in);
        System.out.println("Ingrese el num de la tarea que desea realizar ");
        System.out.println("1.Registrar Datos:  \n2.Consultar Datos: \n3.Eliminar Datos \n4.Listado General ");
        switch (sc.nextInt()){
            case 1:
                    RegistrarDatos.registrar(this.personasData);
                break;
            case 2:
                sc = new Scanner(System.in);
                System.out.println("Ingrese el dni de la persona a consultar: ");
                    ConsultarDatos.consultar(this.personasData,sc.nextInt());
                break;
            case 3:
                sc = new Scanner(System.in);
                System.out.println("Ingrese el dni de la persona a eliminar: ");
                EliminarDatos.eliminar(this.personasData,sc.nextInt());
                break;
            case 4:
                ListadoGeneral.listarCollection(this.personasData);
                break;
            case 0:
                System.exit(0);
                break;
            default:
                System.out.println("Opcion incorrecta: ");
                break;
        }

    }
}
