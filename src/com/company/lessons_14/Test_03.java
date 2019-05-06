package com.company.lessons_14;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;

/* Создать список чисел и заполнить его с консоли следующим образом:
 чётные числа добавляють в конец списка, нечётные — в начало. */
public class Test_03 {
    public static void main(String[] args) throws IOException {
        BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
        ArrayList<Integer> list = new ArrayList<Integer>();
        while (true) {
            for (int i = 0; i < list.size(); i++) {
                String s =bf.readLine();
                if (i%2==0){
                    list.add(i);
                }if (i==0){
                    list.add(0,i);
                }
            }
        }
    }
}
