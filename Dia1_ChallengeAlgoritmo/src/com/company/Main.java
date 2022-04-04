package com.company;

import java.text.CharacterIterator;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        //Ej1
        /*
       double weigth ,height, imc;
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter your weight");
        weigth = sc.nextDouble();
        System.out.println("Enter your height");
        height = sc.nextDouble();

        imc = weigth / Math.pow(height,2);

        System.out.println("Weight(KG): "+ weigth +"\nHeight(Mts): "+ height +"\nIMC: "+ imc);
        if(imc<20){ System.out.println("Diagnostico: Mal Estado"); }
        if(imc>20 && 22<imc){ System.out.println("Diagnostico: Bajo Peso"); }
        if(imc>22 && 25<imc){ System.out.println("Diagnostico: Peso Normal"); }
        if(imc>25 && 30<imc){ System.out.println("Diagnostico: Sobrepeso"); }
        if(imc>30 && 40<imc){ System.out.println("Diagnostico: Sobrepeso Cronico"); }
        if(imc > 40){ System.out.println("Diagnostico: Hospitalizado"); }
         */

        //Ej3
        /*
        int n1,n2,n3;
        float res;
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter your first note ");   n1 = sc.nextInt();
        System.out.println("Enter your second note");   n2 = sc.nextInt();
        System.out.println("Enter your third note");    n3 = sc.nextInt();
                            res = (n1 + n2 + n3) / 3;

        if(res<10){ System.out.println("Promedio = " + res + "¡¡REPROBADO!!"); }
        if(res>10 && res<15){ System.out.println("Promedio = " + res + "¡¡APROBADO!!"); }
        if(res>15){ System.out.println("Promedio = " + res + "¡¡EXIMIDO!!"); }
         */
        //EJ4
        /*
        int v1, v2, v3, vm = 0;
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a number: "); v1 = sc.nextInt();
        System.out.println("Enter a number: "); v2 = sc.nextInt();
        System.out.println("Enter a number: "); v3 = sc.nextInt();

       if(v1>=v2){
           if(v1>=v3){
               vm = v1;
           }else{
               vm = v3;
           }
       }else{
           vm = v2;
       }
        if (v3 == v1 && v3 == v2) { System.out.println("Los numeros son iguales"); }
        if (vm != 0) { System.out.println("El mayor es: " + vm); }
        */

        //EJ5
        /*
        int v1, v2, v3, vm = 0;
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a number: "); v1 = sc.nextInt();
        System.out.println("Enter a number: "); v2 = sc.nextInt();
        System.out.println("Enter a number: "); v3 = sc.nextInt();

        if(v1<=v2){
            if(v1<=v3){
                vm = v1;
            }else{
                vm = v3;
            }
        }else{
            vm = v2;
        }
        if (v3 == v1 && v3 == v2) { System.out.println("Los numeros son iguales"); }
        if (vm != 0) { System.out.println("El menor es: " + vm); }
         */

        //EJ6
        int v, i=0,j=1 ,flag =1;
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a number: "); v = sc.nextInt();
        String chain = String.valueOf(v);
        String comp = chain;
        do{
            if(chain.charAt(chain.length()-j) != comp.charAt(i)){
                flag = 0;
                System.out.println("No es capicua");
                System.exit(0);
            }
            i++;
            j++;
        }while(i < comp.length() && flag ==1);
        System.out.println("Es Capicua");
    }
}
