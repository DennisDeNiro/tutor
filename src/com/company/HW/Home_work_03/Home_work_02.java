package com.company.HW.Home_work_03;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

//Реализовать метод compare(int a).
//Метод должен выводить строку на экран "Число меньше 5",
// если параметр метода меньше 5 - и, выводить строку "Число больше 5", если параметр
// метода больше 5 - и, и выводить строку "Число равно 5", если параметр метода равен 5 - и.
public class Home_work_02 {
    public static void main(String[] args) {
    }

    public static void compare() throws IOException {
        BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
        String st = bf.readLine();
        int a = Integer.parseInt(st);

        if (a < 5) {
            System.out.println("Число меньше 5");
        } else if (a > 5) {
            System.out.println("Число больше 5");
        } else if (a == 5) {
            System.out.println("число равняеться 5");
        }
    }
}


