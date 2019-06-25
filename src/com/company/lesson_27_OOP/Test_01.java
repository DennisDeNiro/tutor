package com.company.lesson_27_OOP;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.text.SimpleDateFormat;
import java.util.Date;

public class Test_01 {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        Date date = new Date("JUNE 1 1980");

        SimpleDateFormat simpleDateFormat = new SimpleDateFormat("MMM d, y");

        System.out.println(simpleDateFormat.format(date).toUpperCase());
    }
}
