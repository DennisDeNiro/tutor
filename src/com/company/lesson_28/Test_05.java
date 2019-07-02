package com.company.lesson_28;
/* Fly, Move, Eat для классов Dog, Car, Duck, Airplane
Создать интерфейсы Fly(летать), Move(передвигаться), Eat(есть) с методами fly, move, eat соответсвенно.
Добавь эти интерфейсы классам Dog(собака), Car(автомобиль), Duck(утка), Airplane(самолет).
*/

public class Test_05 {
    public static void main(String[] args) {

    }
}

 interface Fly {
    public void fly();
 }
 interface Move{
    public void move();
}
 interface Eat{
    public void eat();

}

class Dog2 implements Eat, Move{
    @Override
    public void move() {

    }

    @Override
    public void eat() {

    }
}

class Car implements Move{
    @Override
    public void move() {

    }
}

class Duck implements Fly,Eat{
    @Override
    public void fly() {

    }

    @Override
    public void eat() {

    }
}

class Airplane implements Fly,Move{
    @Override
    public void fly() {

    }

    @Override
    public void move() {

    }
}