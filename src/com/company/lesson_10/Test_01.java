package com.company.lesson_10;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/*
1. В методе initializeArray():
1.1. Создайте массив на 10 чисел
1.2. Считайте с консоли 10 чисел и заполните ими массив
2. Метод max(int[] array) должен находить максимальное число из элементов массива
3. В выполняющем методе main выведите максимальное число в консоль
*/
public class Test_01 {
    public static void main(String[] args) throws IOException {
        System.out.println(max(initializeArray()));
    }


    public static int[] initializeArray() throws IOException {
        int[] array = new int[10];
        BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
        System.out.println("Введите числа");
        for (int i = 0; i < array.length; i++) {
            array[i] = Integer.parseInt(bf.readLine());
        }
        return array;
    }


    public static int max(int[] arr) {
        int max = arr[0];
        for (int i = 0; i<arr.length; i++){
            if (arr[i]>max){
                max = arr[i];
            }
        }
        return max;
    }
}


