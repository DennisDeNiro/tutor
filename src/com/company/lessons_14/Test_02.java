package com.company.lessons_14;
// Создать список из целых чисел и заполнить его с консоли
// Ввод целых чисел с клавиатуры продолжается, пока не ввели пустую строку в консоли

import com.sun.istack.internal.FinalArrayList;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Test_02 {


    public static void main(String[] args) throws IOException {

        BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
        ArrayList<Integer> list = new ArrayList<Integer>();
        while (true) {
            String s = bf.readLine();
            if (s.isEmpty()) {
                break;
            }
            list.add(Integer.parseInt(s));
        }
    }
}
//equals
//isempty

