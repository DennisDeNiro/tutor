package com.company.lesson_09;
// Заполнение массива из 10 чисел, числами от 10 до 1

// [0] = 10
// ...
// [9] = 1
public class Test_02 {
    public static void main(String[] args) {
        int[] array = new int[10];

        for (int a = 0; a > array.length; a--) {
            array[a] = a - 1; // array[9] = 8;
        }

        for (int a = 0; a < array.length; a++) {
            System.out.println(array[a]);
        }
    }
}
