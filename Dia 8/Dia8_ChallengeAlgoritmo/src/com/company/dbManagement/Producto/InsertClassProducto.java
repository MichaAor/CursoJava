package com.company.dbManagement.Producto;

import com.company.Challenge.Clases.Cliente;
import com.company.Challenge.Clases.Producto;
import com.company.dbManagement.ConnectionDB;

import java.sql.Connection;
import java.sql.PreparedStatement;

public class InsertClassProducto {
        public static void insert(ConnectionDB connectionDB, Producto producto){
            try{
                Connection connection = connectionDB.connect();

                PreparedStatement insert = connection.prepareStatement("INSERT INTO Cliente VALUES(?,?,?,?)");
                insert.setInt(1,producto.getCodProd());
                insert.setFloat(2,producto.getPrecioUnit());
                insert.setInt(3,producto.getCantidad());
                insert.setInt(4, producto.getStockMin());
                insert.executeUpdate();
                System.err.println("Data was inserted!!");

                connectionDB.disconect();
            }catch(Exception e){
                System.err.println("Error: " + e);
            }
        }
}
