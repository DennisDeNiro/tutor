package com.company.lesson_13;

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
        int q = x[0];
        for (int i = 0; i <= x.length; i++) {
            if(x[i] < x[i] + 1);
            x[i] =i;
            System.out.println(x[i]);
        }
    }
}

// отсортировать массиа чисел
//  если первый елемент равен второму елементу +1
//
