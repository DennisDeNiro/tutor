package com.company.lesson_03;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

// Реализовать метод closeToTen.
//Метод должен выводить на экран ближайшее к 10 из двух чисел, записанных в
// аргументах метода.Например, среди чисел 8 и 11 ближайшее к десяти 11.
//Если оба числа на равной длине к 10, то вывести на экран любое из них.
public class Test_05 {
    public static void main(String[] args) throws IOException {
        int a = input();
        int b = input();
        closeToTen(a,b);
    }

    public static int input() throws IOException {
        BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
        System.out.println("Введите первое число");
        String s = bf.readLine();
        int number = Integer.parseInt(s);
        return number;
    }// TODO: 21.03.2019  

    public static void closeToTen(int a, int b) {
        if (a-10>b-10) {
            System.out.println(b);
        }else if(b-10>a-10){
            System.out.println(a);
        }
    }
}
