package com.company.lesson_12;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

import static com.company.lesson_12.Test_02.sort;

public class Test_03 {
    public static void main(String[] args) throws IOException {
        BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
        int[] a = new int[5];
        for (int i = 0; i < a.length; i++) {
            a[i] = Integer.parseInt(bf.readLine());
        }

        sort(a);

        for (int i : a) {
            System.out.println(i);
        }
    }


    public static void sort(int[] array) {
        for (int i = 0; i< array.length; i++){
            for(int j = 0; j<array.length-1; j++){
               if(array[j] < array[j+1]){

                }
            }
        }
    }
}
