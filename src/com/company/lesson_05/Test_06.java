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
        String st = bf.readLine();
        String st2 = bf.readLine();
        int m = Integer.parseInt(st);
        int n = Integer.parseInt(st2);

        for (m = 0; m <= 2; m++) {
            for (n = 0; n <= 4; n++){
                System.out.print("8888");
            }
            System.out.println("9999");
        }
    }
}
