package com.company.lesson_08;

/*
Создай класс Human с полями имя(String), пол(boolean),возраст(int), отец(Human), мать(Human).
 Создай объекты и заполни их так, чтобы получилось: Два дедушки, две бабушки, отец, мать, трое детей. Вывести объекты на экран.
Примечание:
Если написать свой метод String toString() в классе Human, то именно он будет использоваться при выводе объекта на экран.
Пример вывода:
Имя: Аня, пол: женский, возраст: 21, отец: Павел, мать: Катя
Имя: Катя, пол: женский, возраст: 55
Имя: Игорь, пол: мужской, возраст: 2, отец: Михаил, мать: Аня
…
*/

//1. Определить правильное написание Human father(что решает правильность заполнения обьектов)
//        2.метод toString через if

public class Test_01 {
    public static void main(String[] args) {
        Human fatherhuman = new Human("Vasya", true, 78);
        Human motherhuman = new Human("Olya", false, 75);

        Human fatherhuman1 = new Human("Oleg", true, 77);
        Human motherhuman1 = new Human("Nastya", false, 69);

        Human father = new Human("Taras", true, 71, fatherhuman, motherhuman);
        Human mother = new Human("Alla", false, 70, fatherhuman1, motherhuman1);

        Human child = new Human("Danil", true, 18, father, mother);
        Human child1 = new Human("Bogdan", true, 21, father, mother);
        Human child2 = new Human("Anna", false, 23, father, mother);


        System.out.println(fatherhuman);
        System.out.println(fatherhuman1);
        System.out.println(motherhuman);
        System.out.println(motherhuman1);
        System.out.println(father);
        System.out.println(mother);
        System.out.println(child);
        System.out.println(child1);
        System.out.println(child2);

    }
}

class Human {
    private String name;
    private boolean sex;
    private int age;
    Human father;
    Human mother;

    public Human(String name, boolean sex, int age) {
        this.name = name;
        this.sex = sex;
        this.age = age;
    }

    public Human(String name, boolean sex, int age, Human father, Human mother) {
        this.name = name;
        this.sex = sex;
        this.age = age;
        this.father = father;
        this.mother = mother;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public boolean isSex() {
        return sex;
    }

    public void setSex(boolean sex) {
        this.sex = sex;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public Human getFather() {
        return father;
    }

    public void setFather(Human father) {
        this.father = father;
    }

    public Human getMother() {
        return mother;
    }

    public void setMother(Human mother) {
        this.mother = mother;
    }

    public String toString() {
        String res = "";
        res += "Name: " + getName();
        res += ", age: " + getAge();
        res += ", пол: " + (this.sex ? "мужской" : "женский");

        if (this.father != null) {
            res += ", отец: " + this.father.name;
        }
        if (this.mother != null)
            res += ", мать: " + this.mother.name;

        return res;
    }
}



