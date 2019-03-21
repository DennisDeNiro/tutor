package com.company.HW.Home_work_03;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/*Ввести с клавиатуры число. Если число положительное, то увеличить его в два раза.
Если число отрицательное, то прибавить единицу. Вывести результат на экран. */
public class Home_work_03
{
    public static void main(String[] args) throws IOException {
        BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));

        System.out.println("Введите число");
        String st = bf.readLine();
        int number = Integer.parseInt(st);

        if (number>0) {
            System.out.println(number * 2);
        } else if (number<0){
            System.out.println(number+1);
        } else
        System.out.println("Ваше число 0");
    }
}
