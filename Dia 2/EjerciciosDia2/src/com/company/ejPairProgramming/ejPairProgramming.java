package com.company.ejPairProgramming;

import java.util.Arrays;
import java.util.Scanner;

public class ejPairProgramming {
    private int x;
    private int y;

    public  void ejecutarEj(){
        Scanner sc = new Scanner(System.in);
        int i,j;
        char rta = 's';
        System.out.println("De cuanto es el ancho de su tablero?");
        i = sc.nextInt();
        System.out.println("De cuanto es el alto de su tablero?");
        j = sc.nextInt();
        int[][] mat = new int[j][i];
        mat = llenarMat(mat);
        mat = ubicarBarquito(mat,j-1,i-1);
        mostrarMat(mat);
        do {
            if(disparo()){
                System.out.println("HAS GANADO");
                System.exit(0);
            }
            System.out.println("Desea volver a intentar");
            rta = sc.next().charAt(0);
        }while(rta =='s');
    }

    public static int[][] llenarMat(int[][] mat){
        for(int i=0;i<mat.length;i++){
            for(int j=0;j<mat[i].length;j++){
                mat[i][j] = 0;
            }
        }
        return mat;
    }

    public int[][] ubicarBarquito(int[][] mat,int i,int j){
        int barco = (int) (Math.random() * 200 + 1);
        this.x = (int) (Math.random() * i +1);
        this.y = (int)(Math.random() * j +1);
        mat[x][y] = barco ;
        return mat;
    }

    public boolean disparo(){
        int x,y;
        boolean rta = false;
        Scanner sc = new Scanner(System.in);
        System.out.println("Ingrese las cordenadas x de su disparo");
        x = sc.nextInt();
        System.out.println("Ingrese las cordenadas y de su disparo");
        y = sc.nextInt();
        if (this.x == y && this.y == x){
            System.out.println("Su disparo ha acertado.");
            rta = true;
        } else {
            System.out.println("Su disparo ha fallado.");
        }
        return rta;
    }

    public static void mostrarMat(int[][] mat){
        for(int arr[] : mat){
            System.out.println(Arrays.toString(arr));
        }
    }
}



