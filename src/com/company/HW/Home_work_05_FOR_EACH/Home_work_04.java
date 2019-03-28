package com.company.HW.Home_work_05_FOR_EACH;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/* Посчитать сумму чисел
Вводить с клавиатуры числа и считать их сумму. Если пользователь ввел -1, вывести на экран сумму и завершить программу.
 -1 должно учитываться в сумме.
*/
public class Home_work_04 {
    public static void main(String[] args) throws IOException {
        BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
        System.out.println("Введите первое число");
        String st = bf.readLine();
        System.out.println("Введите второе число");
        String st2 = bf.readLine();
        int num = Integer.parseInt(st);
        int num2 = Integer.parseInt(st2);
        int num3 = num + num2;

        if (num > 0 && num2 > 0) {
            System.out.println(num3);
        }
        if (num < 0) {
            num = -num;
            System.out.println(num2 - num);
        }
        if (num2 < 0) {
            num2 = -num2;
            System.out.println(num - num2);
        }
    }
}
