package com.company.lesson_12;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/* Задача по алгоритмам
Задача: Написать программу, которая вводит с клавиатуры 5 чисел и выводит их в убывающем порядке.
*/
public class Test_01
{
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

    private static void sort(int[] arr) { // 5 3 6 1 -> 3 5 6 1 -> 3 5 1 6 -> 3 1 5 6 -> 1 3 5 6 // ... 100 103 105 104
        for (int i = 0; i < arr.length; i++) { // i=0,i<4; 1=1 ; i=2
            for (int j = 0; j < arr.length - 1 - i; j++) { // j=0,0<4; j=1,1<4; j=2,2<4
                if(arr[j] > arr[j+1]){ //5 > 3; 5 > 6; 6 > 1
                    int temp = arr[j]; //temp=5;     ; temp = 6;
                    arr[j] = arr[j+1]; //arr[0]=3;   ; arr[2]=1;
                    arr[j+1] = temp; //arr[1]=5;     ; arr[3]=6;
                }
            }
        }
    }


}
