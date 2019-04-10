package com.company.HW.Home_work_07_Massiv;

// Заполнение массива из 10 чисел, числами от 29 до 20
public class Test_02 {
    public static void main(String[] args) {
        int[] array = new int[10];

        for (int i = 0; i < array.length; i++) { //i = 9; 9<10; 9=9-1
            array[i] = 29-i;
        }

        for (int i = 0; i < array.length; i++){
            System.out.println(array[i]);
        }
    }
}
