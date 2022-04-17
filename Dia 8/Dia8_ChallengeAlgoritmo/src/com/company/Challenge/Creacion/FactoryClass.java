package com.company.Challenge.Creacion;

import com.company.Challenge.Clases.Cliente;
import com.company.Challenge.Clases.Persona;
import com.company.Challenge.Clases.Vendedor;

import java.util.Scanner;

public class FactoryClass{
    public static Persona fabrica(int tipo){
        Scanner sc = new Scanner(System.in);
        switch (tipo){
            case 1:
                return new Cliente();
            case 2:
                return new Vendedor();
            default:
                return null;
        }
    }
}
