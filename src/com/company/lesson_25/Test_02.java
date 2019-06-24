package com.company.lesson_25;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;

/*
Написать программу, которая вводит с клавиатуры строку текста.
Программа должна вывести на экран две строки:
1. первая строка содержит только гласные буквы
2. вторая - только согласные буквы и знаки препинания из введённой строки.
Буквы соединять пробелом, каждая строка должна заканчиваться пробелом.
public static char[] vowels = new char[]{'а', 'я', 'у', 'ю', 'и', 'ы', 'э', 'е', 'о', 'ё'};
Пример ввода:
Мама мыла раму.
Пример вывода:
а а ы а а у
М м м л р м .
*/
public class Test_02 {
    public static void main(String[] args) throws IOException {
        BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
        String name = bf.readLine();
        char[] tochar = name.toCharArray();

        ArrayList list = new ArrayList<>();
        ArrayList list2 = new ArrayList<Character>();

        for (int i = 0; i < tochar.length; i++) {
            if (isVovels(tochar[i]) == true) {
                list.add(tochar[i]);

            } else {
                if (tochar[i] == ' ') {

                } else {
                    list2.add(tochar[i]);
                }
            }
        }
        for (int i = 0; i < list.size(); i++) {
            System.out.print(list.get(i) + " ");
        }
        System.out.println();
        for (int i = 0; i < list2.size(); i++) {
            System.out.print(list2.get(i) + " ");
        }

    }

    public static char[] vowels = new char[]{'а', 'я', 'у', 'ю', 'и', 'ы', 'э', 'е', 'о', 'ё'};

    public static boolean isVovels(char c) {

        c = Character.toLowerCase(c);

        for (char d : vowels) {
            if (c == d) {
                return true;
            }
        }
        return false;
    }
}
