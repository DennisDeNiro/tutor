package com.company.HW.Home_work_02;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Home_work_04
{
    public static void main(String[] args) throws IOException {
        BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));

        System.out.println("Первое число");
        String st = bf.readLine();
        int a = Integer.parseInt(st);

        System.out.println("Второе число");
        String st2 = bf.readLine();
        int b = Integer.parseInt(st2);

        System.out.println("Третье число");
        String st3 = bf.readLine();
        int c = Integer.parseInt(st3);
        // TODO: 19.03.2019  check hw
        if (a > b && a < c) {
            System.out.println(a);
        } else if (b < a && b > c) {
            System.out.println(b);
        } else if (c > a && c < b) {
            System.out.println(c);
        }
    }
}
// этот код работает только при одном условии
//байти символы строки