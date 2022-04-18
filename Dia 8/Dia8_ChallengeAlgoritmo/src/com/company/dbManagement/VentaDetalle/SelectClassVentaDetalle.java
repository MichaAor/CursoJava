package com.company.dbManagement.VentaDetalle;

import com.company.dbManagement.ConnectionDB;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

public class SelectClassVentaDetalle{
        public static void select(ConnectionDB connectionDB){
            try {
                Connection connection = connectionDB.connect();
                PreparedStatement select = connection.prepareStatement("SELECT * FROM VentaDetalle");
                ResultSet consult = select.executeQuery();
                System.out.println("VentaDetalle: ");
                while(consult.next()){
                    System.out.println("ID VENTA: " + consult.getString(1));
                    System.out.println("ID PRODUCTO: "+consult.getString(2));
                    System.out.println("\n");
                }
                connectionDB.disconect();
            }catch (Exception e){
                System.out.println("Error: " + e);
            }
        }
}
