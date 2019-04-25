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
        int[] x = new int[]{0, 1, 2, 4, 6, 3, 7, 8, 5};

//        sort(x);
//        for (int i : x) {
//            System.out.println(i);
//        }
//        inNumber(x);
//        for (int i : x) {
//            System.out.println(i);
//        }

        System.out.println(missingNumber1(x));
        System.out.println(missingNumber2(x));
        System.out.println(missingNumber3(x));
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

    public static void inNumber(int[] x) { // 0 1 3
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

    private static int missingNumber1(int[] arr){ // O(n^2)
        if(arr.length == 0){
            return 0;
        }

        Arrays.sort(arr);
        for (int i = 0; i < arr.length - 1; i++) {
            if(arr[i] != arr[i+1]-1){
                return arr[i+1]-1;
            }
        }

        if(arr[0] != 0) {
            return 0;
        } else {
            return arr.length;
        }
    }

    private static int missingNumber2(int[] arr){ // O(n)
        if(arr.length == 0){
            return 0;
        }

        boolean[] bools = new boolean[arr.length];
        for (int i : arr) {
            if(i >= 0 && i < bools.length){
                bools[i] = true;
            }
        }

        int i = 0;
        for (i = 0; i < bools.length; i++) {
            if(!bools[i]) return i;
        }
        return i;
    }

    private static int missingNumber3(int[] arr){ // O(n)
        if(arr.length == 0){
            return 0;
        }

        int n = arr.length;
        int sum = ((n+1)*n)/2;
        for (int number : arr) {
            sum -= number;
        }
        return sum;
    }
}

// отсортировать массиа чисел
//  если первый елемент равен второму елементу +1
//
