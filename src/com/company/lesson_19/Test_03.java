package com.company.lesson_19;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/*
Задача: Ввести с клавиатуры 5 слов и выведи их в алфавитном порядке.
*/
public class Test_03 {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        String[] array = new String[5];
        for (int i = 0; i < array.length; i++) {
            array[i] = reader.readLine();
        }

        sort(array);

        for (String s : array) {
            System.out.println(s);
        }
    }

    private static void sort(String[] array){
        for (int i = 0; i < array.length - 1; ) {
            int j = i + 1;

            if(isGreaterThen(array[i], array[j])){
                String temp = array[j];
                array[j] = array[i];
                array[i] = temp;
                if(i > 0) i--;
            } else i++;
        }
    }

    private static boolean isGreaterThen(String a, String b){
        return a.compareTo(b) > 0;
    }

}
