package com.company.lesson_32;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.ListIterator;

/* Сортировка четных чисел из файла
1. Ввести имя файла с консоли.
2. Прочитать из него набор чисел.
3. Вывести на консоль только четные, отсортированные по возрастанию.
Пример ввода:
5
8
11
3
2
10
Пример вывода:
2
8
10
*/
// TODO: 15.08.2019
public class Test_02 {
    public static void main(String[] args) throws IOException {
        ArrayList<Integer> list1 = sortNumber(takeNumber());


        System.out.println(evenNumber(list1));
    }

    private static ArrayList<Integer> takeNumber() throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        ArrayList<Integer> list = new ArrayList<>();
        for (int i = 0; i < 6; i++) {
            int number = Integer.parseInt(reader.readLine());
            list.add(number);
        }
        return list;
    }

    private static ArrayList<Integer> sortNumber(ArrayList<Integer> list) {
        Collections.sort(list);
        return list;
    }

    private static ArrayList<Integer> evenNumber(ArrayList<Integer> list1) {
        for (int i = 0; i < list1.size(); i++) {
            if (i % 2 == 0) {
                list1.add(i);
            } else {
                list1.remove(i);
            }
        }
        return list1;
    }
}
