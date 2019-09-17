package com.company.lesson_37;

// TODO: 05.09.2019  
public class Test_02 {
    public static void main(String[] args) {
        int[] number = new int[]{90, 5, 7, 34, 2, 16, 346};
        minNumber(number);
    }

    public static void minNumber(int[] number) {
        int min = number[0];
        for (int i = 0; i < number.length; i++) {
            if (number[i] < min) {
                min = number[i];
            }
        }
        System.out.println(min);
    }

    public static void maxNumber(){}

}
