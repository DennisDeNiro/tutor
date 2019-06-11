package com.company.lesson_23Exeption;
/* Исключение при работе с массивами
Перехватить исключение (и вывести его на экран), указав его тип, возникающее при выполнении кода:
int[] m = new int[2];
m[8] = 5;
*/
public class Test_05 {
    public static void main(String[] args) {
        try{
            int[]m = new int[2];
            m[8]=5;
        }catch (ArrayIndexOutOfBoundsException e){
            System.out.println("ArrayIndexOutOfBounds exc");
        }
    }
}
