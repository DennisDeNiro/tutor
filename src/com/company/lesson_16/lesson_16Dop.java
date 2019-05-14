package com.company.lesson_16;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/* Вывести числа в обратном порядке
Ввести с клавиатуры 10 чисел и заполнить ими список.
Вывести их в обратном порядке.
Использовать только цикл for.
*/
public class lesson_16Dop {
    public static void main(String[] args) throws IOException {
        BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
        int[] x = new int[10];
        for (int i = 0; i < x.length; i++) {
            x[i] = Integer.parseInt(bf.readLine());
        }
        for (int i = x.length-1; i>=0; i--){
            System.out.println(x[i]);
        }
    }
}