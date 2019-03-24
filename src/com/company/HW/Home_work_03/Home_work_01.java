package com.company.HW.Home_work_03;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.sql.SQLOutput;

/*
Введите с клавиатуры три целых числа.
Выведите их на экран в порядке возрастания, используя if/else.
*/
public class Home_work_01 {
    public static void main(String[] args) throws IOException {
        BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));

        System.out.println("Введите первое число");
        String st = bf.readLine();
        int number = Integer.parseInt(st);

        System.out.println("Введите второе число");
        String st2 = bf.readLine();
        int number2 = Integer.parseInt(st2);

        System.out.println("Введите третье число");
        String st3 = bf.readLine();
        int number3 = Integer.parseInt(st3);
        // TODO: 24.03.2019  
//        if (number > number2 && number2 > number3) {
//            System.out.println(number3 + " " + number2 + " " + number);  //3 2 1
//        } else if (number > number2 && number2 < number3) {
//            System.out.println(number2 + " " + number3 + " " + number); // 3 1 2
//        } else if (number2 > number && number3 < number) {
//            System.out.println(number3 + " " + number + " " + number2); //2 3 1
//        }else if (number3 > number && number > number2){
//            System.out.println(number2 + " " + number + " " + number3);// 2 1 3      //(number3 > number && number2 < number)
//        }else if(number3 > number2 && number2 > number){
//            System.out.println(number + " " + number2 + " " + number3); // 1 2 3
//        }else if (number2 > number3 && number2 > number){
//            System.out.println(number + " " + number3 + " " + number2); // 1 3 2    //(number2 > number3 && number3 > number)
//        }

        if (number<number2 && number2<number3){
            System.out.println(number + " " + number2 + " " + number3); // 1 2 3
        }else if (number2>number3 && number3>number){
            System.out.println(number + " " + number3 + " " + number2);
        }else if (number3>number && number>number2){
            System.out.println(number2 + " " + number + " " + number3);
        }else if(number2>number && number>number3){
            System.out.println(number3 + " " + number + " " + number2);
        }else if(number>number3 && number3> number2){
            System.out.println(number2 + " " + number3 + " " + number);
        }else if(number>number2 && number2>number3){
            System.out.println(number3 + " " + number2 + " " + number);
        }
    }

}
