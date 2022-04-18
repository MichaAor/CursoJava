package com.company.dbManagement.VentaDetalle;

import com.company.dbManagement.ConnectionDB;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.util.Scanner;

public class DeleteClassVentaDetalle{
    public static void delete(ConnectionDB connectionDB){
        Scanner sc = new Scanner(System.in);
        try {
            Connection connection = connectionDB.connect();

            PreparedStatement delete = connection.prepareStatement("DELETE FROM VentaDetalle " +
                    "WHERE numVenta = ? ");
            System.out.println("Ingrese numero de la Venta a borrar: ");
            String num = String.valueOf(sc.nextInt());
                delete.setString(1, num);
                delete.executeUpdate();
            System.out.println("Record successfully removed");
            connectionDB.disconect();
        }catch (Exception e){
            System.out.println("Error: " + e);
        }
    }
}
