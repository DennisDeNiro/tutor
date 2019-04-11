package com.company.HW.Home_work_07_Massiv;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

// Ввести 5 чисел с клавиатуры и записать их в массив
// Вывести содержимое массива в консоль
public class Test_04 {
    public static void main(String[] args) throws IOException {
        BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
//        String st = bf.readLine();
//        int n = Integer.parseInt(st);
        int[] a = new int[5];
        for (int i = 0; i < a.length; i++) {
            a[i] = Integer.parseInt(bf.readLine());
        }
        for (int i = 0; i<a.length; i++){
            System.out.println(a[i]);
        }
    }
}
