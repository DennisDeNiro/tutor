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
        BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
        int[] a = new int[11]; // 11
        for (int i = 0; i < a.length; i++) {
            a[i] = Integer.parseInt(bf.readLine()); // 10
        }
        int[] b = new int[a.length/2];
        for (int i =0; i<b.length; i++){
            b[i] = a[i];
            System.out.println(b[i]);
        }
        int[] c = new int[a.length-b.length];
        for (int i = 0; i<c.length; i++){
            c[i] = a[i+c.length-1];
            System.out.println(c[i]);
        }
    }
}
