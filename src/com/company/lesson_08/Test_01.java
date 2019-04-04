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
public class Test_01
{
    public static void main(String[] args) {
        GrandFather gd = new GrandFather("Vitya",false, 67);
        GrandFather gd1 = new GrandFather("Zina", false, 69);

        GrandMother gm = new GrandMother("Oksana",false,62);
        GrandMother gm1 = new GrandMother("Igor",false,67;

        HumanFather hf = new HumanFather("Vlad",true);
        HumanMother hm = new HumanMother();

        Children ch = new Children();
        Children ch1 = new Children();
        Children ch2 = new Children();
    }
}


class GrandFather{
    private String name;
    private boolean manhood;
    private int age;

    public GrandFather(String name, boolean manhood, int age) {
        this.name = name;
        this.manhood = manhood;
        this.age = age;
    }
}

class GrandMother{
    private String name;
    private boolean manhood;
    private int age;

    public GrandMother(String name, boolean manhood, int age) {
        this.name = name;
        this.manhood = manhood;
        this.age = age;
    }
}


class HumanFather{
    private String name;
    private boolean manhood;
    private int age;
    private Father human;
    private Mother human1;

    public HumanFather(String name, boolean manhood, int age, Father human, Mother human1) {
        this.name = name;
        this.manhood = manhood;
        this.age = age;
        this.human = human;
        this.human1 = human1;
    }
}

class HumanMother{
    private String name;
    private boolean manhood;
    private int age;
    private Father human;
    private Mother human1;

    public HumanMother(String name, boolean manhood, int age, Father human, Mother human1) {
        this.name = name;
        this.manhood = manhood;
        this.age = age;
        this.human = human;
        this.human1 = human1;
    }
}

class Children{
    private String name;
    private boolean manhood;
    private int age;
    private Father human;
    private Mother human1;

    public Children(String name, boolean manhood, int age, Father human, Mother human1) {
        this.name = name;
        this.manhood = manhood;
        this.age = age;
        this.human = human;
        this.human1 = human1;
    }
}