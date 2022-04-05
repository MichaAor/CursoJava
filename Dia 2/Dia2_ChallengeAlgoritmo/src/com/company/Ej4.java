package com.company;

import java.util.Arrays;
import java.util.Scanner;

import static com.company.Ej3.mostrarArr;

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

    public static void mostrarArrVert(int[] iC){
        for (int i = 0; i < iC.length; i++) {
            System.out.println("["+iC[i]+"]-");
        }
    }

    public static void mostrarArrStr(String[] pais){
        for (int i = 0; i < pais.length; i++) {
            System.out.print("["+pais[i]+"]-");
        }
    }

    public static String[] llenarArr(String[] arr){
        Scanner sc = new Scanner(System.in);
        for(int i = 0; i < arr.length; i++) {
            System.out.println("Ingrese su dato: ");
            arr[i] = sc.nextLine();
        }
       return arr;
    }

    public static String[][] llenarMats(String [][] ciu){
        Scanner sc = new Scanner(System.in);
        for(int i=0;i < ciu.length;i++){
            for (int j=0;j< ciu[i].length;j++){
                System.out.println("Ingrese su dato: ");
                ciu[i][j] = sc.nextLine();
            }
        }
        return ciu;
    }

    public static String[][] llenarMat(){
        String[][] ciu = new String[5][4];
        //String[][] ciu = {{"Ciudad,Pais","1","2"},{" ","Argentina","Bolivia"},{"1","Rosario","Potosi"}};


        ciu[0][0] = "CIUDAD/PAIS";
        ciu[1][0] = "/ /";
        boolean flag = true;
         int cont=1,cont2=0;
        for(int i=1;i < ciu.length;i++){
            ciu[0][i] = String.valueOf(cont++);
            System.out.println("Pais");
            ciu[1][i] = pedir();
            for (int j=2;j< ciu[i].length;j++){
                if(flag = true) {
                    ciu[j][0] = String.valueOf(cont2++);
                }
                System.out.println("Ciudad de "+ ciu[1][i]);
                ciu[j][i] = pedir();
            }
            flag = false;
        }
        return ciu;
    }

    public static String pedir(){
        Scanner sc = new Scanner(System.in);
        System.out.println("Ingrese su dato: ");
        return sc.nextLine();
    }



}
