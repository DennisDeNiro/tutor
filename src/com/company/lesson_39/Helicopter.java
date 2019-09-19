package com.company.lesson_39;

public class Helicopter implements Flyable {
    private int Pasenger;

    public Helicopter(int pasenger) {
        Pasenger = pasenger;
    }

    public int getPasenger() {
        return Pasenger;
    }

    public void setPasenger(int pasenger) {
        Pasenger = pasenger;
    }

    public String fly(){
        return "Helicopter is flying";
    }

    @Override
    public String toString() {
        return fly() + " with " + getPasenger();
    }
}
