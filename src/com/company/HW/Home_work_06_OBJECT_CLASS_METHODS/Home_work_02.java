package com.company.HW.Home_work_06_OBJECT_CLASS_METHODS;

public class Home_work_02 {
    public static void main(String[] args) {
        Woman owner = new Woman();
        Cat1 cat = new Cat1();
        Dog1 dog = new Dog1();
        Fish fish = new Fish();
        cat.setOwner("Woman");
        dog.setOwner("Woman");
        fish.setOwner("Woman");
        System.out.println("Хозяин кошки = " + cat.getOwner());
        System.out.println("Хозяин собаки = " + cat.getOwner());
        System.out.println("Хозяин рыбки = " + cat.getOwner());
    }
}

class Woman {
    String name;
    double age;
}

class Cat1 {
    String name;
    double age;
    String owner;

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
    String name;
    double age;
    String owner;

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
    String name;
    double age;
    String owner;

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