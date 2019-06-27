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


    public String getChild() {
        return getChild();
    }
}

class Cat extends Pet{


    @Override
    public String getChild() {
        System.out.println("Кошка");
        return this.getChild();
    }
}

class Dog extends Pet{
    private String name;

    @Override
    public String getChild() {
        System.out.println("Собака");
        return this.getChild();
    }
}