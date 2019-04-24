package com.company.HW.Home_work_08Massiv;

import java.util.Arrays;

//Создайте массив из всех нечётных чисел от 1 до 99, выведите его на экран в строку,
// а затем этот же массив выведите на экран тоже в строку, но в обратном порядке (99 97 95 93 … 7 5 3 1).
public class Test_03 {
    public static void main(String[] args) {


        int[] x = new int[]{1, 3, 5, 7, 9, 11, 13, 15, 17, 19, 21, 23, 25, 27, 29, 31, 33, 35, 37, 39, 41, 43, 45, 47, 49, 51, 53, 55, 57, 59, 61, 63, 65, 67, 69, 71, 73, 75, 77, 79, 81, 83, 85, 87, 89, 91, 93, 95, 97, 99};

        System.out.println(Arrays.toString(x));
        int lenght = 0;
        for (int element : x) {
        lenght++;
        }
        for (int i=x.length-1; i>=0; i-- ){
            System.out.print(x[i]+ ", ");
        }
    }
}
