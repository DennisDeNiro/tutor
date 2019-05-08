package com.company.lesson_14;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;

/*
1. Создай список строк.
2. Добавь в него 5 строчек с клавиатуры.
3. Удали последнюю строку и вставь её в начало. Повторить 13 раз.
4. Используя цикл выведи содержимое на экран, каждое значение с новой строки.
*/

//разобрться как работает код
public class Test_06 {
    public static void main(String[] args) throws IOException {
        BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
        List<String> list = new ArrayList<>();
        for (int i = 0; i < 5; i++) {
            String s = bf.readLine();
            list.add(s);
        }
        for (int i = 0; i < 13; i++) {
            list.add(0, list.remove(list.size() - 1));
        }
        for (int i = 0; i < 5; i++) {
            System.out.println(list.get(i));
        }
    }
}
