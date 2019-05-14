package com.company.lesson_17;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;

/*  Программа вводит строки, пока пользователь не введёт пустую строку (нажав enter).
Потом программа строит новый список. Если в строке чётное число букв, строка удваивается, если нечётное – утраивается.
Программа выводит содержимое нового списка на экран.
Пример ввода:
Кот
Коты
Я
Пример вывода:
Кот Кот Кот
Коты Коты
Я Я Я
*/
public class Test_01 {
    public static void main(String[] args) throws IOException {
        BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
        List<String> list = new ArrayList<>();
        List<String> list1 = new ArrayList<>();

        while (true) {
            String s = bf.readLine();
            if (s.isEmpty()) {
                break;
            }
            list.add(s);
        }

        for (int i = 0; i < list.size(); i++) {
            String s = list.get(i);
            if (s.length() % 2 == 0) {
                list1.add(s + " " + s);
            }
            if (s.length() % 2 != 0) {
                list1.add(s + " " + s + " " + s);
            }
        }

        for (String s : list1) {
            System.out.println(s);
        }
    }
}
