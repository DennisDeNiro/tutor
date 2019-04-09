package com.company.lesson_08;

// a[5] - 4 byte
// array{0[]1[]2[]3[]4[]}

import java.util.ArrayList;
import java.util.List;

public class Test_02 {
    public static void main(String[] args) {
        int a = 5;
        int[] array = new int[10];
        array[0] = 4323;
        System.out.println(array[4]);
        System.out.println(array[0]);
        System.out.println("---------------------");
        array[array.length-1] = 4234;
        for (int i = 0; i < array.length; i++) {
            System.out.println(array[i]);
        }

    }
}
