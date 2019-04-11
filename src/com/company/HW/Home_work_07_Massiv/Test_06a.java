package com.company.HW.Home_work_07_Massiv;
/*
 Создать массив и заполнить его на 5 чисел используя быструю (статическую) инициализацию.
 Найти минимальный элемент в массиве и вывести его в консоль.
*/
public class Test_06a {
    public static void main(String[] args) {
        int[] q = {12, 13, 14, 11, 15};
        int min = q[0];
        for (int i = 0; i < q.length; i++) {

            if (q[i] < min)
                min = q[i];
        }
            System.out.println(min);
    }
}
