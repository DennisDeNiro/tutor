package com.company.HW.Home_work_06_OBJECT_CLASS_METHODS;
/*
1) Создать класс Woman с параметрами: name, age, husband. Подумай, какого типа должна быть каждая переменная.
2) Создать класс Man с параметрами: name, age, wife. Подумай, какого типа должна быть каждая переменная.
3) В выполняющем методе создать по одному экземпляру каждого класса и
   сделать так, чтобы объекты стали мужем и женой.

   woman[ new Woman1("Tanya")]
*/
public class Home_work_03 {
    public static void main(String[] args) {
        Woman1 woman = new Woman1("Tanya", 43, null);
        Man man = new Man("Maxim", 47, woman);
        woman.setHusband(man);
        System.out.println("Женщина замужем за: " + woman.getHusband().getName());
        System.out.println("Мужчина женат за: " + man.getWife().getName());
    }
}


class Woman1 {
    private String name; // null
    private int age;     // 0
    private Man husband; // null

    public Woman1(String name, int age, Man husband) {
        this.name = name;
        this.age = age;
        this.husband = husband;
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

    public Man getHusband() {
        return this.husband;
    }

    public void setHusband(Man husband) {
        this.husband = husband;
    }
}

class Man {
    private String name;
    private int age;
    private Woman1 wife;

    public Man(String name, int age, Woman1 wife) {
        this.name = name;
        this.age = age;
        this.wife = wife;
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

    public Woman1 getWife() {
        return wife;
    }

    public void setWife(Woman1 wife) {
        this.wife = wife;
    }
}


