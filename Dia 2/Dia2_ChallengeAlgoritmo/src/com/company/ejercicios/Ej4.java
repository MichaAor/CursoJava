package com.company.ejercicios;

import java.util.Arrays;
import java.util.Scanner;

public class Ej4 {

    public static void ej4(){
        mostrarMat(llenarMat());
    }

    public static void mostrarMat(String [][] ciu){
        /*for(int i=0;i < ciu.length;i++){
            System.out.println("\t");
            for (int j=0;j< ciu[i].length;j++){
                System.out.print(ciu[j][i] + "\t");
            }
        }*/
        for(String mat[] : ciu){
            System.out.println(Arrays.toString(mat));
        }
    }

    public static String[][] llenarMat(){
        String[][] ciu = new String[6][6];
        ciu[0][0] = "CIUDAD/PAIS";
        ciu[1][0] = "/ /";
        boolean flag = true;
        int cont=1,cont2=1;
        for(int i=1;i < ciu.length;i++){
            ciu[0][i] = String.valueOf(cont++);
            System.out.println("Pais");
            ciu[1][i] = pedirString();
            for (int j=2;j< ciu[i].length;j++){
                if(flag == true) {
                    ciu[j][0] = String.valueOf(cont2++);
                }
                System.out.println("Ciudad de "+ ciu[1][i]);
                ciu[j][i] = pedirString();
            }
            flag = false;
        }
        return ciu;
    }

    public static String pedirString(){
        Scanner sc = new Scanner(System.in);
        System.out.println("Ingrese su dato: ");
        return sc.nextLine();
    }

}
