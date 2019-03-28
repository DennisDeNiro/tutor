package com.company.HW.Home_work_05_FOR_EACH;
/*
Используя цикл for вывести на экран:
- горизонтальную линию из 10 восьмёрок
- вертикальную линию из 10 восьмёрок.
8888888888
8
8
8
8
8
8
8
8
8
8
*/

public class Home_work_02 {
    public static void main(String[] args) {
        for (int a = 0; a < 10; a++) {
            System.out.print(8);
        }
        System.out.println();
        for (int b = 0; b < 10; b++) {
            System.out.println(8);
        }
    }
}
