package com.company.lesson_10;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Test_03a
{
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        String[] str = new String[5];
        int[] numb = new int[5];
        for(int i = 0; i<str.length;i++){
            str[i] = reader.readLine();
        }
        for(int a = 0;a<str.length;a++){
            numb[a] = str[a].length();
            System.out.println(numb[a]);
        }
    }
}
