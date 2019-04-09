package com.company.lesson_09;

/*
 Заполнение массива из 10 чисел, числами от 1 до 10
*/
public class Test_01 {
    public static void main(String[] args) {
        int a = 10;
        int[] array = new int[10];
        array[0] = 0;
        array[1] = 1;
        array[2] = 2;
        array[3] = 3;
        array[4] = 4;
        array[5] = 5;
        array[6] = 6;
        array[7] = 7;
        array[8] = 8;
        array[9] = 9;
        for (int i =0; i<array.length; i++){
            System.out.println(array[i]);
        }
    }
}
