package com.company.dbManagement.Venta;

import com.company.Challenge.Clases.Venta;
import com.company.dbManagement.ConnectionDB;

import java.sql.Connection;
import java.sql.PreparedStatement;

public class InsertClassVenta {
        public static void insert(ConnectionDB connectionDB, Venta venta){
            try{
                Connection connection = connectionDB.connect();

                PreparedStatement insert = connection.prepareStatement("INSERT INTO Venta VALUES(?,?,?,?)");
                insert.setString(1,"0");
                insert.setDate(2,venta.getFechaVenta());
                insert.setInt(3,venta.getIdCliente());
                insert.setInt(4,venta.getIdVendedor());
                insert.executeUpdate();
                System.err.println("Data was inserted!!");

                connectionDB.disconect();
            }catch(Exception e){
                System.err.println("Error: " + e);
            }
        }
}
