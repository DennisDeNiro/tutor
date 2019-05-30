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
//задача готова
public class Test_02 {
    public static void main(String[] args) {
        Human son = new Human("Ivan", true, 4);
        Human son1 = new Human("Maksim", true, 5);
        Human girl = new Human("Anna", false, 5);
        ArrayList<Human> child = new ArrayList<>();
        child.add(son);
        child.add(son1);
        child.add(girl);
        Human father = new Human("Vasya", true, 45, child);
        Human mother = new Human("Alla", false, 37, child);
        ArrayList<Human> child1 = new ArrayList<>();
        child1.add(father);
        child1.add(mother);
        Human granfather = new Human("Vitya", true, 65, child1);
        Human granmother = new Human("Zina", false, 66, child1);
        Human granfather1 = new Human("Vitya", true, 65, child1);
        Human granmother1 = new Human("Zina", false, 66, child1);
        System.out.println(son.toString());
        System.out.println(son1.toString());
        System.out.println(girl.toString());
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
        res += "Имя : " + getName();
        res += ", пол : " + (isSex() ? "мужской" : "женский");
        res += ", возраст : " + getAge();

        int childcount = this.child.size();
        if (childcount > 0)
        {
            res += ", дети : " + this.child.get(0).name;

            for (int i = 1; i < childcount; i++)
            {
                Human child = this.child.get(i);
                res += ", " + child.name;
            }
        }
        return res;
    }
}


