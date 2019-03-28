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
public class Test_05a
{
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        System.out.println("Введите буквы");
        String name = br.readLine();
        System.out.println("Введите число");
        String st = br.readLine();
        int number = Integer.parseInt(st);
        int a = 0;
        while (a < number)
        {
            System.out.println(name);
           a++;
        }
    }
}
