package com.company.dbManagement;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class ConnectionDB {
    private static Connection connection;
    private static ConnectionDB instance;

    private ConnectionDB(){
    }

    private static final String URL = "jdbc:mysql://localhost/empresa_db";
    private static final String USERNAME = "root";
    private static final String PASSWORD = "41902013";

    public Connection connect(){
        try {
            Class.forName("com.mysql.cj.jdbc.Driver");
            connection = DriverManager.getConnection(URL,USERNAME,PASSWORD);
            System.out.println("Conexion Exitosa!!");
            return connection;
        }catch (Exception e){
            System.out.println("Error que da: "+ e);
        }
        return connection;
    }

    public void disconect() throws SQLException {
        try {
            connection.close();
            System.out.println("Se Desconecto de la BDD");

        }catch(Exception e){
            System.out.println("Error que da: "+ e);
            connection.close();
        }finally {
            connection.close();
        }
    }

    public static ConnectionDB getInstance(){
        if(instance == null){
            instance = new ConnectionDB();
        }
        return instance;
    }
}
