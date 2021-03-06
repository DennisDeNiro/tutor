package com.company.lesson_32;

import com.sun.scenario.effect.impl.sw.sse.SSEBlend_SRC_OUTPeer;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/*
1. Создать классы CatFactory, Cat, MaleCat, FemaleCat
2. В классе Cat создать переменную name, сделать её приватной.
3. Реализовать метод toString() в классе Cat, он должен возвращать строку типа "Я уличный кот " + *Имя кота*;
4. Унаследовать MaleCat и FemaleCat от Cat.
5. В классах MaleCat, FemaleCat переопределить конструктор супер класса, а также реализовать метод toString():
- В классе MaleCat метод toString() должен вренуть строку типа "Я - солидный кошак по имени " + Имя кота
- В классе FemaleCat метод toString() должен вренуть строку типа "Я - милая кошечка по имени " + Имя кота
6. В классе CatFactory создать метод getCatByKey(String type),
 который в зависимости от типа кота должен вернуть объект с определенным типом кота.
 - cur - уличный кот (toString() Cat)
 - male - солидный кошак (toString() Male)
 - female - милая кошечка (toString() Female)
7. В выполняющем методе считывать имя кота с консоли, пока пользователь не введет пустую строку(Enter).
8. Если у кота есть имя, ввести тип кота.
Для каждого параметра:
9. Создать объект cat класса Cat, который равен коту из getCatByKey(String тип).
10. Вывести на экран cat.toString().
*/
public class Test_01 {

    public static void main(String[] args) throws IOException {
        BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
        while (true) {
            String name = bf.readLine();
            if (name.equals("")) {
                break;
            }
            Cat cat = CatFactory.getCatByKey(name);
            System.out.println(cat.toString());
        }
    }
}

class CatFactory {
    static Cat getCatByKey(String type) {
        Cat cat = null;
        if (type.equals("cur")) {
            cat = new Cat("Dysia");
        } else if (type.equals("male")) {
            cat = new MaleCat("Murka");
        } else if (type.equals("female")) {
            cat = new FemaleCat("Linza");
        } else {
            cat = new Cat(type);
        }
        return cat;
    }
}

class Cat {
    private String name;

    public Cat(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return "Я уличный кот " + getName();
    }
}

class MaleCat extends Cat {

    public MaleCat(String name) {
        super(name);
    }

    @Override
    public String toString() {
        return "Я - солидный кошак по имени " + this.getName();
    }
}

class FemaleCat extends Cat {

    public FemaleCat(String name) {
        super(name);
    }

    @Override
    public String toString() {
        return "Я - милая кошечка по имени " + this.getName();
    }
}