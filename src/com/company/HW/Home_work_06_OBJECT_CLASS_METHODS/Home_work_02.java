package com.company.HW.Home_work_06_OBJECT_CLASS_METHODS;


/*
1) Создать класс Woman с параметрами: name, age. Подумай, какого типа должна быть каждая переменная.
2) Создать классы Cat, Dog, Fish с параметрами: name, age, owner. Подумай, какого типа должна быть каждая переменная.
3) В выполняющем методе создать по одному экземпляру каждого класса и
   сделать так, чтобы владельцем каждого питомца была одна и таже женщина.
*/
public class Home_work_02 {
    public static void main(String[] args) {
        Woman woman = new Woman("Anna", 28);
        Woman woman1 = new Woman("Anna", 28);
        Woman woman2 = new Woman("Anna", 28);
        Woman woman3 = new Woman("Anna", 28);
        Woman woman4 = new Woman("Anna", 28);
        Cat1 cat = new Cat1("Dusia", 7, woman3);
        Dog1 dog = new Dog1("Aik", 5, "Woman");
        Fish fish = new Fish("Bity", 2, "Woman");
        System.out.println(" Хозиян кошки : " + cat.getOwner().getName() +"\n"+ " Хозиян собаки : " + dog.getOwner()+"\n" + " Хозиян рыбки : " + fish.getOwner());
        System.out.format("Хозяин кошки is %s\n Хозяин собаки is %s\n Хозяин рыбки is %s\n", cat.getOwner().getName(),dog.getOwner(),fish.getOwner());
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
    private Woman owner;

    public Cat1(String name, double age, Woman owner) {
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

    public Woman getOwner() {
        return owner;
    }

    public void setOwner(Woman owner) {
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