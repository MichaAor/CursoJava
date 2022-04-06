package com.company.Ej1.Usuarios;
import com.company.Ej1.Canciones.Cancion;
import java.util.ArrayList;
import java.util.Scanner;

public class Usuario {
    private String username;
    private String password;
    private ArrayList<Cancion> canciones = new ArrayList<>();

    public Usuario(){}

    public void registrarse(){
        Scanner sc = new Scanner(System.in);
        System.out.println("Ingrese user");
        this.username = sc.nextLine();
        System.out.println("Ingrese password");
        this.password = sc.nextLine();
    }

    public void escucharTodasLasCanciones(ArrayList<Cancion> canciones){
    }

    public void cargarPlayList(ArrayList<Cancion> canciones){}



    public String getUsername() {
        return username;
    }
    public void setUsername(String username) {
        this.username = username;
    }

    public String getPassword() {
        return password;
    }
    public void setPassword(String password) {
        this.password = password;
    }

    public ArrayList<Cancion> getCanciones() {
        return canciones;
    }
    public void setCanciones(ArrayList<Cancion> canciones) {
        this.canciones = canciones;
    }
}
