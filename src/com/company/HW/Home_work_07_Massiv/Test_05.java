package com.company.HW.Home_work_07_Massiv;
// Создать массив и заполнить его на 5 чисел используя быструю (статическую) инициализацию.
// Посчитать сумму элементов массива и вывести её на экран.
public class Test_05
{
    public static void main(String[] args) {
        int[]i = {1,2,3,4,5};
        for (int j = 0; j <i.length ; j++) {
            System.out.println(i[j] + " ");
        }
        int total = 0;
        for (int j = 0; j < i.length; j++) {
            total += i[j];
        }
        System.out.println(total);
    }
}
