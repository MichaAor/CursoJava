package com.company.dbManagement.Vendedor;

import com.company.dbManagement.ConnectionDB;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.util.Scanner;

public class DeleteClassVendedor {
    public static void delete(ConnectionDB connectionDB){
        Scanner sc = new Scanner(System.in);
        try {
            Connection connection = connectionDB.connect();

            PreparedStatement delete = connection.prepareStatement("DELETE FROM Vendedor WHERE dni = ? ");
            System.out.println("Ingrese dni del Vendedor a borrar: ");
            String dni = String.valueOf(sc.nextInt());
                delete.setString(1, dni);
                delete.executeUpdate();
            System.out.println("Record successfully removed");

            connectionDB.disconect();
        }catch (Exception e){
            System.out.println("Error: " + e);
        }
    }
}
