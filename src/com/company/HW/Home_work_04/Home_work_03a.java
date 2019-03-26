package com.company.HW.Home_work_04;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

//Этот код не работает!!


public class Home_work_03a {
    public static void main(String[] args) throws IOException {
        int a = input();
        int b = input();
    }

    public static int input() throws IOException {
        BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
        String st = bf.readLine();
        int num = Integer.parseInt(st);
        return num;
    }

    public static void CloseToTen(int a, int b) {
        int x = a - 10;
        int y = b - 10;
        if (abs(x) < abs(y))
            System.out.println("первое число ближе к 10");
        else if (abs(x) > abs(y))
            System.out.println("второе число ближе к 10");
        else
            System.out.println("Числа одинаковые");
    }


    public static int abs(int a) {
        if (a < 0) {
            return -a;
        } else {
            return a;
        }
    }
}
