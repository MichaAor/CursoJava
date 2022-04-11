package com.company;

import com.company.Challenge.Estudiante;
import com.company.Challenge.Profesor;
import com.company.Challenge.Servicio;
import com.company.Review.Logger;

public class Main {

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
        Estudiante estudiante = new Estudiante("Misael","Flores",41902013,"Soltero","Programacion");
        Profesor profesor = new Profesor("Pablo","Garnik",21796433,"Casado",1997,12,"Java");
        Servicio servicio = new Servicio("Analia","Petric",47123578,"Soltera",1989,12,"Secretaria");


        System.out.println(estudiante.toString());
        System.out.println(profesor.toString());
        System.out.println(servicio.toString());

    }

    static class ThreadOne implements  Runnable{
        @Override
        public void run() {
            Logger logger = Logger.getInstance();
            logger.setValue("Hola mundo");
            System.out.println(logger.getValue());
        }
    }

    static class Threadtwo implements  Runnable{
        @Override
        public void run() {
            Logger logger1 = Logger.getInstance();
            logger1.setValue("Hola mundo 2.2");
            System.out.println(logger1.getValue());
        }
    }
}
