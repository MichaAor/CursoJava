package com.company;

<<<<<<< HEAD
import com.company.Challenge.Clases.Persona;
import com.company.Challenge.Creacion.CamposPersona;
import com.company.Challenge.Creacion.FactoryClass;



=======
import com.company.Challenge.Cliente;
import com.company.dbManagement.ConnectionDB;

import java.sql.Date;
import java.util.Scanner;

import static com.company.dbManagement.InsertClass.insert;
import static com.company.dbManagement.SelectClass.select;
>>>>>>> 961062d24d1c61bdb45b93be283aaaf7482ae794


public class Main {
    public static void main(String[] args) {
<<<<<<< HEAD
        /*ConnectionDB connectionDB = ConnectionDB.getInstance();
        //insert(connectionDB,createClient());
        select(connectionDB);*/
        Persona persona1 = FactoryClass.fabrica(1);
        persona1 = CamposPersona.registroDatos(persona1);
        System.out.println(persona1.toString());


=======
        ConnectionDB connectionDB = ConnectionDB.getInstance();
        //insert(connectionDB,createClient());
        select(connectionDB);
    }

    public static Cliente createClient(){
        Scanner sc = new Scanner(System.in);
        Date date;
        Cliente cliente = new Cliente();
        System.out.println("Ingrese el nombre: ");
        cliente.setNombre(sc.nextLine());
        System.out.println("Ingrese el apellido: ");
        cliente.setApellido(sc.nextLine());
        System.out.println("Ingrese el dni: ");
        cliente.setDni(sc.nextInt());
        sc = new Scanner(System.in);
        System.out.println("Ingrese la direccion: ");
        cliente.setDireccion(sc.nextLine());
        System.out.println("Ingrese la fecha de nacimiento siguiendo el sig formato dd/mm/yy: ");
        date = new Date(sc.nextInt(),sc.nextInt(),sc.nextInt());
        cliente.setFechaNac(date);

        return cliente;
>>>>>>> 961062d24d1c61bdb45b93be283aaaf7482ae794
    }
}
