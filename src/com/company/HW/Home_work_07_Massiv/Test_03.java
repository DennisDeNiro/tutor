package com.company.HW.Home_work_07_Massiv;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

// Ввести 5 строк с клавиатуры и записать их в массив
public class Test_03
{
    public static void main(String[] args) throws IOException {

        BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
        String[] array = new String[5];
        for (int i = 0; i<5; i++){
            array[i] = bf.readLine();
            System.out.println(array[i]);
        }
    }
}
