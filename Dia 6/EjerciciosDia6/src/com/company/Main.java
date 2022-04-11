package com.company;

import com.company.pairProgramming.AccesoAFabricacionStrategy;
import com.company.pairProgramming.FabricarRopaFactoryMethod;
import com.company.pairProgramming.IFabricacion;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        IFabricacion prenda;
        int op;

        System.out.print("�Que prenda quiere fabricar (1-Jean, 2-Campera)?: ");
        op=teclado.nextInt();

        FabricarRopaFactoryMethod factory= new FabricarRopaFactoryMethod();
        prenda=factory.crear(op);
        AccesoAFabricacionStrategy strategy=new AccesoAFabricacionStrategy(prenda);

        strategy.fabricar(prenda);
    }
}
