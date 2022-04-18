package com.company.Challenge.Creacion;

import com.company.Challenge.Clases.Producto;
import java.sql.Date;
import java.util.Scanner;

public class CrearProducto {
    public static Producto registroProducto(){
        Producto producto = new Producto();
        Scanner sc = new Scanner(System.in);
        Date date;  int dia,mes,año;
        System.out.println("Ingrese el codigo del producto: ");
            producto.setCodProd(sc.nextInt());
        System.out.println("Ingrese el precio unitario: ");
            producto.setPrecioUnit(sc.nextFloat());
        System.out.println("Ingrese la cantidad: ");
            producto.setCantidad(sc.nextInt());
        sc = new Scanner(System.in);
        System.out.println("Ingrese el stock minimo: ");
            producto.setStockMin(sc.nextInt());
        return producto;
    }
}
