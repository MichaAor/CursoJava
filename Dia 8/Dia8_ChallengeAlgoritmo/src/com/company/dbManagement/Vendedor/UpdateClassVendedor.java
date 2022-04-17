package com.company.dbManagement.Vendedor;

import com.company.Challenge.Clases.Vendedor;
import com.company.dbManagement.ConnectionDB;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.util.Scanner;

public class UpdateClassVendedor {
    public static void update(ConnectionDB connectionDB, Vendedor vendedor,int idVendedor){
        Scanner sc = new Scanner(System.in);
        try {
            Connection connection = connectionDB.connect();

            PreparedStatement modify = connection.prepareStatement("UPDATE Vendedor " +
                    "SET nombre =?, apellido=?, dni=?, direccion=?, fechaNac=?, salario=? " +
                    "WHERE idCliente= ?");
            modify.setString(1, vendedor.getNombre());
            modify.setString(2, vendedor.getApellido());
            modify.setInt(3, vendedor.getDni());
            modify.setString(4, vendedor.getDireccion());
            modify.setDate(5, vendedor.getFechaNac());
            modify.setFloat(6, vendedor.getSalario());
            modify.setInt(6, idVendedor);
            modify.executeUpdate();
            System.err.println("Data was inserted!!");

            connectionDB.disconect();
        } catch (Exception e) {
            System.err.println("Error: " + e);
        }
    }
}
