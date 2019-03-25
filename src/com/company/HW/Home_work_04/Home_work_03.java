package com.company.HW.Home_work_04;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Home_work_03
{//почему работает только с float
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
