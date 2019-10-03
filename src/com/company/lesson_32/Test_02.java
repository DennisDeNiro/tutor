package com.company.lesson_32;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;

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
8L
10
*/

public class Test_02 {
    public static void main(String[] args) throws IOException {
        BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
        BufferedReader b = new BufferedReader(new FileReader(bf.readLine()));
        List<Integer> list = new ArrayList<>();

        while (true) {
            String text = b.readLine();
            if (text == null) {
                break;
            }
            int number = Integer.parseInt(text);
            if (number % 2 == 0) {
                list.add(number);
            }
        }
        sort(list);

        for (int i : list) {
            System.out.println(i);
        }
    }

    private static void sort(List<Integer> list) {
        int[] array = new int[list.size()];
        for (int i = 0; i < list.size(); i++) array[i] = list.get(i);
            
        for (int i = 0; i < array.length - 1; i++) {
            for (int k = 0; k < array.length - i - 1; k++) {
                if (array[k] > array[k + 1]) {
                    int tmp = array[k];
                    array[k] = array[k + 1];
                    array[k + 1] = tmp;
                }
            }
        }
    }
}

