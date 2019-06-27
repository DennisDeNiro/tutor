package com.company.lesson_28;
/*
Создать классы Pet, Cat, Dog
В классе Pet создать метод getChild(), который возвращает экземпляр класса Pet.
Переопределить метод getChild в классах Cat(кот) и Dog(собака), чтобы кот порождал кота, а собака – собаку.
*/
public class Test_01 {
    public static void main(String[] args) {
        Pet pet = new Pet();
        Cat cat = new Cat();
        Dog dog = new Dog();
        pet.getChild();
        cat.getChild();
        dog.getChild();
    }
}

class Pet{
    public Pet getChild() {
        return new Pet();
    }
}

class Cat extends Pet{

    @Override
    public Cat getChild() {
        return new Cat();
    }
}

class Dog extends Pet{

    @Override
    public Dog getChild() {
        return new Dog();
    }
}