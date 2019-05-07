package com.company.lessons_14;

import java.util.ArrayList;
import java.util.List;

/*
1. Создай список строк в методе main.
2. Добавь в него 10 строчек с клавиатуры, но только добавлять не в конец списка, а в начало.
3. Используя цикл выведи содержимое на экран, каждое значение с новой строки.
*/
public class Test_08 {
    public static void main(String[] args) {
        List<String> list = new ArrayList<>();
        list.add("Vanya");
        list.add("Olya");
        list.add("Katya");
        list.add("Denis");
        list.add("Roman");
        list.add("Inna");
        list.add("Petya");
        list.add("Alla");
        list.add("Dennis");
        for (int i = 0; i < list.size(); i++) {
            System.out.println(list.get(i));
        }
    }
}
