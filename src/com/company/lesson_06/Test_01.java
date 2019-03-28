package com.company.lesson_06;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

import static com.sun.tools.doclint.Entity.minus;

/*
 * 1) Пользователь вводит число от 1 до 4
 * 2) Если число не входит в диапазон от 1 до 4 - выводим сообщение "Неверное число!"
 * 3) Иначе вызываем соответсвующий метод:
 *  - если пользователь ввел 1, то отрабатывает метод subt, который должен вычесть второе число из первого, числа пользователь должен ввести дополнительно
 *  - если пользователь ввел 2, то отрабатывает метод sum, который должен найти сумму двух чисел, которые пользователь должен ввести дополнительно
 *  - если пользователь ввел 3, то отрабатывает метод multy, который должен  умножить первое число на второе, числа пользователь должен ввести дополнительно
 *  - если пользователь ввел 4, то отрабатывает метод div, который должен поделить два числа, которые пользователь должен ввести дополнительно
 * 4) После того, как один из методов отработал, выводим пользователю результат
 */
public class Test_01 {
    public static void main(String[] args) throws IOException {
        BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
        System.out.println("Число 1");
        String st1 = bf.readLine();
        int number = Integer.parseInt(st1);
        System.out.println("Число 2");
        String st2 = bf.readLine();
        int number2 = Integer.parseInt(st2);

        if (number < 1 && number2 > 4) {
            System.out.println("Неверное число!");
        } else if (number == 1 && ) {
            System.out.println(minus(number2,number));
        } else if (number == 2){
            System.out.println(sum(number, number2));
        } else if (number == 3){
            System.out.println(mylty(number, number2));
        }else if(number == 4){
            System.out.println(div(number, number2));
        }
    }


    public static int minus(int number, int number2) {
        return number2 - number;
    }

    public static int sum (int number, int number2){
        return number + number2;
    }
    public static int mylty(int number, int number2){
        return number*number2;
    }
    public static int div(int number, int number2){
        return number/number2;
    }
}