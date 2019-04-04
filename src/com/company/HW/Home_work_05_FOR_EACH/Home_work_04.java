package com.company.HW.Home_work_05_FOR_EACH;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/* Посчитать сумму чисел
Вводить с клавиатуры числа и считать их сумму.
Если пользователь ввел -1, вывести на экран сумму и завершить программу.
 -1 должно учитываться в сумме.
*/

public class Home_work_04 {
    public static void main(String[] args) throws IOException {
        BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
        System.out.println("Введите числа");
        String st = bf.readLine();
        int num = Integer.parseInt(st);
        int num1 = Integer.parseInt(st);
        int num2 = Integer.parseInt(st);
        int num3 = Integer.parseInt(st);
        int num4 = Integer.parseInt(st);
        int num5 = Integer.parseInt(st);

        int num6 = num + num1 + num2 + num3 + num4;

        if (num==-1 || num1==-1){
            System.out.println(num+num1);
        }else if (num2==-1 || num3==-1 ){
            System.out.println(num+num1+num2+num3);
        }else if
    }
}
