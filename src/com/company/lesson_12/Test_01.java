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
        for (int i = 0; i<5; i++){
            a[i] = Integer.parseInt(bf.readLine());
            int b =a[0];
            if (a[0]<b){
                b=a[0];
                int c = a[1];
                if (a[1]<c){
                    c = a[1];
                    int d = a[2];
                    if (a[2]<d){
                        d = a[2];
                        int e = a[3];
                        if (a[3]<e){
                            e = a[3];
                            int f = a[4];
                            if (a[4]<f){
                                f = a[4];
                            }
                        }
                    }
                }

            }

            System.out.println(a[0]+" "+a[1]+" "+a[2]+" "+a[3]+" "+a[4]);
        }

//        System.out.println(a[4]+" "+a[3]+" "+a[2]+" "+a[1]+" "+a[0]);
//        System.out.println(a[0]+" "+a[4]+" "+a[3]+" "+a[2]+" "+a[1]);
//        System.out.println(a[1]+" "+a[0]+" "+a[4]+" "+a[3]+" "+a[2]);
//        System.out.println(a[4]+" "+a[0]+" "+a[1]+" "+a[2]+" "+a[3]);
    }
}
