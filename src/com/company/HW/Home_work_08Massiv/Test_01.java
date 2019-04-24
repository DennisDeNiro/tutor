package com.company.HW.Home_work_08Massiv;

import java.util.Arrays;

//Имеется массив из четырёх чисел int[] numbers = {3, 9, 11, 15};. Поменяйте местами первый и второй элемент массива.
public class Test_01 {
    public static void main(String[] args) {
        int[] x = new int[]{3, 9, 11, 15};
        int first = x[0];
        int second = x[1];

        x[0] = second;
        x[1] = first;


        System.out.println(Arrays.toString(x));
    }
}
