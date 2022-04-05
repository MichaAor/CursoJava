package com.company.ejArrays;

import java.util.Arrays;

public class ejArr {

    public static void motrarEjArr(){
        String[] arr = {"coder", "devplace", "personas", "curso", "alumnado" };
        ordenAlf(arr);
        OrdenamientoLetras(arr);
    }

    public static void ordenAlf(String[] str){
    Arrays.sort(str);
    for(int i=0;i<str.length;i++){
        System.out.println(str[i]);
        }
    }

    public static void OrdenamientoLetras(String[] arr){
            int cartA, carB;
            for(int i=0;i<arr.length;i++){
                for(int j=0;j< arr.length;j++){
                    cartA = arr[i].length();
                    carB = arr[j].length();
                    if(cartA<carB){
                        String temp = arr[i];
                        arr[i] = arr[j];
                        arr[j] = temp;
                    }
                }
            }
            System.out.println("Show odd numbers: " + Arrays.toString(arr));
        }

}
