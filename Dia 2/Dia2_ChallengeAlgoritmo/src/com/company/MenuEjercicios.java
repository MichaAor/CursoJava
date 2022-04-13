package com.company;

import java.util.Scanner;

import static com.company.ejercicios.EJ1.ej1;
import static com.company.ejercicios.EJ2.ej2;
import static com.company.ejercicios.Ej3.ej3;
import static com.company.ejercicios.Ej4.ej4;

public class MenuEjercicios {

    public static void mostrarMenu(){
        System.out.println("/---Challenge dia 2---/");
        ejecutarEjercicios();
    }

    public static void ejecutarEjercicios(){
        Scanner sc = new Scanner(System.in);
        System.out.println("Que ejercicio desea visualizar? ");
        System.out.println(retEjercicios());
        switch (sc.nextInt()){
            case 1:
                ej1();
                break;
            case 2:
                ej2();
                break;
            case 3:
                ej3();
                break;
            case 4:
                ej4();
                break;
            case 5:
                System.out.println("Sin realiazar");
                //ej5();
                break;
            case 6:
                System.out.println("Sin realiazar");
                //ej6();
                break;
            case 0:
                break;
            default:
                System.out.println("Opcion incorrecta: ");
                break;
        }

    }
    public static String retEjercicios(){
        return  "1. Realizar un programa que simule una calculadora, donde realice las operaciones básicas (suma, resta, multiplicación, división), el usuario debe primero ingresar dos valores, y especificar con un carácter la operación a realizar, para el uso del ejercicio debe usar la sentencia switch." +
                "\n2. Realizar un programa que visualice por pantalla todos los caracteres correspondientes a letras minúsculas." +
                "\n3. Realizar un programa que permita ingresar por teclado 10 números en un arreglo y debe:" +
                    "\n*-Mostrar el número mayor" +"\n*-Mostrar el número menor" +"\n*-Mostrar los números pares" +
                    "\n*-Mostrar los números impares" +"\n*-Ordenarlos de manera Ascendente" +"\n*-Ordenarlos de manera Descendente" +
                "\n4. Crea un programa que pida por pantalla cinco países y a continuación tres ciudades de cada uno de estos países. Los nombres de ciudades deben almacenarse en un array multidimensional cuyo primer índice sea el número asignado a cada país y el segundo índice el número asignado a cada ciudad, mostrar por pantalla el resultado." +
                "\n5. Vamos a crear el juego del ahorcado por consola.\n" +
                "Al inicio del programa, pedirá los nombres de los dos jugadores. El primer turno será para el jugador 1.\n" +
                "Uno escribe una palabra y el otro la adivina, si este la adivina obtendrá un punto y escribirá una palabra, sino lo acierta el jugador actual suma un punto y escribe de nuevo otra palabra.\n" +
                "Cuando el jugador inserte su palabra también deberá añadir una pequeña pista, por ejemplo si la palabra es Madrid, la pista puede ser “Ciudad”.\n" +
                "El jugador que tenga que acertar la palabra tendrá seis oportunidades (cabeza, cuerpo, brazos y piernas). No es necesario dibujar nada por pantalla, solo mostrar el número de oportunidades restantes.\n" +
                "Deberá mostrase los caracteres que el usuario inserta para esa palabra, para evitar que las repita, en caso de que lo haga, avisarle y no contar como error.\n" +
                "Cada vez que acierte o no la palabra, deberá mostrar la puntuación de ambos. El primero que llegue a 3 puntos gana.\n" +
                "Puedes usar todos los medios a tu alcance.\n" +
                "\n6.Se quiere simular un juego en el que participan N jugadores y otra persona que hace de árbitro. Cada jugador elige 4 números en el rango [1, 10], pudiendo estar repetidos. A continuación, el árbitro, sin conocer los números que ha elegido cada jugador, selecciona 2 números A y B.\n" +
                "El programa debe ser capaz de calcular cuántos números de los seleccionados por cada jugador están comprendidos entre los valores A y B. Ganará el jugador que más números tenga en dicho intervalo.\n" +
                "Se pide implementar un programa modular que simule el juego para 3 jugadores, teniendo en cuenta que:\n" +
                "Tanto los 4 datos de cada jugador, como los valores para A y B se introducirán por teclado. En todos los casos, el programa detectará la entrada de números erróneos, solicitando nuevamente el dato hasta que sea válido.\n" +
                "Se deben mostrar por pantalla no solo los aciertos de cada jugador sino los datos que ha introducido cada jugador y los que ha seleccionado el árbitro. Por último, hay que imprimir la media aritmética de los aciertos de todos los jugadores\n";
    }
}
