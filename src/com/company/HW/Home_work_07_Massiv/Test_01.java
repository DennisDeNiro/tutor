package com.company.HW.Home_work_07_Massiv;

// Заполнение массива из 10 чисел, числами от 10 до 19
public class Test_01 {
    public static void main(String[] args) {


        int[] array = new int[10];                //массив из 10 елементов

        for (int i = 0; i < array.length; i++) {// i =19; 19>10; 19=19-1;
            array[i] = 10+i;
        }
        for (int i = 0; i < array.length; i++) {
            System.out.println(array[i]);
        }
    }
}