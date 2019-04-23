package com.company.lesson_12;

import java.util.Arrays;

public class Test_04QuickSort {


    public static void main(String[] args) {
        int[] x = {1, 4, 5, 8, 9, -1, 0, -4, 34, 12, 86};
        System.out.println("Было");
        System.out.println(Arrays.toString(x));

        int low = 0; //создаем переменную low
        int hight = x.length - 1; // переменная hight = массив -1 =10

        quickSort(x, low, hight); //вызываем метод у трех переменных
        System.out.println("Стало");
        System.out.println(Arrays.toString(x));
    }

    public static void quickSort(int[] array, int low, int hight) {
        if (array.length == 0) // если массив равен 0 значит завершаем выполнение
            return;

        if (low >= hight) // если low больше равно hight, завершаем выполнение
            return;

        int middle = low + (hight - low) / 2; //0+(10-0)/2 =5
        int opora = array[middle];// 5

        int i = low, j = hight;
        while (i <= j) {
            while (array[i] < opora) {
                i++;
            }

            while (array[j] > opora) {
                j--;
            }

            if (i <= j) {//меняем местами В ЛЮБОМ СЛУЧАЕ(I РАВНО 0, J =10)
                int temp = array[i];
                array[i] = array[j];
                array[j] = temp;
                i++;
                j--;
            }
        }

        // вызов рекурсии для сортировки левой и правой части
        if (low < j)// ЕСЛИ 0 МЕНЬШЕ 10
            quickSort(array, low, j);

        if (hight > i) //
            quickSort(array, i, hight);
    }
}



