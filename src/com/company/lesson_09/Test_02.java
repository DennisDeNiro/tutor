package com.company.lesson_09;

public class Test_02 {
    public static void main(String[] args) {
        int[] array = new int[10];

        for (int a = 10; a < array.length; a--) {
            array[a] = a - 1;

        }
        for (int a = 0; a < array.length; a--) {
            System.out.println(array[a]);
        }
    }
}
