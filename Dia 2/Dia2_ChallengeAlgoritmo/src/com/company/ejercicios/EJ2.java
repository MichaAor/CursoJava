package com.company.ejercicios;

import java.util.Locale;
import java.util.Scanner;

public class EJ2 {
    public static void ej2(){
        Scanner sc = new Scanner(System.in);
        System.out.println("Ingrese una palabra: ");
        String st = sc.nextLine();  String ax = st.toUpperCase(Locale.ROOT);
        int j =0;
        char[] pop = new char[st.length()];
        for(int i=0;i<ax.length();i++){
            if(st.charAt(i) == ax.charAt(i)){
                pop[j] = st.charAt(i);
                j++;
            }
        }
        for(int i=0;i<pop.length;i++){
            System.out.println(pop[i]);
        }
    }
}
