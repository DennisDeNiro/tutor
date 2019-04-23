package com.company.lesson_12;

import java.util.Arrays;

public class Test_04ArraySort {
    public static void main(String[] args) {
        int[] arr = new int[10];
        for (int i = 0; i < arr.length; i++) {
            arr[i] = (int)(Math.random() * 100);
            System.out.print(arr[i] + "  ");
        }
        System.out.print("\nSorted: \n");//Сортируем массив
        Arrays.sort(arr);//Выводим отсортированный массив на консоль.
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + "  ");
        }
    }
}

