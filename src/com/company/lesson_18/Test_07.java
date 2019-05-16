package com.company.lesson_18;

import java.util.Date;

// Посчитать сколько дней прошло с начала года. Используйте класс Date.
public class Test_07 {
    public static void main(String[] args) {
        Date date = new Date();
        date.getDay();
        long day = date.getMonth()*30;
        System.out.println(day);
    }
}
