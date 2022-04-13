package com.company;

import java.util.Scanner;

public class Ejercicios {
    public static void ej1(){
        Triangle triangle = new Triangle(12,12,12);
        triangle.showType(triangle.typeTriangle() + "Triangulo de medidas 12 x 12 x 12");
    }

    public static void ej2(){
        Scanner sc = new Scanner(System.in);
        int nmb;
        System.out.println("Enter a number from 1 to 14");
        nmb = sc.nextInt();
        if(nmb >=1 && nmb <=14){
            switch (nmb){
                case 2: case 3: case 5: case 7: case 11: case 13:
                    System.out.println("Es numero primo");
                    break;
                case 4: case 6: case 8: case 9: case 10: case 12: case 14:
                    System.out.println("No es primo");
                    break;
            }
        }
    }
    public static int[] numPares(){
        int arr[] = new int[10];  int var;
        for(int i=0; i<10; i++){
            var = (int) (Math.random() * 50 + 1);
            if(var %2 == 0 ) {
                arr[i] = var;
            }
            i++;
        }
        return arr;
    }
}
