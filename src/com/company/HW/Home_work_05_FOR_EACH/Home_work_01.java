package com.company.HW.Home_work_05_FOR_EACH;

/*
Вывести на экран квадрат 10х10 из букв S используя цикл while.
Буквы в одной строке не разделять.
*/
public class Home_work_01 {
    public static void main(String[] args) {
        int k = 0;
        int x= 0;
        while (k <= 10) {
            while (x<=10){
                System.out.print("S");
                x = x +1;
            }
            System.out.println("s");
            k = k + 1;
        }
    }
}