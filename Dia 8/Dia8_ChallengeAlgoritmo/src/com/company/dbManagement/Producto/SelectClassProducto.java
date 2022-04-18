package com.company.dbManagement.Producto;

import com.company.dbManagement.ConnectionDB;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

public class SelectClassProducto {
        public static void select(ConnectionDB connectionDB){
            try {
                Connection connection = connectionDB.connect();
                PreparedStatement select = connection.prepareStatement("SELECT * FROM Producto");
                ResultSet consult = select.executeQuery();
                System.out.println("PRODUCTOS:");
                while(consult.next()){
                    System.out.println("CODIGO DE PRODUCTO: " + consult.getString(1));
                    System.out.println("PRECIO UNITARIO: " + consult.getString(2));
                    System.out.println("CANTIDAD: "+consult.getString(3));
                    System.out.println("STOCK MINIMO: " +consult.getString(4));
                    System.out.println("\n");
                }
                connectionDB.disconect();
            }catch (Exception e){
                System.out.println("Error: " + e);
            }
        }
}
