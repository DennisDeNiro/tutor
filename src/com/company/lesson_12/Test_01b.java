package com.company.lesson_12;

import java.util.Arrays;

public class Test_01b {
    public static void main(String[] args) {
        int[] a = new int[]{2, 4, 6, 1, 9, 65, 3, 2};
        for (int num : a) {
            System.out.print(num + " ");
        }

        int count;
        do {
            count = 0;
            for (int i = 0; i < a.length - 1; i++) {
                if (a[i] < a[i + 1]) {
                    int temp = a[i];
                    a[i] = a[i + 1];
                    a[i + 1] = temp;
                    count++;
                }
            }
        } while (count > 0);
        System.out.println();
        for (int num : a) {
            System.out.print(num + " ");
        }
    }
}
