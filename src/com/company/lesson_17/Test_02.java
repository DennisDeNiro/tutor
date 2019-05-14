package com.company.lesson_17;


import jdk.nashorn.internal.ir.CatchNode;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.StringReader;

/*
Задача:  Программа вводит с клавиатуры данные про котов и выводит их на экран.
Создать класс Cat с параметрами name, age, weight, tail;
Переопределить метод toString() в классе Cat, что бы он выводил информацию про кота в виде:
"Cat name is " + name + ", age is " + age + ", weight is " + weight + ", tail = " + tailLength;
Вводить параметри с клавиатуры и создавать объект с введенными параметрами.
Ввод продолжается, пока переменная с именем не пуста.
Добавлять каждый объект в список, в конце вывести содержимое списка на экран.
 Пример:
Cat name is Barsik, age is 6, weight is 5, tail = 22
Cat name is Murka, age is 8, weight is 7, tail = 20
*/
public class Test_02 {
    public static void main(String[] args) throws IOException {
        Cat cat = new Cat(cat.name,);
        BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
        String name = bf.readLine();
        name = cat.name;
        int age = Integer.parseInt(bf.readLine());
        age = cat.age;
        int weight = Integer.parseInt(bf.readLine());
        weight = cat.weight;
        int tail = Integer.parseInt(bf.readLine());
        tail = cat.tail;
        System.out.println(cat.toString());
    }
}


class Cat {
    public String name;
    public int age;
    public int weight;
    public int tail;

    public Cat(String name, int age, int weight, int tail) {
        this.name = name;
        this.age = age;
        this.weight = weight;
        this.tail = tail;
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

    public int getWeight() {
        return weight;
    }

    public void setWeight(int weight) {
        this.weight = weight;
    }

    public int getTail() {
        return tail;
    }

    public void setTail(int tail) {
        this.tail = tail;
    }

    @Override
    public String toString() {
        return "Cat{" +
                "Cat name is='" + name + '\'' +
                ", age is=" + age +
                ", weight is=" + weight +
                ", tail=" + tail +
                '}';
    }
}


