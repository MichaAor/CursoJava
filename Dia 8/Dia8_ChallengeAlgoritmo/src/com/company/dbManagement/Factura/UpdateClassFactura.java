package com.company.dbManagement.Factura;

import com.company.Challenge.Clases.Cliente;
import com.company.Challenge.Clases.Factura;
import com.company.dbManagement.ConnectionDB;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.util.Scanner;

public class UpdateClassFactura {
    public static void update(ConnectionDB connectionDB, Factura factura, int numFactura) {
        Scanner sc = new Scanner(System.in);
        try {
            Connection connection = connectionDB.connect();

            PreparedStatement modify = connection.prepareStatement("UPDATE Factura " +
                    "SET numVenta =?, codProd=?" +
                    "WHERE numFactura= ?");
            modify.setInt(1, factura.getIdProductos().get(1));
            modify.setInt(2, factura.getIdVentas().get(1));
            modify.setInt(3, numFactura);
            modify.executeUpdate();
            System.err.println("Data was inserted!!");

            connectionDB.disconect();
        } catch (Exception e) {
            System.err.println("Error: " + e);
        }
    }


}
