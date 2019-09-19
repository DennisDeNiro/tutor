package com.company.lesson_39;

public class Plane implements Flyable {
    private int Pasenger;

    public Plane(int pasenger) {
        Pasenger = pasenger;
    }

    public int getPasenger() {
        return Pasenger;
    }

    public void setPasenger(int pasenger) {
        Pasenger = pasenger;
    }

    public String fly(){
        return "Plane is flying";
    }

    @Override
    public String toString() {
        return fly() + " with " + getPasenger();
    }
}
