package com.company.lesson_18;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;

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
        char[] ch = s.toCharArray();
        ch[0] = Character.toUpperCase(ch[0]);
        for (int i = 0; i < ch.length-1; i++) {
            if (ch[i] == ' '){
                ch[i + 1]=Character.toUpperCase(ch[i + 1]);
            }
        }
        s = new String(ch);
        System.out.println(s);
    }
}

//public class Test_02a {
//    public static void main(String[] args) throws IOException {
//        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
//        String s = reader.readLine();
//
//        char[] chars = s.toCharArray();
//        chars[0] = Character.toUpperCase(chars[0]);
//
//        System.out.println(chars);
//    }
//}