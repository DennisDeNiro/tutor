package com.company.HW.Home_work_06_OBJECT_CLASS_METHODS;

/*
1) Создать класс Woman с параметрами: name, age, husband. Подумай, какого типа должна быть каждая переменная.
2) Создать класс Man с параметрами: name, age, wife. Подумай, какого типа должна быть каждая переменная.
3) В выполняющем методе создать по одному экземпляру каждого класса и
   сделать так, чтобы объекты стали мужем и женой.

   woman[ new Woman1("Tanya")]
*/
public class Home_work_03a {
    public static void main(String[] args) {
//        Woman2 woman = new Woman("Tanya",23, null);
//        Man2 man = new Man("Denis", 28, woman1 );
//        woman.setHusband(man2);
    }
}
// TODO: 04.04.2019

class Woman2 {
    private String name;
    private int age;
    private Man2 husband;

    public Woman2(String name, int age, Man2 husband) {
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

    public Man2 getHusband() {
        return this.husband;
    }

    public void setHusband(Man2 husband) {
        this.husband = husband;
    }
}

class Man2 {
    private String name;
    private int age;
    private Woman2 wife;

    public Man2(String name, int age,Woman2 wife) {
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

    public int getAge(){
        return age;
    }

    public void setAge(int age){
        this.age = age;
    }

    public Woman2 getWife(){
      return this.wife;
    }

    public void setWife(Woman2 wife){
        this.wife = wife;
    }
}
