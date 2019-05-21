package com.company.HW.Home_work_09;

import java.util.ArrayList;
import java.util.List;

/*
1. Создай класс Human с полями имя (String), пол (boolean), возраст (int), дети (ArrayList<Human>).
2. Создай объекты и заполни их так, чтобы получилось: два дедушки, две бабушки, отец, мать, трое детей.
3. Вывести все объекты Human на экран.

Имя: ded Ivan, пол: мужской, возраст: 70, дети: papa Fedya
Имя: baba Masha, пол: женский, возраст: 65, дети: papa Fedya
Имя: papa Fedya, пол: мужской, возраст: 40, дети: son Lesha, son Misha, daughter Masha
*/
// TODO: 21.05.2019  
public class Test_02 {
    public static void main(String[] args) {
        Human child = new Human("Ivan",true,4);
        Human child1 = new Human("Maksim",true,5);
        Human child2 = new Human("Anna",false,5);
        Human father = new Human("Vasya", true,45,child,child1,child2);
        Human mother = new Human("Alla", false,37,child,child1,child2);
//        Human granfather = new Human();
//        Human granmother = new Human();


        System.out.println(mother);

    }
}
class Human extends ArrayList<Human> {
    private String name;
    private boolean sex;
    private int age;
    ArrayList<Human>child = new ArrayList<>();

    public Human(String name, boolean sex, int age) {
        this.name = name;
        this.sex = sex;
        this.age = age;
    }
    public Human(String name, boolean sex, int age, ArrayList<Human> child){
        this.name =name;
        this.sex = sex;
        this.age = age;
        this.child = child;
    }

    public Human(String name, boolean sex, int age, Human child, Human child1, Human child2) {
        this.name = name;
        this.sex = sex;
        this.age = age;
        this.child = child;
    }
}
