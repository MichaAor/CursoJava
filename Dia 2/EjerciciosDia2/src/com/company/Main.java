package com.company;

import com.company.ejPairProgramming.ejPairProgramming;

import java.util.Arrays;

public class Main {

    public static void main(String[] args) {
        ejPairProgramming ej = new ejPairProgramming();
        ej.ejecutarEj();
    }



    public static void ordenAlf(String[] str){
        Arrays.sort(str);
        for(int i=0;i<str.length;i++){
            System.out.println(str[i]);
        }
    }

    public static void orden(String[] str){
       /* String[] str = {"coder", "devplace", "personas", "curso", "alumnado"};
        ordenAlf(str);*/
    }
}
