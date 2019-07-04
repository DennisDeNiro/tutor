package com.company.lesson_29;

/*
1. Создать интерфейс DBObject и создать в нем метод initializeIdAndName(long id, String name)
2. Создать класс User с параметрами long id, String name; Вынести реализацию метода initializeIdAndName в класс User.
3. initializeIdAndName в классе User должен возвращать тип User.
4. Переопределить метод toString() в классе User, что бы он возвращал следующее User has name %s, id = %d
5. Создать класс Matrix и создать в нем 2 объекта используя ранее созданые интерефейс и класс.
6. В методе main вывести на экран объекты.
*/
public class Test_03 {
    public static void main(String[] args) {
        System.out.println(Matrix.user);
        System.out.println(Matrix.user1);
    }
}

interface DBObject {
    DBObject initializeIdAndName(long id, String name);
}

class User implements DBObject {
    private long id;
    private String name;

    @Override
    public User initializeIdAndName(long id, String name) {
        this.id = id;
        this.name = name;
        return this;
    }

    @Override
    public String toString() {
        return String.format("User has name %s, id = %d", name, id);
    }
}

class Matrix {
    static User user = new User().initializeIdAndName(1, "Jack");
    static User user1 = new User().initializeIdAndName(2, "John");
}