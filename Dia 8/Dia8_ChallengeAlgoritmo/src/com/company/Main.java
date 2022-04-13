package com.company;

import com.company.Challenge.Cliente;
import com.company.dbManagement.ConnectionDB;

import java.sql.Date;
import java.util.Scanner;

import static com.company.dbManagement.InsertClass.insert;
import static com.company.dbManagement.SelectClass.select;


public class Main {
    public static void main(String[] args) {
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
    }
}
