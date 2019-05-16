package com.company.lesson_18;

import java.util.Date;

// Проверить наступило ли уже некоторое время

public class Test_06 {
    public static void main(String[] args) throws InterruptedException {
        Date startDate = new Date();

        long endTime = startDate.getTime() + 5000;
        Date endDate = new Date(endTime);

        Thread.sleep(6000); // game

        Date currentTime = new Date();

        if(currentTime.after(endDate)){
            System.out.println("Looser!");
        } else {
            System.out.println("You win!");
        }

    }
}
