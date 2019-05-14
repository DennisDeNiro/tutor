package com.company.lesson_16;
/* Максимальное и минимальное числа в массиве
Создать массив на 10 чисел. Заполнить его числами с клавиатуры. Найти максимальное и минимальное числа в массиве.
Вывести на экран максимальное и минимальное числа через пробел.
*/

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
// я не пониаю в чем ошибка?
public class Test_03 {
    public static void main(String[] args) throws IOException {
        System.out.println(MinInt(NumberInt()));
        System.out.println(MaxInt(NumberInt()));
    }

    public static int[] NumberInt() throws IOException {
        BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
        int[] x = new int[3];
        for (int i = 0; i < x.length; i++) {
            x[i] = Integer.parseInt(bf.readLine());
        }
        return x;
    }

    public static int MinInt(int[] x) {
        int min = x[0];
        for (int i = 0; i < x.length; i++) {
            if (x[i] < min) {
                min = x[i];
            }
        }
        return min;
    }

    public static int MaxInt(int[] x) {
        int max = x[0];
        for (int i = 0; i < x.length; i++) {
            if (x[i] > max) {
                max = x[i];
            }
        }
        return max;
    }
}
