package com.company;

public class Stack {
    private int size;
    private String[] array;
    private int top = -1;

    public Stack(int size){
        if(size <= 0){
            throw new IllegalArgumentException("Debes ingresar un valor mayor que 0.");
        }
        this.size = size;
        array = new String[size];
    }

    public void push(String value){
        array[++this.top] = value;
    }

    public String pop(){
        return array[this.top--];
    }

    public String Views(){
        return array[this.top];
    }

    public boolean Empty(){
        return this.top < 0;
    }

    public boolean Full(){
        return this.top == this.size -1;
    }

    public boolean Search(String sel){
        String[] aux = this.array;
        boolean rta = false;
        int i =0;
        while(i < aux.length ^ rta == false){
                if(sel.compareTo(sel) ==0){
                    rta = true;
                }
        }
        return rta;
    }


}
