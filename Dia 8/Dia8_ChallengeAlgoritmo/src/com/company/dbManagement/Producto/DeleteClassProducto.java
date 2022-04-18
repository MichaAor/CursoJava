package com.company.dbManagement.Producto;

import com.company.dbManagement.ConnectionDB;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.util.Scanner;

public class DeleteClassProducto {
    public static void delete(ConnectionDB connectionDB){
        Scanner sc = new Scanner(System.in);
        try {
            Connection connection = connectionDB.connect();

            PreparedStatement delete = connection.prepareStatement("DELETE FROM Producto WHERE codProd = ? ");
            System.out.println("Ingrese codigo del Producto a borrar: ");
            String cod = String.valueOf(sc.nextInt());
                delete.setString(1, cod);
                delete.executeUpdate();
            System.out.println("Record successfully removed");

            connectionDB.disconect();
        }catch (Exception e){
            System.out.println("Error: " + e);
        }
    }
}
