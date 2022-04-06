package com.company;

public class Main {

    public static void main(String[] args) {
        Stack stack = new Stack(5);
        int i=0;
        while(i<4) {
            stack.push((int) (Math.random() * 20 + 1));
        }
        stack.pop();
    }
}
