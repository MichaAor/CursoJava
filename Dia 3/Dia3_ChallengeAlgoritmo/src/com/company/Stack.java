package com.company;

public class Stack {
    private int size;
    private int[] array;
    private int top = -1;

    public Stack(int size){
        if(size <= 0){
            throw new IllegalArgumentException("Debes ingresar un valor mayor que 0.");
        }
        this.size = size;
        array = new int[size];
    }

    public void push(int value){
        array[++this.top] = value;
    }

    public int pop(){
        return array[this.top--];
    }

    public int Views(){
        return array[this.top];
    }

    public boolean Empty(){
        return this.top < 0;
    }

    public boolean Full(){
        return this.top == this.size -1;
    }

    public boolean Search(int sel){
        Stack stack = new Stack(this.size);
        boolean rta = false;
       while(!Empty() ^ rta == false){
           if(sel == this.Views()){
               rta = true;
           }
           stack.push(this.pop());
       }
        return rta;
    }
    public void viewStack(){
        Stack stack = this;
        Stack aux = new Stack(this.size);
        while(!stack.Empty()){
            System.out.println("["+stack.Views()+"]");
            aux.push(stack.pop());
        }
    }

    public int Counter(){
        Stack stack = this;
        int i =0;
        Stack aux = new Stack(this.size);
        while(!stack.Empty()){
            System.out.println("["+stack.Views()+"]");
            aux.push(stack.pop());
            i++;
        }
        return i;
    }

    public int sumaRecu(int num){
        Stack stack = this;
        int sum =0;
        if(!stack.Empty()){
            sum += sumaRecu(stack.pop());
        }
        return sum;
    }



}


