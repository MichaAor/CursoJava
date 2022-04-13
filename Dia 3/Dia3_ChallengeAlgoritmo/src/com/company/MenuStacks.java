package com.company;

import java.util.Scanner;

public class MenuStacks{
    public static void mostrarMenu(){
        System.out.println("Challenge DIA 3");
        System.out.println(mostrarEjercitacion());
        ejecutarEj();
    }
    public static String mostrarEjercitacion() {
        return "Crear un programa para implementa una pila utilizando una lista enlazada como estructura de datos, Dicha pila deberá almacenar cualquier tipo de objeto, y deberás implementar métodos para ellos como por ejemplo: " +
                    "\n1. Insertar un objeto en la pila (push)." +
                    "\n2. Recuperar un objeto de la pila (pop)." +
                    "\n3. Obtener el objeto de la cima (top) de la pila, sin extraerlo." +
                    "\n4. Averiguar si hay algún objeto almacenado en la pila." +
                    "\n5. Devolver el número de objetos almacenados en la pila." +
                "Recordar que debes crear una clase que se ha la encarga de almacenar los valores de la pila." +
                    "\n6. Crear un programa que sume los elementos de una lista de enteros recursivamente.\n" +
                    "\n7. Construir una función que imprima los elementos de una lista enlazada de enteros en orden inverso a partir de una posición p"+
                    "\n0. Salir";
    }

    public static void ejecutarEj(){
        Stack stack = new Stack(5);
        int i=0;
        while(i<2) {
            stack.push((int) (Math.random() * 20 + 1));
            i++;
        }
        Scanner sc = new Scanner(System.in);
        System.out.println("Que ejercicio desea ejecutar?: ");
        int rta = sc.nextInt();
        switch (rta){
            case 1:
                    stack.viewStack();
                        System.out.println("Que numero desea agregar? ");
                        rta = sc.nextInt();
                        stack.push(rta);
                    stack.viewStack();
                break;
            case 2:
                stack.viewStack();
                System.out.println("El numero recuperado es: " + stack.pop());
                stack.viewStack();
                break;
            case 3:
                stack.viewStack();
                System.out.println("El numero recuperado es: " + stack.Views());
                stack.viewStack();
                break;
            case 4:
                System.out.println("Que numero desea buscar en la pila? ");
                rta = sc.nextInt();
                System.out.println(stack.Search(rta));
                break;
            case 5:
                System.out.println("La pila posee: " + stack.Counter() + " Elementos");
                break;
            case 6:
                System.out.println("La suma recursiva de los elementos del stakc es: " +stack.sumaRecu(0));
                break;
            case 7:
                break;
            case 0:
                System.exit(0);
                break;
            default:
                System.out.println("OPCION INCORRECTA");
                break;
        }
    }
}
