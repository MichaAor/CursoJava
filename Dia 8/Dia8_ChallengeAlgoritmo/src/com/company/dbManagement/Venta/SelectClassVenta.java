package com.company.dbManagement.Venta;

import com.company.dbManagement.ConnectionDB;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

public class SelectClassVenta {
        public static void select(ConnectionDB connectionDB){
            try {
                Connection connection = connectionDB.connect();
                PreparedStatement select = connection.prepareStatement("SELECT * FROM Venta");
                ResultSet consult = select.executeQuery();
                System.out.println("VENTAS:");
                while(consult.next()){
                    System.out.println("ID: " + consult.getString(1));
                    System.out.println("FECHA DE VENTA: " + consult.getString(2));
                    System.out.println("ID CLIENTE: "+consult.getString(3));
                    System.out.println("ID VENDEDOR: " +consult.getString(4));
                    System.out.println("\n");
                }
                connectionDB.disconect();
            }catch (Exception e){
                System.out.println("Error: " + e);
            }
        }
}
