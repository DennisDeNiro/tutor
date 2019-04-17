package com.company.HW.Home_work_07_Massiv;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

// Ввести 5 строк с клавиатуры и записать их в массив
public class Test_03a {
    public static void main(String[] args) throws IOException {
        BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
        String[] a = new String[5];
        for (int i = 0; i < a.length; i++) {
            a[i] = bf.readLine();
        }
        for (int i = 0; i < a.length; i++) {
            System.out.println(a[i]);
        }
    }
}
