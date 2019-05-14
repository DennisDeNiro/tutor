package com.company.lesson_17;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;

/* Вводить с клавиатуры строки, пока пользователь не введёт строку 'end'
Создать список строк.
Ввести строки с клавиатуры и добавить их в список.
Вводить с клавиатуры строки, пока пользователь не введёт строку "end".  "end" не учитывать.
Вывести строки на экран, каждую с новой строки.
*/
public class Test_03 {
    public static void main(String[] args) throws IOException {
        BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
        List<String> list = new ArrayList<>();

        while (true) {
            String s = bf.readLine();
            list.add(s);
            for (int i = 0; i < list.size(); i++) {
                if (list.get(i).contains("end")) {
                    list.remove(list.get(i));
                    break;
                }
            }
        }


    }
}
