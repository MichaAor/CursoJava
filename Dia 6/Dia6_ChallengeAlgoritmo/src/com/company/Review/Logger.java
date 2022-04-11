package com.company.Review;
//Ejemplo para singleton
public class Logger {
    private static Logger log;
    private String value;

    private Logger(){} //Constructor privado en Singleton

    public static Logger getInstance(){
        if(log == null) {
            return log = new Logger();
        }
        return log;
    }

    public void setValue(String msg){
        value = msg;
    }

    public String getValue(){
        return value;
    }
}
