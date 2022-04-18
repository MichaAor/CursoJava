package com.company.dbManagement.Venta;

import com.company.Challenge.Clases.Venta;
import com.company.dbManagement.ConnectionDB;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.util.Scanner;

public class UpdateClassVenta {
    public static void update(ConnectionDB connectionDB, Venta venta){
        Scanner sc = new Scanner(System.in);
        try {
            Connection connection = connectionDB.connect();

            PreparedStatement modify = connection.prepareStatement("UPDATE Venta " +
                    "SET fechaVenta =?, idCliente=?, idVendedor=?" +
                    "WHERE numVenta= ?");
            modify.setDate(1, venta.getFechaVenta());
            modify.setInt(2, venta.getIdCliente());
            modify.setInt(3, venta.getIdVendedor());
            modify.setInt(4, venta.getNumVenta());
            modify.executeUpdate();
            System.err.println("Data was inserted!!");

            connectionDB.disconect();
        } catch (Exception e) {
            System.err.println("Error: " + e);
        }
    }

}
