package com.company.HW.Home_work_05_FOR_EACH;
/*
Вывести на экран квадрат 10х10 из букв S используя цикл while.
Буквы в одной строке не разделять.
*/

public class Home_work_01a {

    public static void main(String[] args) throws Exception {
        int i = 0;
        while (i++ < 10) {
            int j = 0;
            while (j++ < 10)
                System.out.print("S");
            System.out.println();
        }
    }

}