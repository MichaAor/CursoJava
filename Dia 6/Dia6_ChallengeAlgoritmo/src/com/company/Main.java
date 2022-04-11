package com.company;

import com.company.Challenge.Estudiante;
import com.company.Challenge.Profesor;
import com.company.Challenge.Servicio;
import com.company.Review.Logger;

public class Main {
    private static EjeAcciones ejeAcciones;

    public static void main(String[] args) {
        //REVIEW
        /*
        Logger logger = Logger.getInstance();
        Logger logger1 = Logger.getInstance();
        logger.setValue("Hola mundo");
        logger1.setValue("Hola mundo 2.2");
        System.out.println(logger1.getValue());

        Thread threadOne = new Thread(new ThreadOne());
        Thread threadTwo = new Thread(new Threadtwo());

        threadOne.start();
        threadTwo.start();
         */

        ///Factory
        //ejeAcciones = new HistoryCar();
        //ejeAcciones = new CarAccions();
        ///CHALLENGE

        Estudiante estudiante = new Estudiante("Misael", "Flores", 41902013, "Soltero", "Programacion");
        Profesor profesor = new Profesor("Pablo", "Garnik", 21796433, "Casado", 1997, 12, "Java");
        Servicio servicio = new Servicio("Analia", "Petric", 47123578, "Soltera", 1989, 12, "Secretaria");

        System.out.println(estudiante.toString());
        System.out.println(profesor.toString());
        System.out.println(servicio.toString());

    }

    //EJEMPLO SINGLETON
    static class ThreadOne implements Runnable {
        @Override
        public void run() {
            Logger logger = Logger.getInstance();
            logger.setValue("Hola mundo");
            System.out.println(logger.getValue());
        }
    }

    static class Threadtwo implements Runnable {
        @Override
        public void run() {
            Logger logger1 = Logger.getInstance();
            logger1.setValue("Hola mundo 2.2");
            System.out.println(logger1.getValue());
        }
    }

//EJEMPLO FACTORY


    public interface Acciones {
        void render();

        void start();
    }

    public class CarAccions implements Acciones {
        @Override
        public void render() {

        }

        @Override
        public void start() {

        }
    }

    public class VehAccions implements Acciones {
        @Override
        public void render() {

        }

        @Override
        public void start() {

        }
    }

    public abstract class EjeAcciones {
        public void renderActions() {
            Acciones accionesFac = accionesFactory();
            accionesFac.render();
        }

        public abstract Acciones accionesFactory();
    }


    public class HistoryCar extends EjeAcciones {
        @Override
        public Acciones accionesFactory() {
            return new CarAccions();
        }
    }

}
