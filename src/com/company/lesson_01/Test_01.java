package com.company.lesson_01;

public class Test_01 {
    public static void main(String[] args) {
        User u1 = new User();
        User u2 = new User();
        System.out.println(u1.count);
        System.out.println(u2.count);
        System.out.println(u1.age);
        System.out.println(u2.age);
        u1.count = 50;
        u1.age = 40;
        System.out.println("-----------------------");
        System.out.println(u1.count);
        System.out.println(u2.count);
        System.out.println(u1.age);
        System.out.println(u2.age);
    }
}
