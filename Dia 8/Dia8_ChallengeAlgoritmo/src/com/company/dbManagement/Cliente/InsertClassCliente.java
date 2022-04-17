package com.company.dbManagement.Cliente;

import com.company.Challenge.Clases.Cliente;
import com.company.dbManagement.ConnectionDB;

import java.sql.Connection;
import java.sql.PreparedStatement;

public class InsertClassCliente {
        public static void insert(ConnectionDB connectionDB, Cliente cliente){
            try{
                Connection connection = connectionDB.connect();

                PreparedStatement insert = connection.prepareStatement("INSERT INTO Cliente VALUES(?,?,?,?,?,?)");
                insert.setString(1,"0");
                insert.setString(2,cliente.getNombre());
                insert.setString(3,cliente.getApellido());
                insert.setInt(4, cliente.getDni());
                insert.setString(5,cliente.getDireccion());
                insert.setDate(6,cliente.getFechaNac());
                insert.executeUpdate();
                System.err.println("Data was inserted!!");

                connectionDB.disconect();
            }catch(Exception e){
                System.err.println("Error: " + e);
            }
        }
}
