package com.company.HW.Home_work_07_Massiv;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

// Ввести 5 строк с клавиатуры и записать их в массив
public class Test_03
{
    public static void main(String[] args) throws IOException {
        String[] array = new String[5];
        BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
        String st = bf.readLine();
        for (int i = 0; i<array.length; i++){

            array[i] = st + i;
            System.out.println(array[i]);
        }
    }
}
