package com.company.dbManagement.Factura;

import com.company.Challenge.Clases.Factura;
import com.company.dbManagement.ConnectionDB;

import java.sql.Connection;
import java.sql.PreparedStatement;

public class InsertClassFactura {
    public static void insert(ConnectionDB connectionDB, Factura factura) {

        try {
            Connection connection = connectionDB.connect();
            for (int i = 0; i < factura.getIdVentas().size(); i++) {
                PreparedStatement insert = connection.prepareStatement("INSERT INTO Factura VALUES(?,?,?)");
                insert.setInt(1, factura.getNumFactura());
                insert.setInt(2, factura.getIdVentas().get(i));
                insert.setInt(3, factura.getIdProductos().get(i));
                insert.executeUpdate();
                System.err.println("Data was inserted!!");
            }

            connectionDB.disconect();
        } catch (Exception e) {
            System.err.println("Error: " + e);
        }
    }
}


