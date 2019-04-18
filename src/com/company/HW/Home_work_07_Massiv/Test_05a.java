package com.company.HW.Home_work_07_Massiv;

// Создать массив и заполнить его на 5 чисел используя быструю (статическую) инициализацию.
// Посчитать сумму элементов массива и вывести её на экран.
public class Test_05a {
    public static void main(String[] args) {
        int[] a = {1, 3, 4, 5, 6};
        int sum = 0;
        for (int i = 0; i < a.length; i++) {
            sum = sum + a[i];
        }
        System.out.println(sum);
//        for (int i = 0; i < a.length; i++) {
//
//        }
    }
}
