package com.company.lesson_18;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/*
Написать программу, которая вводит с клавиатуры строку текста.
Программа заменяет в тексте первые буквы всех слов на заглавные.
Вывести результат на экран.

Пример ввода:
  хочу     большую зарплату.

Пример вывода:
  Хочу     Большую Зарплату.
*/
public class Test_02 {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        String s = reader.readLine();

        char[] chars = s.toCharArray();
        chars[0] = Character.toUpperCase(chars[0]);

        System.out.println(chars);
    }
}
