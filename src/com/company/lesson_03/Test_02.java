package com.company.lesson_03;

import javax.imageio.IIOException;
import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Test_02
{
    public static void main(String[] args) {
//        System.out.println(plus(15,124));
        System.out.println(minus(21,34));
        System.out.println(umnojit(34,2));
        System.out.println(delit(8,4));
    }

//    public static int plus() throws IIOException {
//        BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
//        String st = bf.readLine();
//        int number = Integer.parseInt(st);
//    }

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
