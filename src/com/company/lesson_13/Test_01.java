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
        int[] q = new int[]{5};
        int[] c = new int[x.length + q.length];
        for (int i = 0; i < c.length - 1; i++) {
            c[i] = x[i] + q[i];
            System.out.println(c[i]);
        }
    }
}
