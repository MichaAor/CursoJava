package com.company.Challenge.Creacion;

import com.company.Challenge.Clases.Vendedor;

import java.sql.Date;
import java.util.Scanner;

public class CrearVendedor {
    public static Vendedor registroDatos(){
        Vendedor vendedor = new Vendedor();
            Scanner sc = new Scanner(System.in);
            Date date;  int dia,mes,año;
            System.out.println("Ingrese el nombre: ");
                vendedor.setNombre(sc.nextLine());
            System.out.println("Ingrese el apellido: ");
                vendedor.setApellido(sc.nextLine());
            System.out.println("Ingrese el dni: ");
                vendedor.setDni(sc.nextInt());
            sc = new Scanner(System.in);
            System.out.println("Ingrese la direccion: ");
                vendedor.setDireccion(sc.nextLine());
            System.out.println("Ingrese la fecha de nacimiento: ");
            System.out.println("Dia: "); dia = sc.nextInt();
            System.out.println("Mes: "); mes = sc.nextInt();
            System.out.println("Año: "); año = sc.nextInt();
            date = new Date(año,mes,dia);
            vendedor.setFechaNac(date);
            System.out.println("Ingrese el salario: ");
            vendedor.setSalario(sc.nextFloat());
        return vendedor;
        }
}

