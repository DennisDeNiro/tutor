package com.company.lesson_05;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/*
Ввести с клавиатуры два числа m и n.
Используя цикл for вывести на экран прямоугольник размером m на n из восьмёрок.
Пример: m=2, n=4
8888
8888
*/
public class Test_06 {
    public static void main(String[] args) throws IOException {
        BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
        BufferedReader bf2 = new BufferedReader(new InputStreamReader(System.in));
        String st = bf.readLine();
        String st2 = bf2.readLine();
        int number = Integer.parseInt(st);
        int number2 = Integer.parseInt(st2);


        for (int m = 0; m < number; m++) {
            for (int n = 0; n < number2; n++) {
                System.out.print("8");
            }
            System.out.println("8");
        }
    }
}
