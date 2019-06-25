package com.company.lesson_27_OOP;

public class Test_02 {
    public static void main(String[] args) {
        Cat cat = new Cat("Cat1", 2, 12);
        cat.ok();

        Animal dog = new Animal("Dog1", 3);
        dog.printName();

    }
}

class Animal{
    private String name;
    private int age;

    public Animal(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public void printName(){
        System.out.println("Name is " + name);
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }
}

class Cat extends Animal{

    private int tailLength;

    public Cat(String name, int age, int tailLength) {
        super(name, age);
        this.tailLength = tailLength;
    }

    public void ok(){
        System.out.println("ok");
    }
}

class Dog extends Animal{

    public Dog(String name, int age) {
        super(name, age);
    }

    @Override
    public void printName() {
        System.out.println("Dog name is " + this.getName());
    }

    public void k(){

    }
}