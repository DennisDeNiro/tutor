package com.company.lesson_15;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Map;

/* Удвой слова
1. Введи с клавиатуры 5 слов в список строк.
2. Метод doubleValues должен удваивать слова по принципу a,b,c -> a,a,b,b,c,c.
3. Используя цикл for выведи результат на экран, каждое значение с новой строки.

Пример:
краб
лось
рак

Выходные данные:
краб краб
лось лось
рак рак
*/
// TODO: 14.05.2019  
public class Test_03 {
    public static void main(String[] args) throws IOException {
        for (String arg : doubleValues(EnterLetter())) {
            System.out.println(arg);
        }
    }

    private static ArrayList<String> EnterLetter() throws IOException {
        BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
        ArrayList<String> list = new ArrayList<String>();
        for (int i = 0; i < 3; i++) {
            String s = bf.readLine();
            list.add(s);
        }
        return list;
    }

    private static ArrayList<String> doubleValues(ArrayList<String> list) {
        for (int i = 0; i < list.size();) {
            list.add(i , list.get(i));
            i+=2;
        }
        return list;
    }
}

