package com.company.lesson_27_OOP;

/* Лошадь и пегас
Написать два класса: Horse (лошадь) и Pegas (пегас).
В классе Horse создать переменные name, flyable, runnable
Созать конструктор для всех переменных класса Horse
В классе Horse создать метод, который проверяет переменную flyable и выводит на экран следующее:
- если переменная true, My name is + this.name + , i can fly =)
- если переменная false, My name is + this.name + , i cant fly =(
Унаследовать пегаса от лошади.
В методе main создать два объекта: horse и pegas
Подумать, какие значения присваивать переменным определенного класса.
*/
public class Test_03 {
    public static void main(String[] args) {
        Horse horse = new Horse("Horse", false, false);
        Pegas pegas = new Pegas("Pegas", true, true);
        horse.fly();
        pegas.fly();
    }
}

class Horse {
    private String name;
    private boolean flyable;
    private boolean runnable;

    public Horse() {
    }

    public Horse(String name, boolean flyable, boolean runnable) {
        this.name = name;
        this.flyable = flyable;
        this.runnable = runnable;
    }

    public void fly() {
        if (flyable) {
            System.out.println(name + " I can fly " + flyable);
        } else {
            System.out.println(name + " I can't fly " + flyable);
        }
    }
}

class Pegas extends Horse {

    public Pegas() {
    }

    public Pegas(String name, boolean flyable, boolean runnable) {
        super(name, flyable, runnable);
    }

}