package com.company.Ej1.Canciones;

import java.util.ArrayList;
import java.util.Scanner;

public class Cancion {
    protected String nombre;
    protected String artista;
    protected String album;
    protected int duracion;

    public Cancion(){
    }

    public void crearCancion(){
        Scanner sc = new Scanner(System.in);
        System.out.println("Ingrese nombre");
        this.nombre = sc.nextLine();
        System.out.println("Ingrese artista");
        this.artista = sc.nextLine();
        System.out.println("Ingrese album");
        this.album = sc.nextLine();
        System.out.println("Ingrese duracion(en segundos)");
        this.duracion = sc.nextInt();
    }

    public static Cancion recuperarPorInd(ArrayList<Cancion> cancions){
        Scanner sc = new Scanner(System.in);
        System.out.println("Que cancion desea guardar? ");
        int seleccion = sc.nextInt();
        return cancions.get(seleccion);
    }



    @Override
    public String toString() {
        return "Cancion{" +
                "nombre='" + nombre + '\'' +
                ", artista='" + artista + '\'' +
                ", album='" + album + '\'' +
                ", duracion=" + duracion +
                '}';
    }
}

