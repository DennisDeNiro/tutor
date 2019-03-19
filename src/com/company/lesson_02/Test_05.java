package com.company.lesson_02;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/*
    Ввести с клавиатуры два числа, вывести на экран минимальное из них.
*/
public class Test_05 {
    public static void main(String[] arg) throws IOException {
        BufferedReader buf = new BufferedReader(new InputStreamReader(System.in));

        System.out.println("Введите число1");
        String st = buf.readLine();
        int number = Integer.parseInt(st);

        System.out.println("Введите число2");
        String st2 = buf.readLine();
        int number2 = Integer.parseInt(st2);

        if (number2 > number) {
            System.out.println(number);
        } else {
            System.out.println(number2);
        }
    }
}
