package com.company;

import java.util.Scanner;

public class Game {
    public Game(){}

    public void mostrarGame(){
        Scanner sc = new Scanner(System.in);
        System.out.println("///Bienvenido al PREGUNTA3///");
        char rta = 's';
        do {
            mostrarPreguntas();
            System.out.println("Desea volver a intentar? s / n");
            rta = sc.next().charAt(0);
        }while(rta == 's');


    }

    public  void mostrarPreguntas(){
        Scanner sc = new Scanner(System.in);
        switch((int) (Math.random() * 5 + 1)){
            case 1:
                System.out.println("¿Cuántas patas tiene una araña?");
                System.out.println("1. 8\n2. 2\n3. 5");
                ResPrimPreg(sc.nextInt());
                break;
            case 2:
                System.out.println("¿Cuál es la montaña más alta en la actualidad?");
                System.out.println("1. Kanjut Sar\n2.Everest \n3.Kongur ");
                ResSegPreg(sc.nextInt());
                break;
            case 3:
                System.out.println("¿Que nombre tiene el sonido que hace una oveja?");
                System.out.println("1. Maullido\n2.Ladrido \n3.Balido ");
                ResTerPreg(sc.nextInt());
                break;
            case 4:
                System.out.println("¿Para qué sirven las arterias?");
                System.out.println("1. Transportar Oxigeno\n2.Transportar Nutrientes \n3.Transportar Electricidad");
                ResCuarPreg(sc.nextInt());
                break;
            case 5:
                System.out.println("¿Cuáles son los estados de la materia?");
                System.out.println("1. Solido,Liquido,Gaseoso\n" +
                        "2. Aprobado,Desaprobado,Raspando\");\n" +
                        "3. Ionizado, Fusionado, Sublimado");
                ResQuinPreg(sc.nextInt());
                break;
            default:
                System.out.println("Ingrese una opcion valida");
                break;
        }
    }

    public  void ResPrimPreg(int rta) {
        switch (rta) {
            case 1:
                System.out.println("Has GANADO");
                System.exit(0);
                break;
            case 2:
            case 3:
                System.out.println("Respuesta Incorrecta");
                break;
            default:
                System.out.println("Ingrese una opcion valida");
                break;
        }
    }

    public  void ResSegPreg(int rta) {
        switch (rta){
                case 1:
                case 3:
                    System.out.println("Respuesta Incorrecta");
                break;
                case 2:
                    System.out.println("Has GANADO");
                    System.exit(0);
                    break;
                default:
                    System.out.println("Ingrese una opcion valida");
                    break;
            }
        }

    public  void ResTerPreg(int rta) {
        switch (rta) {
            case 1:
            case 2:
                System.out.println("Respuesta Incorrecta");
                break;
            case 3:
                System.out.println("Has GANADO");
                System.exit(0);
                break;
            default:
                System.out.println("Ingrese una opcion valida");
                break;
        }
    }

    public  void ResCuarPreg(int rta) {
        switch (rta) {
            case 1:
                System.out.println("Has GANADO");
                System.exit(0);
                break;
            case 2:
            case 3:
                System.out.println("Respuesta Incorrecta");
                break;
            default:
                System.out.println("Ingrese una opcion valida");
                break;
        }
    }

    public  void ResQuinPreg(int rta) {
        switch (rta) {
            case 1:
                System.out.println("Has GANADO");
                System.exit(0);
                break;
            case 2:
            case 3:
                System.out.println("Respuesta Incorrecta");
            default:
                System.out.println("Ingrese una opcion valida");
                break;
        }
    }



}
