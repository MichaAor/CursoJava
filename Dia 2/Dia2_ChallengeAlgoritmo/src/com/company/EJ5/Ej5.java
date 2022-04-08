package com.company.EJ5;

import java.util.Scanner;

public class Ej5 {
    private Jugador j1;
    private Jugador j2;

    public void ej5() {
        Scanner sc = new Scanner(System.in);
        System.out.println("///Ahorcado///");
        System.out.println("Ingrese la palabra");
        String palabra = sc.nextLine();
    }
/*
        while(intentos <= 6){
            if(letras.legnth > 0){
                System.out.println("No se ingreso una palabra");
                break;
            }
            System.out.println("Ingrese una letra");
            letraIn = sc.nextLine();

            for(int i=0;i<letras.length;i++){
                System.out.println(intLetras[i]);
                if(letras[i].equals(letraIn)){
                    this.j2.setPts(j2.getPts()+1);
                }else {
                    this.j1.setPts(j1.getPts()+1);
                    intentos += 1;
                }
            }
        }

    }

    public void juego(String palabra){
        this.palabra = palabra;

    }
    public inserLetra(String letra){
        this.Letra = letra;
    }

    public boolean verifyLetra(){
        this.letraPalabra = this.Palabra.split("");
        for(int i=0;i<letrapalabra.length;i++){
            if(this.letrapalabra.equals(this.letra)){
                return true;
            }else {
                return false;
            }
        }
    }

    public puntos(){}

    public void crearJugadores() {
        Scanner sc = new Scanner(System.in);
        System.out.println("J1 INGRESE SU NOMBRE: ");
        j1 = new Jugador(sc.nextLine());
        System.out.println("J2 INGRESE SU NOMBRE: ");
        j2 = new Jugador(sc.nextLine());
    }

    public void creaPalabras(int i) {
        Scanner sc = new Scanner(System.in);
        if (i == 1) {
            System.out.println("\nIngrese su palabra J1: ");
            j1.setPalabra(sc.nextLine());
        } else {
            System.out.println("\nIngrese su palabra J2: ");
            j2.setPalabra(sc.nextLine());
        }
    }
    public void creaPista(int i) {
        Scanner sc = new Scanner(System.in);
        if (i == 1) {
            System.out.println("\nIngrese su pista J1: ");
            j1.setPista(sc.nextLine());
        } else {
            System.out.println("\nIngrese su pista J2: ");
            j2.setPista(sc.nextLine());
        }
    }

    public boolean jugar(int i) {
        boolean rta;
        if (i == 1) {
            if (j1.getPalabra().compareTo(j2.getPalabra()) == 0) {
                System.out.println("\nGanaste un punto J1");
                j1.setPts(j1.getPts() + 1);
                rta = true;
            } else {
                System.out.println("\nGanaste un punto j2");
                j2.setPts(j2.getPts() + 1);
                rta = false;
            }
        } else {
            if (j2.getPalabra().compareTo(j1.getPalabra()) == 0) {
                System.out.println("Ganaste un punto J2");
                j2.setPts(j2.getPts() + 1);
                rta = true;
            } else {
                System.out.println("Ganaste un punto j1");
                j1.setPts(j1.getPts() + 1);
                rta = false;
            }
        }
        return rta;
    }

    public int turno(int i){
        if(i == 1){
            i=2;
        }else {
            i = 1;
        }
        return i;
    }

    public void mostrar(int i){
        if (i == 1) {
            System.out.println("Pista: "+j1.getPista());
        } else {
            System.out.println("Pista: "+j2.getPista());
        }
    }

    public char comprobacion(){
        char rta;
        Scanner sc = new Scanner(System.in);
        System.out.println("Desea seguir jugando? s/n");
        rta = sc.next().charAt(0);
        return rta;
    }


*/
}
