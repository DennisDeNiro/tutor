package com.company.lesson_05;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/*
Ввести с клавиатуры строку и число N.
Вывести на экран строку N раз используя цикл while.
Пример ввода:
абв
2
Пример вывода:
абв
абв
*/
public class Test_05 {
    public static void main(String[] args) throws IOException {
        int a = input();
        System.out.println(input());

    }

    public static int input() throws IOException {
        BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
        String st = bf.readLine();
        int number = Integer.parseInt(st);
        return number;
    }

    public static String a(String N) {
        System.out.println(N);
        return N;
    }
}

