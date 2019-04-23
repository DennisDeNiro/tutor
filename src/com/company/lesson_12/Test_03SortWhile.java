package com.company.lesson_12;

import java.util.Arrays;

public class Test_03SortWhile {
    public static void main(String[] args) {
        int[] x = {3, 4, 7, 6, 14, 8, 12, 14, 1};//создаем массив

        boolean isSorted = false; //флажок- отсортирован массив или нет
        int a;// переменная для обмена
        while (!isSorted) { // цикл while потому как не понятно сколько раз прийдеться пройти по массиву
            isSorted = true;// если маасив отсортирован то проходим к следующему елементу
            for (int i = 0; i < x.length - 1; i++) {// для того что бы не выйти за границы используем x.lenght-1
                if (x[i] > x[i + 1]) { // проверяем больше ли первый елемент второго
                    isSorted = false; // если да переходим к следующим елементам

                    a = x[i];
                    x[i] = x[i + 1];
                    x[i + 1] = a;

                }
            }
        }
        System.out.println(Arrays.toString(x));

    }
}
