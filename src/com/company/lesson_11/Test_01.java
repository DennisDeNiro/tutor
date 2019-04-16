package com.company.lesson_11;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/*
1. Создать массив на 5 чисел.
2. Ввести с клавиатуры 5 чисел и записать их в массив.
3. Расположить элементы массива в обратном порядке.
4. Вывести результат на экран, каждое значение выводить с новой строки.
*/
public class Test_01 {
    public static void main(String[] args) throws IOException {

        BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
        int[] a = new int[5];
//        int number = Integer.parseInt(st);
        for (int i = 0; i < a.length; i++) {  //i =0; i<=5; 0 = 0+1
            a[i] = Integer.parseInt(bf.readLine());
        }
        for (int i =a.length-1; i>=0; i--) {// i=5; i<=5; 5= 5-1;

            System.out.println(a[i]);
        }
    }
}
