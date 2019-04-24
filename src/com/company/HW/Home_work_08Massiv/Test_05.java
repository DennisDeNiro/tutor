package com.company.HW.Home_work_08Massiv;

//int[] mice = new int[] { 4, 9, 3, 22, 5, 18, 25, 7, 11, 15, 5, 19 };
// Написать метод getMax(), который вычисляет максимальное значение из массива. Ну и метод getMin() для нахождения минимального значения.
public class Test_05 {
    public static void main(String[] args) {

        initializarray(getMax());
    }

    public static int initializarray(int[] array){
        int[] mice = new int[]{4, 9, 3, 22, 5, 18, 25, 7, 11, 15, 5, 19};
        return mice;
    }

    public static int getMax(int[] arr){
        int max = arr[0];
        for (int i=0; i<arr.length; i++){
            arr[i]> max;
            max = arr[i];
        }
        return max;
    }

    public static int getMin(int[] arr){
        int min = arr[0];
        for (int i =0; i<arr.length; i++){
            arr[i]>min;
            min = arr[i];
        }
        return min;
    }
}
