package com.company.HW.Home_work_06_OBJECT_CLASS_METHODS;

public class Home_work_03 {
    public static void main(String[] args) {
        Woman1 woman = new Woman1("Tanya", 43, true);
        Man man = new Man("Maxim", 47, true);
        System.out.println("Женщина замужем? :" + woman.isHusband());
        System.out.println("Мужчина женат?  :" + man.isWife());
    }
}


class Woman1 {
    private String name;
    private int age;
    private boolean husband;

    public Woman1(String name, int age, boolean husband) {
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

    public boolean isHusband() {
        return husband;
    }

    public void setHusband(boolean husband) {
        this.husband = husband;
    }
}

class Man {
    private String name;
    private int age;
    private boolean wife;

    public Man(String name, int age, boolean wife) {
        this.name = name;
        this.age = age;
        this.wife = wife;
    }

    public String getName(String name) {
        return name;
    }

    public void setName() {
        this.name = name;
    }

    public int getAge(int age) {
        return age;
    }

    public void setAge() {
        this.age = age;
    }

    public boolean isWife() {
        return wife;
    }

    public void setWife() {
        this.wife = wife;
    }
}


