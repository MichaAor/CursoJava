package com.company.ejPairProgramming;

public class Unit {
    protected int life;
    protected int atk;
    protected int prob;

    public int attack(){
        return 0;
    }

    public void view(){
            System.out.println(this.getClass().getSimpleName() +
                    "\nLife: " + this.life +
                    "\nAtk: "+ this.atk +
                    "\nProb: "+this.prob);

    }

    public int getLife() {
        return life;
    }
    public void setLife(int life) {
        this.life = life;
    }

    public int getAtk() {
        return atk;
    }
    public void setAtk(int atk) {
        this.atk = atk;
    }

    public int getProb() {
        return prob;
    }
    public void setProb(int prob) {
        this.prob = prob;
    }
}
