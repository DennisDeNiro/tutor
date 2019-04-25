package com.company.lesson_13;

import java.util.Arrays;

/**
 * Missing number
 * You are given a array of n-1 integers and these integers are in the range of 0 to n.
 * There are no duplicates in array. One of the integers is missing in the array. Write an efficient code to find the missing integer.
 * Example:
 * I/P    [0, 1, 2, 4, ,6, 3, 7, 8]
 * O/P    5
 */
public class Test_01 {
    public static void main(String[] args) {
        int[] x = new int[]{0, 1, 2, 4, 6, 3, 7, 8};

        sort(x);
        for (int i : x) {
            System.out.println(i);
        }
        inNumber(x);
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
                if (x[i] > x[i + 1]) {
                    isSorted = false;
                    a = x[i];
                    x[i] = x[i + 1];
                    x[i + 1] = a;
                }

            }
        }
        System.out.println(Arrays.toString(x));
    }


    public static void inNumber(int[] x) {
        int min = x[0];
        int first =x[1];
        for (int i = 0; i < x.length-1; i++) {
                if (min+1 == first){
                    System.out.println(x);
                }else if (min+1!=first){
                    System.out.println(x[i+1]);
                }
        }
    }
}

// отсортировать массиа чисел
//  если первый елемент равен второму елементу +1
//
