package com.company.HW.Home_work_06_OBJECT_CLASS_METHODS;

public class Home_work_02 {
    public static void main(String[] args) {
        Woman woman = new Woman("Anna", 28);
        Cat1 cat = new Cat1("Dusia", 7, "Woman");
        Dog1 dog = new Dog1("Aik", 5, "Woman");
        Fish fish = new Fish("Bity", 2, "Woman");
        System.out.println(" Хозиян кошки : " + cat.getOwner() +"\n"+ " Хозиян собаки : " + dog.getOwner()+"\n" + " Хозиян рыбки : " + fish.getOwner());
        System.out.format("Хозяин кошки is %s\n Хозяин собаки is %s\n Хозяин рыбки is %s\n", cat.getOwner(),dog.getOwner(),fish.getOwner());
    }
}

class Woman {
    private String name;
    private int age;

    public Woman(String name, int age) {
        this.name = name;
        this.age = age;
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

class Cat1 {
    private String name;
    private double age;
    private String owner;

    public Cat1(String name, double age, String owner) {
        this.name = name;
        this.age = age;
        this.owner = owner;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getAge() {
        return age;
    }

    public void setAge(double age) {
        this.age = age;
    }

    public String getOwner() {
        return owner;
    }

    public void setOwner(String owner) {
        this.owner = owner;
    }
}


class Dog1 {
    private String name;
    private double age;
    private String owner;

    public Dog1(String name, double age, String owner) {
        this.name = name;
        this.age = age;
        this.owner = owner;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getAge() {
        return age;
    }

    public void setAge(double age) {
        this.age = age;
    }

    public String getOwner() {
        return owner;
    }

    public void setOwner(String owner) {
        this.owner = owner;
    }
}

class Fish {
    private String name;
    private double age;
    private String owner;

    public Fish(String name, double age, String owner) {
        this.name = name;
        this.age = age;
        this.owner = owner;
    }

    public String getName() {
        return name;
    }

    public void setName() {
        this.name = name;
    }

    public double getAge() {
        return age;
    }

    public void setAge() {
        this.age = age;
    }

    public String getOwner() {
        return owner;
    }

    public void setOwner() {
        this.owner = owner;
    }
}