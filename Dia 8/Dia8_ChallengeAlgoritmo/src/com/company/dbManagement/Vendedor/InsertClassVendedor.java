package com.company.dbManagement.Vendedor;

import com.company.Challenge.Clases.Vendedor;
import com.company.dbManagement.ConnectionDB;

import java.sql.Connection;
import java.sql.PreparedStatement;

public class InsertClassVendedor {

    public static void insert(ConnectionDB connectionDB, Vendedor vendedor){
        try{
            Connection connection = connectionDB.connect();

            PreparedStatement insert = connection.prepareStatement("INSERT INTO Vendedor VALUES(?,?,?,?,?,?,?)");
            insert.setString(1,"0");
            insert.setString(2,vendedor.getNombre());
            insert.setString(3,vendedor.getApellido());
            insert.setInt(4, vendedor.getDni());
            insert.setString(5,vendedor.getDireccion());
            insert.setDate(6,vendedor.getFechaNac());
            insert.setFloat(7,vendedor.getSalario());

            insert.executeUpdate();
            System.err.println("Data was inserted!!");

            connectionDB.disconect();
        }catch(Exception e){
            System.err.println("Error: " + e);
        }
    }

}
