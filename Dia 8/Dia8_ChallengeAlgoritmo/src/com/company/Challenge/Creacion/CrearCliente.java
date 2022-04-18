package com.company.Challenge.Creacion;

import com.company.Challenge.Clases.Cliente;
import com.company.Challenge.Clases.Persona;

import java.sql.Date;
import java.time.LocalDateTime;
import java.util.Scanner;

public class CrearCliente {
    public static Cliente registroDatos(){
        Cliente cliente = new Cliente();
            Scanner sc = new Scanner(System.in);
            Date date;  int dia,mes,año;
            System.out.println("Ingrese el nombre: ");
                cliente.setNombre(sc.nextLine());
            System.out.println("Ingrese el apellido: ");
                cliente.setApellido(sc.nextLine());
            System.out.println("Ingrese el dni: ");
                cliente.setDni(sc.nextInt());
            sc = new Scanner(System.in);
            System.out.println("Ingrese la direccion: ");
                cliente.setDireccion(sc.nextLine());
            System.out.println("Ingrese la fecha de nacimiento: ");
            System.out.println("Dia: "); dia = sc.nextInt();
            System.out.println("Mes: "); mes = sc.nextInt();
            System.out.println("Año: "); año = sc.nextInt();
            date = new Date(año,mes,dia);
                cliente.setFechaNac(date);
        return cliente;
        }
}

