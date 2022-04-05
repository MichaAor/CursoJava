package com.company;

import static com.company.Ej3.mostrarArr;

public class Ej5 {
    public static void ej5(){
        int[] arr = llenarArr();
        int[] arr1 = arr;
        mostrarArr(arr);
    }

    public static int[] llenarArr(){
        int[] arr = new int[10];
        for(int i =0;i<arr.length;i++){
            arr[i] = (int)(Math.random() * 20 + 1);
        }
        return arr;
    }

    /*public static int[] nuevoArr(int[] arr,int[] arr2){
        for(int i=0;i<arr.length;i++){

        }
    }*/

    public void ordenarFila(String[] array) {
        for (int i = 0; i < array.length - 1; i++) {
            for (int j = i + 1; j < array.length; j++) {
                if (array[i].length() > array[j].length()) {
                    String temp = array[i];
                    array[i] = array[j];
                    array[j] = temp;
                }
            }
        }
    }
}
