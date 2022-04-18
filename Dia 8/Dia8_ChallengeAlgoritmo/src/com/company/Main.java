package com.company;

import com.company.Challenge.Clases.Cliente;
import com.company.Challenge.Clases.Producto;
import com.company.Challenge.Clases.Vendedor;
import com.company.Challenge.Clases.Venta;
import com.company.Challenge.Creacion.CrearCliente;

import com.company.Challenge.Creacion.CrearProducto;
import com.company.Challenge.Creacion.CrearVendedor;
import com.company.Challenge.Creacion.CrearVenta;
import com.company.dbManagement.ConnectionDB;

import java.sql.Date;
import java.time.LocalDateTime;

import static com.company.dbManagement.Cliente.InsertClassCliente.insert;
import static com.company.dbManagement.Cliente.SelectClassCliente.select;


public class Main {
    public static void main(String[] args) {
        Cliente cliente = CrearCliente.registroDatos();
        //System.out.println(cliente);
        //Vendedor vendedor = CrearVendedor.registroDatos();
        //System.out.println(vendedor.toString());
       //Producto producto = CrearProducto.registroProducto();
        //System.out.println(producto);
        //Venta venta = CrearVenta.registrarVenta();
        //System.out.println(venta);


        ConnectionDB connectionDB = ConnectionDB.getInstance();
        insert(connectionDB,cliente);
        select(connectionDB);
    }
}
