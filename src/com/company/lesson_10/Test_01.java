package com.company.lesson_10;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/*
1. В методе initializeArray():
1.1. Создайте массив на 10 чисел
1.2. Считайте с консоли 10 чисел и заполните ими массив
2. Метод max(int[] array) должен находить максимальное число из элементов массива
3. В выполняющем методе main выведите максимальное число в консоль
*/
public class Test_01 {
    public static void main(String[] args) {
        System.out.println(max(int[] array));
    }


    public static int[] initializeArray() throws IOException {
        int[] array = new int[10];
        BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
        int i;
        System.out.println("Введите числа");
        for (i = 0; i < array.length; i++) {
            array[i] = Integer.parseInt(bf.readLine());
            return array;
        }
    }

    public static void max(int[] array) {
        int max = array[0];
        if (array[0] > max) {
            max = array[0];
        }
    }
}


