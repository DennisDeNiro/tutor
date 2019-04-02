package com.company.lesson_07;
/*
Создать класс Cat с параметрами: name, age, power
Реализовать метод boolean fight(Cat anotherCat):
реализовать механизм драки котов в зависимости от силы.
Метод должен определять, выиграли ли мы (this) бой или нет,
т.е. возвращать true, если выиграли и false - если нет.
Должно выполняться условие:
если cat1.fight(cat2) = true , то cat2.fight(cat1) = false
*/
public class Test_02
{
    public static void main(String[] args) {
        Cat cat1 = new Cat("Aim",2,22);
        Cat cat2 = new Cat("Tim",2,30);
        System.out.println(cat1.setFight(cat2)+ "\n" + "Tim победил Aim");
        System.out.println(cat2.setFight(cat1)+ "\n" + "Aim проиграл Tim");
    }

}

class Cat{
    private String name;
    private int age;
    private int power;
    private int fight;


    public Cat(String name, int age, int power) {
        this.name = name;
        this.age = age;
        this.power = power;
    }


    public boolean setFight(Cat anotherCat) {
        if (anotherCat.power>this.getPower()){
            return true;
        }else {
            return false;
        }

    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public int getPower() {
        return power;
    }

    public void setPower(int power) {
        this.power = power;
    }

    public boolean isFight() {
        return isFight();
    }


}

