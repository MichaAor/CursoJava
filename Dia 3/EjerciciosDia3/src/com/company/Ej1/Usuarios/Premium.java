package com.company.Ej1.Usuarios;

import com.company.Ej1.Canciones.Cancion;
import java.util.ArrayList;
import java.util.Scanner;

public class Premium extends Usuario{

    @Override
    public void cargarPlayList(ArrayList<Cancion> canciones) {
        Scanner sc = new Scanner(System.in);
        escucharTodasLasCanciones(canciones);
        ArrayList<Cancion> playlistSem = new ArrayList<>();
        char rta = 's';
        do {
            playlistSem.add(Cancion.recuperarPorInd(canciones));
            System.out.println("Desea seguir cargando?");
            rta = sc.next().charAt(0);
        }while(rta == 's');
        this.setCanciones(playlistSem);
    }

    @Override
    public void escucharTodasLasCanciones(ArrayList<Cancion> canciones) {
        for(Cancion cancion : canciones){
                System.out.println("Se esta ejecutando: " + cancion.toString());
        }
    }


}
