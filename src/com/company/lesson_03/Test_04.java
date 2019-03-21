package com.company.lesson_03;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

//Реализовать метод checkInterval.
//Метод должен проверять попало ли целое число в интервал от 50 до 100 и сообщить
// результат на экран в следующем виде: "Число а не содержится в интервале." или
// "Число а содержится в интервале.", где а - аргумент метода.
public class Test_04 {
    public static void main(String[] args) throws IOException {
        int a = input();
        interval(a);
    }

    public static int input() throws IOException {
        BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
        String st = bf.readLine();
        return Integer.parseInt(st);
    }

    public static void interval(int a) {
        if (a >= 50 && a <= 100) {
            System.out.println("Число а содержиться в интервале");
        } else {
            System.out.println("Число а не содержиться в интервале");
        }
    }
}
