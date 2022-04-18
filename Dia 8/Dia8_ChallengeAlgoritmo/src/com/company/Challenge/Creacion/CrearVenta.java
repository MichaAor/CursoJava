package com.company.Challenge.Creacion;


import com.company.Challenge.Clases.Venta;

import java.sql.Date;
import java.util.Scanner;

public class CrearVenta {
    public static Venta registrarVenta(){
        Venta venta = new Venta();
        Scanner sc = new Scanner(System.in);
        Date date;  int dia,mes,año;
        System.out.println("Ingrese el id, vendedor: ");
        venta.setIdVendedor(sc.nextInt());
        System.out.println("Ingrese el id del cliente: ");
        venta.setIdCliente(sc.nextInt());
        System.out.println("Ingrese la fecha de la operacion: ");
        System.out.println("Dia: "); dia = sc.nextInt();
        System.out.println("Mes: "); mes = sc.nextInt();
        System.out.println("Año: "); año = sc.nextInt();
        date = new Date(año,mes,dia);
        venta.setFechaVenta(date);
        return venta;
    }
}
