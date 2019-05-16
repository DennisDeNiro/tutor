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
//        getMinium(getIntegerList());
    }

    public static void getIntegerList() throws IOException {
        List<Integer> list = new ArrayList<>();
        BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
        while (true) {
            int x = Integer.parseInt(bf.readLine());
            if (list.isEmpty()) {
                break;
            }
        }
    }

    public static void getMinium(List<Integer> list) {
        int min = list.get(0);
        for (int i = 0; i < list.size(); i++) {
            if (list.get(i) < min) {
                min = list.get(i);
            }
        }
    }
}
