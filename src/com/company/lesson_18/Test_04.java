package com.company.lesson_18;

import java.util.Date;

/* Получение текущей даты
Посчитать сколько лет прошло с 1970 года */
public class Test_04 {
    public static void main(String[] args) {
        Date date = new Date();
        System.out.println(date);
        System.out.println(date.getYear());
        System.out.println(date.getYear()-70);
    }
}
