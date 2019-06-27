package com.company.lesson_28;
/* Или «Кошка», или «Птица», или «Лампа», или «Собака»
Написать метод, который определяет, объект какого класса ему передали, и возвращает результат – одно значение из: «Кошка», «Птица», «Лампа», «Собака».
*/
public class Test_03 {
    public static void main(String[] args) {
        method(new Cat1());
        method(new Bird());
        method(new Lamp());
        method(new Dog1());
    }

    private static void method(Object o){
        if (o instanceof Cat1){
            System.out.println("Cat");
        } else  if (o instanceof Bird){
            System.out.println("Bird");
        }else if (o instanceof Lamp){
            System.out.println("Lamp");
        }else if (o instanceof Dog1){
            System.out.println("Dog");
        }
    }
}

class Cat1{}
class Bird{}
class Lamp{}
class Dog1{}