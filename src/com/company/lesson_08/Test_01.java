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
        Human Father = new Human("Vasya",false,78);
        Human Mother = new Human("Olya",false,77);

        Human Father1 = new Human("Taras",false,71);
        Human Mother1 = new Human("Alla",false,70);

        Human human = new Human("Dennis",true,34,Father,Mother);
        Human wife = new Human("Anna",true,31,Father1,Mother1);

        Human children = new Human("Danil",true,13,human,wife);
        Human children1 = new Human("Nikita",true,11,human,wife);
        Human children2 = new Human("Anton",true,14,human,wife);

    }
}







class Human{
    private String name;
    private boolean manhood;
    private int age;
    private String Father_human;
    private String Mother_human1;

    public Human(String name, boolean manhood, int age) {
        this.name = name;
        this.manhood = manhood;
        this.age = age;
    }

    public Human(String name, boolean manhood, int age, String father_human, String mother_human1) {
        this.name = name;
        this.manhood = manhood;
        this.age = age;
        Father_human = father_human;
        Mother_human1 = mother_human1;
    }


    public String toString() {
        return System.out.print();
    }
}



