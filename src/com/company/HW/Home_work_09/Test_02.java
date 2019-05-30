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
        Human child = new Human("Ivan", true, 4);
        Human child1 = new Human("Maksim", true, 5);
        Human child2 = new Human("Anna", false, 5);
        ArrayList<Human> children = new ArrayList<>();
        children.add(child);
        children.add(child1);
        children.add(child2);
        Human father = new Human("Vasya", true, 45, children);
        Human mother = new Human("Alla", false, 37, children);
        ArrayList<Human> children2 = new ArrayList<>();
        children2.add(father);
        children2.add(mother);
        Human granfather = new Human("Vitya", true, 65, children2);
        Human granmother = new Human("Zina", false, 66, children2);
        Human granfather1 = new Human("Vitya", true, 65, children2);
        Human granmother1 = new Human("Zina", false, 66, children2);
        System.out.println(child.toString());
        System.out.println(child1.toString());
        System.out.println(child2.toString());
        System.out.println(father.toString());
        System.out.println(mother.toString());
        System.out.println(granfather.toString());
        System.out.println(granfather1.toString());
        System.out.println(granmother.toString());
        System.out.println(granmother1.toString());

    }
}

class Human extends ArrayList<Human> {
    private String name;
    private boolean sex;
    private int age;
    ArrayList<Human> child = new ArrayList<>();

    public Human(String name, boolean sex, int age) {
        this.name = name;
        this.sex = sex;
        this.age = age;
    }

    public Human(String name, boolean sex, int age, ArrayList<Human> child) {
        this.name = name;
        this.sex = sex;
        this.age = age;
        this.child = child;
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

    public ArrayList<Human> getChild() {
        return child;
    }

    public void setChild(ArrayList<Human> child) {
        this.child = child;
    }

    @Override
    public String toString() {
        String res = "";
        res += "Name : " + getName();
        res += ", Sex : " + (isSex() ? "мужской" : "женский");
        res += ", Age : " + getAge();

        int childcount = this.child.size();
        if (childcount > 0)
        {
            res += ", Child : " + this.child.get(0).name;

            for (int i = 0; i < childcount; i++)
            {
                Human child = this.child.get(i);
                res += ", " + child.name;
            }
        }
        return res;
    }
}


