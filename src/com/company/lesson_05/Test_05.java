package com.company.lesson_05;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/*
Ввести с клавиатуры строку и число N.
Вывести на экран строку N раз используя цикл while.
Пример ввода:
абв
2
Пример вывода:
абв
абв
*/
// TODO: 28.03.2019  
public class Test_05 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedReader br2 = new BufferedReader(new InputStreamReader(System.in));
        System.out.println("Введите буквы");
        String name = br.readLine();
        String st = br2.readLine();
        int number = Integer.parseInt(st);
        System.out.println(name);
        int j = 0;
//        while (number > name){
//            System.out.println(name);
//            number++;
//        }
    }
}

//этот код не работает