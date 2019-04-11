package com.company.lesson_10;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/*
В методе initializeArray():
1. Создать массив на 10 строчек.
2. Ввести с клавиатуры 8 строчек и сохранить их в массив.
В методе printArray():
3. Вывести содержимое всего массива (10 элементов) на экран в обратном порядке. Каждый элемент - с новой строки.
*/
public class Test_02
{
    public static void main(String[] args) {
        System.out.println(printArray(initializeArray()));
    }

    public static int[] initializeArray() throws IOException {
        String[]a = new String[10];
        BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
        for (int i = 0; i<8; i++){
            a[i] = bf.readLine();
        }
        return String;
    }

    public static int printArray(int[] arr){
        for (int i = 0; i<8; i++){
            arr[i] = 8-i;
        }
        return arr[i];
    }
}
