package com.company.lesson_40;

import java.util.ArrayList;
import java.util.List;

//int[] array = {1, 3, 5, 6, 1, 4, 3, 6};
// FIXME: 01.10.2019 
public class Test_02 {
    public static void main(String[] args) {
        int[] array = {1, 3, 5, 6, 1, 4, 3, 6, 7};
        sort(array);

        for (int s : array) {
            System.out.print(s);
        }
        System.out.println("------------");
        takeNumber(findNumbers(array));

    }

    public static int[] sort(int[] array) {
        for (int i = 0; i < array.length; i++) {
            for (int k = 0; k < array.length - 1 - i; k++) {
                if (array[k] > array[k + 1]) {
                    int tmp = array[k];
                    array[k] = array[k + 1];
                    array[k + 1] = tmp;
                }
            }
        }
        return array;
    }

    //ошиюка в том что мы запросили индекс которого не сузествует
    public static int[] findNumbers(int[] array) {
        List<Integer> list = new ArrayList<>();

        if (array.length > 1 && array[array.length - 1] != array[array.length - 2]) {
            list.add(array[array.length - 1]);
        }

        for (int i = 0; i < array.length - 1; i++) {
            if (array[i] == array[i + 1]) {// в этой строчке мы пытаемся получить не существуюющий массив
                i++;

            } else {
                list.add(array[i]);
            }
        }

        int[] arr = new int[list.size()];
        for (int i = 0; i < list.size(); i++) {
            arr[i] = list.get(i);
        }
        return arr;
    }

    public static void takeNumber(int[] arr) {
        for (int i = 0; i < arr.length; i++) {
            System.out.println(arr[i]);
        }
    }
}
