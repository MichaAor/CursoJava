package com.company.dbManagement.Factura;

import com.company.dbManagement.ConnectionDB;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

public class SelectClassFactura {
        public static void select(ConnectionDB connectionDB){
            try {
                Connection connection = connectionDB.connect();
                PreparedStatement select = connection.prepareStatement("SELECT * FROM Factura");
                ResultSet consult = select.executeQuery();
                System.out.println("Facturas: ");
                while(consult.next()){
                    System.out.println("NUMERO DE FACTURA: " + consult.getString(1));
                    System.out.println("ID VENTA: " + consult.getString(2));
                    System.out.println("ID PRODUCTO: "+consult.getString(3));
                    System.out.println("\n");
                }
                connectionDB.disconect();
            }catch (Exception e){
                System.out.println("Error: " + e);
            }
        }
}
