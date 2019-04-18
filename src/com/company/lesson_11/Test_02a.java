package com.company.lesson_11;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/*
1. Создать массив на n чисел.
2. Ввести в него значения с клавиатуры.
3. Создать два массива на n/2 чисел каждый.
4. Скопировать большой массив в два маленьких: половину чисел в первый маленький, вторую половину во второй маленький.
5. Вывести второй маленький массив на экран, каждое значение выводить с новой строки.
*/
public class Test_02a {
    public static void main(String[] args) throws IOException {
        System.out.println("Задайте размер массива");
        BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(bf.readLine());
        int[] a = new int[n]; // 11
        for (int i = 0; i < a.length; i++) {
            a[i] = Integer.parseInt(bf.readLine()); // 10
        }

        for (int i = 0; i < a.length; i++) {
            System.out.println(a[i]);
        }
        int[] b = new int[n / 2];
        for (int i = 0; i < b.length; i++) {
            System.out.println(b[i]);
        }
        int[] c = new int[n / 2];
        for (int i = 0; i < c.length; i++) {
            System.out.println(c[i]);
        }
    }
}
