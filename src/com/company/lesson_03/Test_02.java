package com.company.lesson_03;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Test_02
{
    public static void main(String[] args) throws IOException {
        BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
        System.out.println("Enter number1:");
        int number1 = Integer.parseInt(bf.readLine());
        System.out.println("Enter number2:");
        int number2 = Integer.parseInt(bf.readLine());
        System.out.println("sum = " + plus(number1, number2));
//        System.out.println(minus(21,34));
//        System.out.println(umnojit(34,2));
//        System.out.println(delit(8,4));
    }

    public static int plus(int number1, int number2)  {
       return number1 + number2;
    }

    public static int minus(int number1, int number2){
        return number1 - number2;
    }

    public static int umnojit(int number1, int number2){
        return number1 * number2;
    }

    public static int delit(int number1, int number2){
        return number1 / number2;
    }


}
