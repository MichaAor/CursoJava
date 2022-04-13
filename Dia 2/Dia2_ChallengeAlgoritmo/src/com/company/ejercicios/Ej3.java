package com.company.ejercicios;

import java.util.Arrays;
import java.util.Scanner;

public class Ej3 {

    public static void ej3() {
        int[] arr = new int[10];
        Scanner sc = new Scanner(System.in);
        for (int i = 0; i < arr.length; i++) {
            /*System.out.println("Ingrese un numero");
            arr[i] = sc.nextInt();*/
            arr[i] = (int) (Math.random() * 5 + 1);
        }
        System.out.println("El numero mayor del array es : "+mayor(arr));
        System.out.println("El numero menor del array es : "+menor(arr));
        System.out.println("Los numeros pares del array es : "); mostrarArr(pares(arr));
        System.out.println("\nLos Numeros impares del array son:  "); mostrarArr(impares(arr));
        System.out.println("\nEl array en orden Ascendente:  "); mostrarArr(ordAsc(arr));
        System.out.println("\nEl array en orden Descendente:  "); mostrarArr(ordDes(arr));

        /*mostrar arrays sin hacer metodo:  System.out.println(Arrays.toString(Array));*/

    }

    public static int mayor(int[] arr) {
        int may = arr[0];
        for (int i = 0; i < arr.length; i++) {
            if (may < arr[i]) {
                may = arr[i];
            }
        }
        return may;
    }

    public static int menor(int[] arr) {
        int men = arr[0];
        for (int i = 0; i < arr.length; i++) {
            if (men > arr[i]) {
                men = arr[i];
            }
        }
        return men;
    }

    public static int[] pares(int[] arr) {
        int[] aux = new int[10];
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] % 2 == 0) {
                aux[i] = arr[i];
            }
        }
        return aux;
    }

    public static int[] impares(int[] arr) {
        int[] aux = new int[10];
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] % 2 != 0) {
                aux[i] = arr[i];
            }
        }
        return aux;
    }

    public static int[] ordAsc(int[] arr) {
        Arrays.sort(arr);
        return arr;
    }

    public static int[] ordDes(int[] arr) {
        Arrays.sort(arr);
        int j=0;
        int[] aux = new int[arr.length];
        for(int i = arr.length-1; i>=0;i--){
            aux[j] = arr[i];
            j++;
        }
        return aux;
    }

    public static void mostrarArr(int[] arr){
        for (int i = 0; i < arr.length; i++) {
            System.out.print("["+arr[i]+"]-");
        }
    }

}
