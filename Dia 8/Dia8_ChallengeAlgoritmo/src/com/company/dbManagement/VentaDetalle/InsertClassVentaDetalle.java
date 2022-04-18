package com.company.dbManagement.VentaDetalle;

import com.company.Challenge.Clases.VentaDetalle;
import com.company.dbManagement.ConnectionDB;

import java.sql.Connection;
import java.sql.PreparedStatement;

public class InsertClassVentaDetalle{
    public static void insert(ConnectionDB connectionDB, VentaDetalle ventaDetalle) {

        try {
            Connection connection = connectionDB.connect();
                PreparedStatement insert = connection.prepareStatement("INSERT INTO Factura VALUES(?,?)");
                insert.setInt(1, ventaDetalle.getCodProd());
                insert.setInt(2, ventaDetalle.getNumVenta());
                insert.executeUpdate();
                System.err.println("Data was inserted!!");

            connectionDB.disconect();
        } catch (Exception e) {
            System.err.println("Error: " + e);
        }
    }
}


