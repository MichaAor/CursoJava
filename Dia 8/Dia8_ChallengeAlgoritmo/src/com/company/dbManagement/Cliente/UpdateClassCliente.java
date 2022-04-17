package com.company.dbManagement.Cliente;

import com.company.Challenge.Clases.Cliente;
import com.company.dbManagement.ConnectionDB;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.util.Scanner;

public class UpdateClassCliente {
    public static void update(ConnectionDB connectionDB, Cliente cliente,int idCliente) {
        Scanner sc = new Scanner(System.in);
        try {
            Connection connection = connectionDB.connect();

            PreparedStatement modify = connection.prepareStatement("UPDATE Cliente " +
                    "SET nombre =?, apellido=?, dni=?, direccion=?, fechaNac=? " +
                    "WHERE idCliente= ?");
            modify.setString(1, cliente.getNombre());
            modify.setString(2, cliente.getApellido());
            modify.setInt(3, cliente.getDni());
            modify.setString(4, cliente.getDireccion());
            modify.setDate(5, cliente.getFechaNac());
            modify.setInt(6, idCliente);
            modify.executeUpdate();
            System.err.println("Data was inserted!!");

            connectionDB.disconect();
        } catch (Exception e) {
            System.err.println("Error: " + e);
        }
    }
}
