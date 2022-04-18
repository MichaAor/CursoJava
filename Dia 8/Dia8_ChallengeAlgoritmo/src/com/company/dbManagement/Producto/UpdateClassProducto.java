package com.company.dbManagement.Producto;

import com.company.Challenge.Clases.Cliente;
import com.company.Challenge.Clases.Producto;
import com.company.dbManagement.ConnectionDB;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.util.Scanner;

public class UpdateClassProducto {
    public static void update(ConnectionDB connectionDB, Producto producto) {
        Scanner sc = new Scanner(System.in);
        try {
            Connection connection = connectionDB.connect();

            PreparedStatement modify = connection.prepareStatement("UPDATE Producto " +
                    "SET precioUnit =?, cantidad=?, dni=?, stockMin=?" +
                    "WHERE codProd= ?");
            modify.setFloat(1, producto.getPrecioUnit());
            modify.setInt(2, producto.getCantidad());
            modify.setInt(3, producto.getStockMin());
            modify.setInt(4, producto.getCodProd());
            modify.executeUpdate();
            System.err.println("Data was inserted!!");

            connectionDB.disconect();
        } catch (Exception e) {
            System.err.println("Error: " + e);
        }
    }
}
