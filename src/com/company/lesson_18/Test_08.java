package com.company.lesson_18;

import java.util.Date;

// Посчитать сколько прошло времени с начала сегодняшнего дня. Используйте класс Date.
public class Test_08 {
    public static void main(String[] args) {
        Date date = new Date();
        int second = date.getSeconds();
        int minute = date.getMinutes();
        int hours = date.getHours();
        System.out.println("Времени прошло : " + hours + " " + minute + " " + second);
    }
}
