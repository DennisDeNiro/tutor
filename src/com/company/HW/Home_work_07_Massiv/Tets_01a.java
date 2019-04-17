package com.company.HW.Home_work_07_Massiv;

// Заполнение массива из 10 чисел, числами от 10 до 19
public class Tets_01a {
    public static void main(String[] args) {
        int[] a = new int[10];
        for (int i = 0; i < a.length; i++) {  //i=0, i<=10, i=0+1;
            a[i] = 10 + i;
        }
        for (int i = 0; i < a.length; i++) {
            System.out.println(a[i]);
        }
    }
}
