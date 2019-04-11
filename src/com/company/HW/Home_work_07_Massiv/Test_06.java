package com.company.HW.Home_work_07_Massiv;

import java.util.Arrays;

/*
 Создать массив и заполнить его на 5 чисел используя быструю (статическую) инициализацию.
 Найти минимальный элемент в массиве и вывести его в консоль.
*/
public class Test_06 {
    public static void main(String[] args) {
        int[] a = {23, 156, 53, 22, 40};
        int min = Arrays.stream(a).min().getAsInt();
        int max = Arrays.stream(a).max().getAsInt();
        System.out.println(min);
        System.out.println(max);
    }
}

//Experement