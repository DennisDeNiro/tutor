package com.company.lesson_09;
// Заполнение массива из 10 чисел, числами от 10 до 1

// [0] = 10
// ...
// [9] = 1
public class Test_02 {
    public static void main(String[] args) {
        int[] array = new int[10];

//        for (int a = 9; a >= 0; a--) { // a=9; 9>=0; 9--
//            array[a] = 10 - a;   //9 = 10-9
//        }
        // a = 9; 9 >= 0; array[9] = 10 - 9 = 1; 9 -> 8
        // a = 8; 8 >= 0; array[8] = 10 - 8 = 2; 8 -> 7

        for (int a = 0; a < array.length; a++) {
            array[a] = 10-a; //
        }
        // a = 0; 0 < 10; array[0] = 10 + 0 = 10; 0 -> 1
        // a = 1; 1 < 10; array[1] = 10 - 1 = 9; 1 -> 2


        for (int a = 0; a < array.length; a++) {
            System.out.println(array[a]);
        }
    }
}
