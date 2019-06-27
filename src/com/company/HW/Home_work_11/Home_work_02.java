package com.company.HW.Home_work_11;

/*
 Создать классы Cat и Dog с параметрами name и speed
 Скрыть все внутренние переменные класса Cat и Dog.
 Также скрыть все методы, кроме тех, с помощью которых эти классы взаимодействуют друг с другом.
 Создать метод isDogNear в классе Cat, который возвращает true, если скорость кота больше
 Создать метод isCatNear в классе Dog, который возвращает true, если скорость собаки больше
*/
public class Home_work_02 {
    public static void main(String[] args) {
        Cat1 cat1 = new Cat1("Мурзик", 80);
        Dog dog = new Dog("Пират", 35);

     cat1.isDogNear();
    }
}

class Cat1 {
    public String name;
    public int speed;

    public Cat1(String name, int speed) {
        this.name = name;
        this.speed = speed;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getSpeed() {
        return speed;
    }

    public void setSpeed(int speed) {
        this.speed = speed;
    }

    public void isDogNear() {

    }

}

class Dog {
    public String name;
    public int speed;

    Dog(String name, int speed) {
        this.name = name;
        this.speed = speed;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getSpeed() {
        return speed;
    }

    public void setSpeed(int speed) {
        this.speed = speed;
    }

    public void isCatNeat() {

    }
}
