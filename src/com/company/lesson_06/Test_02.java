package com.company.lesson_06;

public class Test_02 {
    public static void main(String[] args) {
        Cat cat1 = new Cat("Alex", 4, 47);
        Cat cat2 = new Cat("Igor", 6, 56);
//        System.out.println(cat1.getName());
//        cat1.setName("Jora");
//        System.out.println(cat1.getName());
        System.out.format("Name is %s, age = %d, power = %d\n", cat1.getName(), cat1.getAge(), cat1.getPower());
        System.out.println(cat1);
        System.out.println(cat2);
    }
}

class Cat{
    private String name;
    private int age;
    private int power;


    public Cat(String name, int a, int power){
        this.name=name;
        this.age=a;
        this.power=power;
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

    public int getPower() {
        return power;
    }

    public void setPower(int power) {
        this.power = power;
    }

    public String toString() {
       return String.format("Name is %s, age = %d, power = %d", this.name, age, power);
    }
}

