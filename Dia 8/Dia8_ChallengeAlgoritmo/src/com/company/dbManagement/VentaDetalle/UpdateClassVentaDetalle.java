package com.company.dbManagement.VentaDetalle;

import com.company.Challenge.Clases.VentaDetalle;
import com.company.dbManagement.ConnectionDB;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.util.Scanner;

public class UpdateClassVentaDetalle{
    public static void update(ConnectionDB connectionDB, VentaDetalle ventaDetalle) {
        Scanner sc = new Scanner(System.in);
        try {
            Connection connection = connectionDB.connect();

            PreparedStatement modify = connection.prepareStatement("UPDATE Factura " +
                    "SET numVenta =?, codProd=?" +
                    "WHERE numFactura= ?");
            modify.setInt(1, ventaDetalle.getNumVenta());
            modify.setInt(2, ventaDetalle.getCodProd());
            modify.executeUpdate();
            System.err.println("Data was inserted!!");

            connectionDB.disconect();
        } catch (Exception e) {
            System.err.println("Error: " + e);
        }
    }


}
