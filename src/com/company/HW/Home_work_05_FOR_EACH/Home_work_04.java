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

       int num;
       int sum = 0;

        do{
            System.out.println("Введите числа");
            num = Integer.parseInt(bf.readLine());
            sum+=num; // sum = sum + num;
        }while (num != -1);
        System.out.println(sum);

    }
}
