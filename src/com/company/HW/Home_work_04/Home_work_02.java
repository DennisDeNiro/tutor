package com.company.HW.Home_work_04;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Home_work_02
{
    public static void main(String[] args) throws IOException {
        BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
        System.out.println("Введите число");
        String st = bf.readLine();
        int number = Integer.parseInt(st);
        System.out.println("convert = " + convert(number));
        System.out.println("percent = " + percent(number));
        System.out.println(print("" + number));
    }

    public static double convert(double grivna) {
        return grivna / 27.3; //BigDecimal
    }

    public static double percent(double number) {
        return number * 0.1 + number;
    }
    public static String print(String s){
        System.out.println(s);
        System.out.println(s);
        System.out.println(s);
        System.out.println(s);
        return s;
    }
}
