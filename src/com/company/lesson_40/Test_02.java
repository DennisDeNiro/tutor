package com.company.lesson_40;

//int[] array = {1, 3, 5, 6, 1, 4, 3, 6};
public class Test_02 {
    public static void main(String[] args) {
        int[] array = {1, 3, 5, 6, 1, 4, 3, 6};
        sort(array);
    }

    public static void sort(int[] array) {
        for (int i = array.length - 1; i > 0; i--) {
            for (int k = 0; k < i; k++) {
                if (array[k] > array[k + 1]) {
                    int tmp = array[k];
                    array[k] = array[k + 1];
                    array[k + 1] = tmp;
                }
            }
        }
    }
}
