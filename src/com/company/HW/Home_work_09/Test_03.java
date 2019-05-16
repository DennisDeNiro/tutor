package com.company.HW.Home_work_09;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;

/* Минимальное из N чисел
1. Ввести с клавиатуры число N.
2. Считать N целых чисел и заполнить ими список - метод getIntegerList.
3. Найти минимальное число среди элементов списка - метод getMinimum.
*/
public class Test_03 {
    public static void main(String[] args) {
        List<Integer>list = new ArrayList<>();
    }

    public static int getIntegerList(int list) throws IOException {
        BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
        list = Integer.parseInt(bf.readLine());
    }
}
