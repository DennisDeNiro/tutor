package com.company.HW.Home_work_11;
/*
1. Создать класс Cat с переменными name, age, weight.
2. Скрыть все внутренние переменные класса Cat:
- создать геттеры и сеттеры
- скрыть методы, позволяющие менять внутреннее состояние объектов класса Cat.
*/
public class Home_work_01 {
    public static void main(String[] args) {
        Cat cat = new Cat();
    }
}

class Cat{
    private String name;
    private int age;
    private int weight;

    private String getName() {
        return name;
    }

    private void setName(String name) {
        this.name = name;
    }

    private int getAge() {
        return age;
    }

    private void setAge(int age) {
        this.age = age;
    }

    private int getWeight() {
        return weight;
    }

    private void setWeight(int weight) {
        this.weight = weight;
    }
}
