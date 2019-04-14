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
        int[] array = new int[10];         //создали массив из 10 символов
        BufferedReader bf = new BufferedReader(new InputStreamReader(System.in)); // создали BufferedReader
        System.out.println("Введите числа");
        for (int i = 0; i < array.length; i++) {     // цикл for который перечисляет 10 символов
            array[i] = Integer.parseInt(bf.readLine());  // присваем всем елементам массива = ввод строки
        }
        return array;    // возвращаем массив
    }


    public static int max(int[] arr) {   // создаем метод поиска максимального елемента массива
        int max = arr[0];                 // пусть максимальный массив будет первым
        for (int i = 0; i<arr.length; i++){ // цикл for для перечисления массива
            if (arr[i]>max){
                max = arr[i];
            }
        }
        return max;
    }
}


