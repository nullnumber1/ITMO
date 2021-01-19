package com.nullnumber1.lab4;

public class Shortie extends Person {
    private boolean dizzy = false;

    public boolean isDizzy() {
        return dizzy;
    }

    public Shortie() {

    }
    public void spin(){
        this.setLocation(Location.CAROUSEL);
        if(this.toString().equals("Козлик")) {
            dizzy = true;
        }
    }
    public Shortie(String name) {
        super(name);
    }


    @Override
    public String toString() {
        return super.toString();
    }

    @Override
    public int hashCode() {
        return super.hashCode();
    }

    static class Goat extends Shortie {
        public Goat() {
            super("Козлик");
        }
        public void seatGrab(){
            Lab4Application.Narrator.printLn(this.toString()+" crouched down, clutching the ground with his hands ");
        }
    }
}
