package com.company.lesson_14;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;

/*
1. Создай список строк.
2. Считай с клавиатуры 5 строк и добавь в список.
3. Используя цикл, найди самую длинную строку в списке.
4. Выведи найденную строку на экран. Если таких строк несколько, выведи каждую с новой строки.
*/
public class Test_05 {
    public static void main(String[] args) throws IOException {
        BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
        ArrayList<String> list = new ArrayList<String>();
        for (int i = 0; i < 5; i++) {
            String s = bf.readLine();
            list.add(s);
        }
        int max = list.get(0).length();

        for (int i = 0; i < list.size(); i++) {
            if (list.get(i).length() > max) {
                max = list.get(i).length();
            }

             if (list.get(i).length() == max) {
                System.out.println(list.get(i));
            }
        }
    }
}
