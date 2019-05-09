package com.company.lesson_14;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;

/* Создать список чисел и заполнить его с консоли следующим образом:
 чётные числа добавляють в конец списка, нечётные — в начало. */
// TODO: 08.05.2019  
public class Test_03 {
    public static void main(String[] args) throws IOException {
        BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
        List<Integer> list = new ArrayList<Integer>();
        while (true) {
            int x = Integer.parseInt(bf.readLine());
            for (int i = 0; i < list.size(); i++) {
                if (x==0){
                    list.add(x);
                }if (x%2==0){
                    list.add(0,x);
                }
            }
            System.out.println(list.get(x));
        }
    }
}
