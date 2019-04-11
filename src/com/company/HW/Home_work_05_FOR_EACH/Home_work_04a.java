package com.company.HW.Home_work_05_FOR_EACH;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
/* Посчитать сумму чисел
Вводить с клавиатуры числа и считать их сумму.
Если пользователь ввел -1, вывести на экран сумму и завершить программу.
 -1 должно учитываться в сумме.
*/
public class Home_work_04a
{
    public static void main(String[] args) throws IOException {
        BufferedReader df = new BufferedReader(new InputStreamReader(System.in));

       int num;
       int sum = 0;

       while (true){
           num = Integer.parseInt(df.readLine());
           if(num == -1);
           sum += num;
           break;

       }
        System.out.println(sum);

    }
}
