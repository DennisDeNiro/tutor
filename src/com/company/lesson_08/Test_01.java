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
        Human fatherhuman = new Human("Vasya",false,78);
        Human motherhuman = new Human("Olya",false,77);

        Human fatherhuman1 = new Human("Oleg",false,77);
        Human motherhuman1 = new Human("Nastya",false,69);

        Human father = new Human("Taras",true,71);
        Human mother = new Human("Alla",true,70);

//        Human child = new Human("Danil",false,23,father,mother);
//        Human child1 = new Human("Danil",true,23,father,mother);

    }
}

class Human{
    private String name;
    private boolean sex;
    private int age;
    private String father;
    private String mother;


    public Human(String name, boolean sex, int age) {
        this.name = name;
        this.sex = sex;
        this.age = age;
    }

    public Human(String name, boolean sex, int age, String father, String mother) {
        this.name = name;
        this.sex = sex;
        this.age = age;
        this.father = father;
        this.mother = mother;
    }

    public String toString() {
        return null;
    }
}



