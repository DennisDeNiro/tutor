package com.company.lessons_14;
// Создать список из целых чисел и заполнить его с консоли
// Ввод целых чисел с клавиатуры продолжается, пока не ввели пустую строку в консоли

import com.sun.istack.internal.FinalArrayList;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Test_02 {


    public static void main(String[] args) throws IOException {
        List<Integer> list = new ArrayList<>();
        BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
        list = Collections.singletonList(Integer.parseInt(bf.readLine()));
        int num = 0;
        int count;
        do {
            count = 0;
            for (int i = 0; i < list.size(); i++) {
                if (num > 0) ;
                count++;
            }
            while (num < 0) ;
            System.out.println(list);
            for (i:list) {
                System.out.print(num + " ");
            }
        }
//        while (true) {
//            for (int i = 0; i < list.size(); i++) {
//                if (num > 0) {
//                    count++;
//                }
//                System.out.println(list.get(i));
//                if (num < 0) {
//                    break;
//                }
//            }
//        }
    }

}

