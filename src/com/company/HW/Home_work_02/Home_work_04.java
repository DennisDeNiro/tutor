package com.company.HW.Home_work_02;
/*
Ввести с клавиатуры три числа, вывести на экран среднее из них.
*/
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Home_work_04
{
    public static void main(String[] args) throws IOException {
        BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));

        System.out.println("Первое число");
        String st = bf.readLine();
        int a = Integer.parseInt(st);

        System.out.println("Второе число");
        String st2 = bf.readLine();
        int b = Integer.parseInt(st2);

        System.out.println("Третье число");
        String st3 = bf.readLine();
        int c = Integer.parseInt(st3);
        // TODO: 19.03.2019  check hw
        if (a > b && a < c) {           //2 1 3                     1 2 3, 1 3 2,2 1 3, 2 3 1,3 2 1, 3 1 2
            System.out.println(a);
        } else if (b > a && b < c) {   // 1 2 3
            System.out.println(b);
        } else if (c > a && c < b) {  //  1 3 2
            System.out.println(c);
        } else if (b > a && a > c) {  //  2 3 1
            System.out.println(a);
        }else if (a > b && b > c){     // 3 2 1
            System.out.println(b);
        }else if (c > b && a > c){      // 3 1 2
            System.out.println(c);
        }

    }
}
// этот код работает только при одном условии
//байти символы строки