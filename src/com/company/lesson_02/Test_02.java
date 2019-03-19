package com.company.lesson_02;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.sql.SQLOutput;

public class Test_02 {
    public static void main(String[] args) throws IOException {
        BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));

        String st = bf.readLine();

        System.out.print("введите число");
        String st2 = bf.readLine();
        int number = Integer.parseInt(st2);

        System.out.print("ваше число");
        int number2 = Integer.parseInt(bf.readLine());


        System.out.println(st);
        System.out.println(number + 30);
        System.out.println(number2 - number);

    }
}
