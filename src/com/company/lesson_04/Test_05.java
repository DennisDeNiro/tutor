package com.company.lesson_04;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;


// Реализовать метод closeToTen.
//Метод должен выводить на экран ближайшее к 10 из двух чисел, записанных в
// аргументах метода.Например, среди чисел 8 и 11 ближайшее к десяти 11.
//Если оба числа на равной длине к 10, то вывести на экран любое из них.
public class Test_05 {
    public static void main(String[] args) throws IOException {
        float a = input();
        float b = input();
        float c = closeToTen(a, b);
        if (Float.isNaN(c)) System.out.println("Одинаково");
        else System.out.println("Ближайшее" + c);
    }


    public static int input() throws IOException {
        BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
        String st = bf.readLine();
        int number = Integer.parseInt(st);
        return number;
    }

    static float closeToTen(float a, float b) {
        float a1 = Math.abs(a - 10);
        float b2 = Math.abs(b - 10);
        if (a1 == b2) return Float.NaN;
        return a1 < b2 ? a1 : b2;
    }
}

//public class Test_05 {
//    public static void main(String[] args) throws IOException {
//        int a = input();
//        int b = input();
//    }
//
//
//    public static int input() throws IOException {
//        BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
//        System.out.println("Введите первое число");
//        String s = bf.readLine();
//        int number = Integer.parseInt(s);
//        return number;
//    }// TODO: 21.03.2019
//
//    public static void closeToTen(int a, int b) {
//        int num = 10;
//        if (a == b ){
//           System.out.println("a="+a + "и" +"b="+b + " равеы !");
//       }else if(a > num){
//           double d = a - num;
//           double d2 = b - num;
//       }if( a > b){
//            System.out.println(a + "Ближайшее");
//        }else if (a < b){
//            System.out.println(b + "Ближайшее");
//        }else if (b > num){
//            double d = a - num;
//            double d2 = b - num;
//        }else if(b > a){
//            System.out.println(b + "Ближайшее");
//        }else if(b < a){
//            System.out.println(a + "Ближайшее");
//        }
//    }
//    }

