package com.company.HW.Home_work_04;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Home_work_01
{
    public static void main(String[] args) throws IOException {
        int a = input();
        interval(a);
    }

    public static int input() throws IOException {
        BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
        String st = bf.readLine();
        return Integer.parseInt(st);
    }

    public static void interval(int a) {
        if (a >= 50 && a <= 100) {
            System.out.println("Число а содержиться в интервале");
        } else {
            System.out.println("Число а не содержиться в интервале");
        }
    }
}
