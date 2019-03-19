package com.company.HW.Home_work_02;

/*
    Ввести с клавиатуры три числа, вывести на экран максимальное из них.
*/

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Home_work_03 {
    public static void main(String[] args) throws IOException {
        BufferedReader buf = new BufferedReader(new InputStreamReader(System.in));

        System.out.println("Первое число");
        String st = buf.readLine();
        int number = Integer.parseInt(st);

        System.out.println("Второе число");
        String st2 = buf.readLine();
        int number2 = Integer.parseInt(st2);

        System.out.println("Третье число");
        String st3 = buf.readLine();
        int number3 = Integer.parseInt(st3);

        if (number > number2 && number > number3) {
            System.out.println(number);
        } else if (number2 > number && number2 > number3) {
            System.out.println(number2);
        } else if (number3 > number2 && number3 > number) {            //number3 > number && number3 < number
            System.out.println(number3);
        }
    }
}
// этот код работает при двух условиях