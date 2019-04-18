package com.company.lesson_12;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

import static java.util.Arrays.sort;

public class Test_02 {
    public static void main(String[] args) throws IOException {
        BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
        int[] a = new int[20];
        for (int i = 0; i < a.length; i++) {
            a[i] = Integer.parseInt(bf.readLine());
        }

        sort(a);

        for (int i : a) {
            System.out.println(i);
        }
    }

    public static void sort(int[] arr) {
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr.length-1-i; j++) {
                if (arr[j] > arr[j + 1]) {
                    int sort = arr[j+1];
                    arr[j+1] = arr[j];
                    arr[j] = sort;
                }
            }
        }
    }
}



