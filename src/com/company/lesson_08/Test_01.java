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
        Human Father = new Human();
        Human Mother = new Human();

        Human Father1 = new Human();
        Human Mother1 = new Human();

        Human human = new Human();
        Human wife = new Human();

        Human children = new Human();
        Human children1 = new Human();
        Human children2 = new Human();

    }
}







class Human{
    private String name;
    private boolean manhood;
    private int age;
    private Father human;
    private Mother human1;

    public Human(String name, boolean manhood, int age) {
        this.name = name;
        this.manhood = manhood;
        this.age = age;
    }

    public Human(String name, boolean manhood, int age, Father human, Mother human1) {
        this.name = name;
        this.manhood = manhood;
        this.age = age;
        this.human = human;
        this.human1 = human1;
    }
}



