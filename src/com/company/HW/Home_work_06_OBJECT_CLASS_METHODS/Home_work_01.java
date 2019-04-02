package com.company.HW.Home_work_06_OBJECT_CLASS_METHODS;

/* 1) Создать класс Dog с параметрами: name, age, tailLength. Подумай, какого типа должна быть каждая переменная.
 2) В выполняющем методе создать два объекта класса Dog и инициализировать их поля
 3) Вывести в консоль данные о каждой собаке в виде - "Name: [dog.name], age: [dog.age], tail length: [dog.tailLength]." */
public class Home_work_01 {
    public static void main(String[] args) {
        Dog dog1 = new Dog("Rokki", 2, 68);                //2)создать два обьекта и (инициализировать из поля?)
        Dog dog2 = new Dog("Ketti", 7, 38);
        System.out.println("\033[35m Первая собака");
        System.out.format("Name: = %s, age: %d, tail length: %d", dog1.getName(), dog1.getAge(), dog1.getTailLenght());
        System.out.println("\n" + "Вторая собака");
        System.out.format("Name: = %s, age: %d, tail length: %d", dog2.getName(), dog2.getAge(), dog2.getTailLenght());
//        System.out.println("Name:"+ [dog.name], age: [dog.age], tail length: [dog.tailLength]);
    }
}

class Dog {
    private String name;        //1) создать клас Dog с параметрами
    private int age;
    private int tailLenght;

    public Dog(String name, int age, int tailLenght) {
        this.name = name;
        this.age = age;
        this.tailLenght = tailLenght;
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

    public int getTailLenght() {
        return tailLenght;
    }

    public void setTailLenght() {
        this.tailLenght = tailLenght;
    }
}

