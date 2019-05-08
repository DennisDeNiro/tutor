package com.company.lesson_14;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;

/*
1. Создай список строк в методе main.
2. Добавь в него 10 строчек с клавиатуры, но только добавлять не в конец списка, а в начало.
3. Используя цикл выведи содержимое на экран, каждое значение с новой строки.
*/
public class Test_08 {
    public static void main(String[] args) throws IOException {
        BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
        List<String> list = new ArrayList<>();
        while (true) {
            list.add(0, bf.readLine());
            if (list.size() > 10) {
                break;
            }
        }
        for (int i = 0; i < list.size(); i++) {
            System.out.println(list.get(i));
        }
    }
}
