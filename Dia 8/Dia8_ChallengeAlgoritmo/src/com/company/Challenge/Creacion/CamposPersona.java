package com.company.Challenge.Creacion;

import com.company.Challenge.Clases.Persona;

import java.sql.Date;
import java.util.Scanner;

public class CamposPersona {
    public static Persona registroDatos(Persona persona){
            Scanner sc = new Scanner(System.in);
            Date date;  int dia,mes,año;
            System.out.println("Ingrese el nombre: ");
                persona.setNombre(sc.nextLine());
            System.out.println("Ingrese el apellido: ");
                persona.setApellido(sc.nextLine());
            System.out.println("Ingrese el dni: ");
                persona.setDni(sc.nextInt());
            sc = new Scanner(System.in);
            System.out.println("Ingrese la direccion: ");
                persona.setDireccion(sc.nextLine());
            System.out.println("Ingrese la fecha de nacimiento: ");
            System.out.println("Dia: "); dia = sc.nextInt();
            System.out.println("Mes: "); mes = sc.nextInt();
            System.out.println("Año: "); año = sc.nextInt();
            date = new Date(año,mes,dia);
                persona.setFechaNac(date);
        return persona;
        }
}

