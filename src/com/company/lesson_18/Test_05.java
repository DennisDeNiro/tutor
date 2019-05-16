package com.company.lesson_18;

import java.util.Date;

// Вычислить разницу между двумя датами
public class Test_05 {
    public static void main(String[] args) throws InterruptedException {
        Date date = new Date();
        Thread.sleep(6000);
        Date date1 = new Date();
        System.out.println(date);
        System.out.println(date1);
        System.out.println(date1.getTime()-date.getTime());
    }
}
