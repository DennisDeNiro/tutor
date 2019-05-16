package com.company.HW.Home_work_09;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/*
Создать массив на 10 чисел. Заполнить его числами с клавиатуры. Вывести пять наибольших чисел.
*/
public class Test_01 {
    public static void main(String[] args) throws IOException {
        BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
        int[] x = new int[10];
        for (int i = 0; i < x.length; i++) {
            x[i] = Integer.parseInt(bf.readLine());
        }
        sort(x);
        System.out.println(x[0]);
        System.out.println(x[1]);
        System.out.println(x[2]);
        System.out.println(x[3]);
        System.out.println(x[4]);
    }

    public static int sort(int[] x) {
        int max = x[0];
        for (int i = 0; i < x.length; i++) {
            for (int j = 0; j < x.length; j++) {
                if (x[i] > x[j]) {
                    max = x[i];
                    x[i] = x[j];
                    x[j] = max;
                }
            }
        }
        return max;
    }
}
