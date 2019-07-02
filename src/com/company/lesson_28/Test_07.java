package com.company.lesson_28;
/* Создать класс Pet с методом getName, который возвращает строку "Я - пушистик"
Создать класс Cat и унаследоваться от Pet
Переопредели метод getName в классе Cat так, чтобы программа выдавала на экран надпись
«Я - кот».
*/
public class Test_07 {
}

class Pet1{
    private String name;

    public Pet1 getName(){
        System.out.println("Я пушистик");
        return new Pet1();
    }
}

class Cat2 extends Pet1{
    @Override
    public Cat2 getName() {
        System.out.println("Я - кот");
        return new Cat2();
    }
}