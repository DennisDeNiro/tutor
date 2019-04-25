package com.company.HW.Home_work_08Massiv;

//Задача: Имеется массив, нужно переставить элементы массива в обратном порядке.
//
// int[] mice = new int[] { 4, 9, 3, 22, 5, 18, 25, 7, 11, 15, 5, 19 };
public class Test_06 {
    public static void main(String[] args) {
        int[] mice = new int[]{4, 9, 3, 22, 5, 18, 25, 7, 11, 15, 5, 19};
        int les = 0;
        for (int element : mice) ;
        les++;
        for (int i = mice.length-1; i >= 0; i--) {
            System.out.println(mice[i]);
        }
    }
}
