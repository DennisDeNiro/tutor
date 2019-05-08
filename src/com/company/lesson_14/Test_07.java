package com.company.lesson_14;
/*
1. Создай список строк.
2. Считай с клавиатуры 5 строк и добавь в список.
3. Используя цикл, найди самую короткую строку в списке.
4. Выведи найденную строку на экран.
5. Если таких строк несколько, выведи каждую с новой строки.
*/

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;

public class Test_07 {
    public static void main(String[] args) throws IOException {
        BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
        List<String> list = new ArrayList<>();
        for (int i = 0; i < 5; i++) {
            String s = bf.readLine();
            list.add(s);
        }

        int min = list.get(0).length();

        for (int i = 0; i < list.size(); i++) {
            if (list.get(i).length() < min) {
                min = list.get(i).length();
            }
        }
            for (int i = 0; i < list.size(); i++) {
                if (list.get(i).length() == min) {
                    System.out.println(list.get(i));
                }
            }
        }

}
