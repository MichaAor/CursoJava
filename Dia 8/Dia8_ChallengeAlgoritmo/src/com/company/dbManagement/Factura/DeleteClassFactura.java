package com.company.dbManagement.Factura;

import com.company.dbManagement.ConnectionDB;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.util.Scanner;

public class DeleteClassFactura {
    public static void delete(ConnectionDB connectionDB){
        Scanner sc = new Scanner(System.in);
        try {
            Connection connection = connectionDB.connect();

            PreparedStatement delete = connection.prepareStatement("DELETE FROM Factura where numFactura = ? ");
            System.out.println("Ingrese id de la Factura a borrar: ");
            String id = String.valueOf(sc.next().charAt(0));
                delete.setString(1,id);
                delete.executeUpdate();
            System.out.println("Record successfully removed");

            connectionDB.disconect();
        }catch (Exception e){
            System.out.println("Error: " + e);
        }
    }
}
