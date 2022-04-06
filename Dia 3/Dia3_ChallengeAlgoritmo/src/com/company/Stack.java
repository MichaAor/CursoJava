package com.company;

public class Stack {
    private int top =-1;
    private Object[] content;
    private int size;

    public Stack(int size){
        if(size <=0) {
            throw new ExceptionInInitializerError("El tamaño de la pila debe ser siempre mayor a 0");
        }
        this.size = size;
        content = new Object[size];
    }

    public void push(Object value){
        content[++this.top] = value;
    }

    public Object pop(){
        return this.content[this.top];
    }

    public boolean empty(){
        return size == 0;
    }

    public boolean full(){
        return this.size == this.top+1;
    }

    public boolean search(Object object){
        boolean rta = false;
        int i=0;
            while(i < this.content.length ^ rta == false){
                if(this.content[i].equals(object)){
                    rta = true;
                }
            }
            return rta;
    }

    public int amountObj(){
        return this.top;
    }

    public Object top(){
        return this.content[this.top-1];
    }

    public void view(){
        while(!empty()){
            System.out.println(this.top);
            this.pop();
        }
    }

}
