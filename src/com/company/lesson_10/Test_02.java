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
public class Test_02 {
    public static void main(String[] args) throws IOException {
        String[] arr = initializeArray();
        printArray(arr);
        System.out.println(arr);
    }

    public static String[] initializeArray() throws IOException {
        String[] array = new String[10];  // создаем массив из строк на 10 елментов
        BufferedReader bf = new BufferedReader(new InputStreamReader(System.in)); // создали bufferreader
        for (int i = 0; i < 8; i++) { // цикл for принимает восемь елеметов в массив
            array[i] = bf.readLine();  // каждый елемент последовательно записываеться
        }
        return array; // возвращаем массив
    }

    public static void printArray(String[] arr) {  // метод вывода елеметов в обратном порядке
//        String array = arr[0];   // принимаем первый елемент массива
        for (int i = 0; i <= arr.length; i++) {     // цикл for перечисляет восемь елеметов массива
        }
    }

}