package com.company.HW.Home_work_05_FOR_EACH;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/*
        Ввести с клавиатуры имя и используя цикл for 10 раз вывести: [*имя* программист.]
        Пример текста:
        Света программист. // 10 раз
        */
public class Home_work_03 {
    public static void main(String[] args) throws IOException {
        BufferedReader name = new BufferedReader(new InputStreamReader(System.in));
        System.out.println("Введите Имя");
        String st = name.readLine();
        for (int i = 0; i < 10; i++) {
            System.out.println(st + " програмист");
        }
    }
}
//++