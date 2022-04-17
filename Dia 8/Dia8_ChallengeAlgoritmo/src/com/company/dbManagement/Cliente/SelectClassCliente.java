package com.company.dbManagement.Cliente;

import com.company.dbManagement.ConnectionDB;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

public class SelectClassCliente {
        public static void select(ConnectionDB connectionDB){
            try {
                Connection connection = connectionDB.connect();
                PreparedStatement select = connection.prepareStatement("SELECT * FROM Cliente");
                ResultSet consult = select.executeQuery();
                System.out.println("CLIENTES:");
                while(consult.next()){
                    System.out.println("ID: " + consult.getString(1));
                    System.out.println("NOMBRE: " + consult.getString(2));
                    System.out.println("APELLIDO: "+consult.getString(3));
                    System.out.println("DNI: " +consult.getString(4));
                    System.out.println("DIRECCION: "+consult.getString(5));
                    System.out.println("FECHA DE NACIMIENTO: "+consult.getString(6));
                    System.out.println("\n");
                }
                connectionDB.disconect();
            }catch (Exception e){
                System.out.println("Error: " + e);
            }
        }
}
