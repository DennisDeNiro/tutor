package com.company.lesson_18;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class test_09a {
    public static void main(String[] args) throws IOException {
        BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
        int number = Integer.parseInt(bf.readLine());
        int reversenumber = 0;
        while(number!=0){
            int lastnumber = number%10;
            number = number/10;
            reversenumber = reversenumber*10+lastnumber;
        }
        System.out.println(reversenumber);
    }
}
