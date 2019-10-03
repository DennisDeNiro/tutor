package com.company.lesson_37;


public class Test_02 {
    public static void main(String[] args) {
        int[] number = new int[]{90, 5, 7, 34, 2, 16, 346};
        minNumber(number);
        maxNumber(number);
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

    public static void maxNumber(int[] number){
        int max = number[0];
        for (int i =0; i<number.length; i++){
            if (number[i]>max){
                max = number[i];
            }
        }
        System.out.println(max);
    }

}
