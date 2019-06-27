package com.company.lesson_28;

import java.util.List;

public class Test_04 {
    public static void main(String[] args) {
        Animal el = new Elephant();
        el.printAnimal();
        Object o = new Elephant();
        ((Elephant)o).printName();
    }
}

abstract class Animal{
    private String name;
    private String age;

    public void printAnimal(){
        System.out.println("Animal");
    }

    public abstract void printName();

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getAge() {
        return age;
    }

    public void setAge(String age) {
        this.age = age;
    }
}

class Elephant extends Animal{
    private String hobot;

    @Override
    public void printName() {
        System.out.println("Elephant name is " + getName());
    }
}

abstract class WhaterAnimal extends Animal{
    public abstract void swim();

}

class Fish extends WhaterAnimal{

    @Override
    public void printName() {

    }

    @Override
    public void swim() {

    }
}

interface Flyable{
    public static final String s = "t";

    public abstract void m();
}