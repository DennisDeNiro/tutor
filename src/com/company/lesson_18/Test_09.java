package com.company.lesson_18;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/*
Реверс числа
1) Ввести число с клавитауры
2) Сделать реверс этого числа и вывести результат в консоль

Пример:
входные данные: -5544
результат: -4455
*/
public class Test_09 {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        int number = Integer.parseInt(reader.readLine());
        int last_num;
        int sun = 0;
        while(number!=0){
            last_num = number%10; // берем последнее число
            number/=10; //записываем в number значение последних чисел без последнего
            sun = sun*10+last_num;// sun = 0*10+5
            System.out.print(last_num);
        }
    }
}



