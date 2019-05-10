package com.company.lesson_14;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/* Слияние списков.
 Создать первый список чисел и заполнить его используя Collections.addAll(list1, 1, 5, 6, 11, 3, 15, 7, 8);
 Создать второй список чисел и заполнить его используя Collections.addAll(list2, 1, 8, 6, 21, 53, 5, 67, 18);
 Создать третий список чисел и заполнить его значениями из первого и второго списков
*/
// TODO: 08.05.2019  
public class Test_04 {
    public static void main(String[] args) {
        List<Integer> list1 = new ArrayList<Integer>();
        Collections.addAll(list1, 1, 5, 6, 11, 3, 15, 7, 8);
        List<Integer> list2 = new ArrayList<Integer>();
        Collections.addAll(list2, 1, 8, 6, 21, 53, 5, 67, 18);
        List<Integer> list3 = new ArrayList<Integer>();
        list3.addAll(list1);
        list3.addAll(list2);
            System.out.println(list3);

    }
}
///List<Integer> newlist3 = ListUtils.union(list1,list2); работает только с String ????