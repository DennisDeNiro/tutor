package com.company.lesson_38;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;

/*
Наибольший общий делитель (НОД).
Ввести с клавиатуры 2 целых положительных числа.
Вывести в консоль наибольший общий делитель.
*/
public class Test_01 {
    public static void main(String[] args) throws IOException {
        BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
        int a = Integer.parseInt(bf.readLine());
        int b = Integer.parseInt(bf.readLine());
        System.out.println(numbersNod(a, b));
        System.out.println(nod(a,b));
    }

    public static int numbersNod(int a, int b) {
        int number = 1;
        int res = 0;
        while (number<=a&&number<=b) {
            if (a % number == 0 && b % number == 0) {
                res = number;
                number++;
            } else {
                number++;
            }
        }
        return res;
    }

    public static int nod(int a, int b){
        if(b == 0) return a;
        return nod(b, a%b);
    }
}

