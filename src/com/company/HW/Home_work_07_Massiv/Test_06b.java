package com.company.HW.Home_work_07_Massiv;

/*
 Создать массив и заполнить его на 5 чисел используя быструю (статическую) инициализацию.
 Найти минимальный элемент в массиве и вывести его в консоль.
*/
public class Test_06b {
    public static void main(String[] args) {
        int[] a = {2, 3, 5, 1, 12};
        int min = a[0];
        for (int i = 0; i < a.length; i++) {
            if (a[i] < min) {
                min = a[i];
            }
        }
        System.out.println(min);
    }
}
