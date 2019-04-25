package com.company.lesson_12;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;

public class Test_01a {
    public static void main(String[] args) throws IOException {
        BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
        int[] x = new int[5];
        for (int i = 0; i < x.length; i++) {
            x[i] = Integer.parseInt(bf.readLine());
        }

        sort(x);
        for (int i : x) {
            System.out.println(i);
        }
    }

    private static void sort(int[] x) {
        boolean isSorted = false;
        int a;
        while (!isSorted) {
            isSorted = true;
            for (int i = 0; i < x.length - 1; i++) {
                if (x[i] < x[i + 1]) {
                    isSorted = false;
                    a = x[i];
                    x[i] = x[i + 1];
                    x[i + 1] = a;
                }
            }
        }
        System.out.println(Arrays.toString(x));
    }
}
