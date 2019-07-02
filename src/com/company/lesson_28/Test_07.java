package com.company.lesson_28;
/* Создать класс Pet с методом getName, который возвращает строку "Я - пушистик"
Создать класс Cat и унаследоваться от Pet
Переопредели метод getName в классе Cat так, чтобы программа выдавала на экран надпись
«Я - кот».
*/
public class Test_07 {
    public static void main(String[] args) {
        Pet1 cat = new Cat2();
        System.out.println(cat.getName());

    }
}

class Pet1{
    public String name;

    public String getName(){
        name = "Я пушистик";
        return name;
    }
}

class Cat2 extends Pet1{
    @Override
    public String getName(){
        name = "Я - кот";
        return name;
    }
}