package com.company.Ej1.Usuarios;

import com.company.Ej1.Canciones.Cancion;
import java.util.ArrayList;

public class Estandar extends Usuario {

    @Override
    public void escucharTodasLasCanciones(ArrayList<Cancion> canciones) {
        for(Cancion cancion : canciones){
            if((int)(Math.random() * canciones.size() + 1) %2 == 0) {
                System.out.println("Se esta ejecutando: " + cancion.toString());
            }
        }
    }

    @Override
    public void cargarPlayList(ArrayList<Cancion> canciones) {
        this.escucharTodasLasCanciones(canciones);
        ArrayList<Cancion> playlistSem = new ArrayList<>();
        for(int i=0;i<5;i++){
            playlistSem.add(Cancion.recuperarPorInd(canciones));
        }
        this.setCanciones(playlistSem);
    }
}
