package com.bootcamp.Dia11_ChallengeAlgoritmo.Service;

import com.bootcamp.Dia11_ChallengeAlgoritmo.Model.UsuarioModel;
import com.google.gson.Gson;
import com.google.gson.reflect.TypeToken;
import org.springframework.stereotype.Service;

import java.io.*;
import java.util.ArrayList;

@Service
public class UsuarioService {

        public static String registrarUsuario(String nombre,String apellido,String dni) throws IOException {
            ArrayList<UsuarioModel> usuarios = leerUsuariosJSON();//new ArrayList<UsuarioModel>();
            UsuarioModel usuario;
            String str = null;
            if(!consultarXdni(dni)){
                usuario = new UsuarioModel(nombre, apellido, dni);
                usuarios.add(usuario);
                str = "SE REGISTRO EXITOSAMENTE";
            }
            guardarUsuariosJSON(usuarios);
            return str;
        }

        public static boolean consultarXdni(String dni) throws IOException {
            ArrayList<UsuarioModel> usuarios = leerUsuariosJSON();
            boolean rta = false;
            if(!usuarios.isEmpty()) {
                for (UsuarioModel usuario : usuarios) {
                    if (usuario.getDni().compareTo(dni) == 0) {
                        rta = true;
                        break;
                    }
                }
            }else {
                rta = true;
            }
            return rta;
        }

        public static String consultarUsuarios() throws IOException {
            ArrayList<UsuarioModel> usuarios = leerUsuariosJSON();
            String rta = null;
            if(!usuarios.isEmpty()) {
                rta = "\n----AUTOS--------\n";
                for(UsuarioModel usuario : usuarios){
                    rta += usuario.toString()+"\n";
                }
            }
            return rta;
        }

        public static String consultarUsuarioXdni(String dni) throws IOException {
            ArrayList<UsuarioModel> usuarios = leerUsuariosJSON();
            String rta = null;
            if(!usuarios.isEmpty()) {
                for(UsuarioModel usuario : usuarios){
                    if(usuario.getDni().compareTo(dni)==0){
                        rta = usuario.toString();
                        break;
                    }
                }
            }
            return rta;
        }

        public static String borrarUsuarioXdni(String dni) throws IOException {
            ArrayList<UsuarioModel> usuarios = leerUsuariosJSON();
            String rta = null;
            if(!usuarios.isEmpty()) {
                for(UsuarioModel usuario : usuarios){
                    if(usuario.getDni().compareTo(dni)==0){
                        usuarios.remove(usuario);
                        rta = "Se ha encontrado y borrado con exito el Usuario";
                        break;
                    }
                }
                guardarUsuariosJSON(usuarios);
            }
            return rta;
        }


        ///Metodos GSON

        public static boolean guardarUsuariosJSON(ArrayList<UsuarioModel> autos) throws IOException {
            BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter("Usuarios"));
            try{
                Gson gson = new Gson();
                gson.toJson(autos,new TypeToken<ArrayList<UsuarioModel>>() {}.getType(), bufferedWriter);
            }finally {
                bufferedWriter.close();
            }
            return true;
        }

        public static ArrayList<UsuarioModel> leerUsuariosJSON() throws IOException {
            ArrayList<UsuarioModel> usuarios = new ArrayList<UsuarioModel>();
            BufferedReader bufferedReader = new BufferedReader(new FileReader("Usuarios"));
            try {
                Gson gson = new Gson();
                usuarios = gson.fromJson(bufferedReader, new TypeToken<ArrayList<UsuarioModel>>(){}.getType());
            } finally {
                bufferedReader.close();
            }
            return usuarios;
        }


    }

