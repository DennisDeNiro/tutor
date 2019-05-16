package com.company.lesson_18;

import java.util.Date;

public class Test_03 {
    public static void main(String[] args) throws InterruptedException {
        Date date = new Date(); // 1970
        Thread.sleep(3000);
        Date date1 = new Date(); // 1970
        System.out.println(date);
        System.out.println(date1);

        long msDay = 24 * 60 * 60 * 1000;
        System.out.println(date.getTime() / msDay / 365);

        System.out.println(date.getMonth());
    }
}
