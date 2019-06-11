package com.company.lesson_23Exeption;

import java.util.ArrayList;
import java.util.List;

/* Исключение при работе с коллекциями List
Перехватить исключение (и вывести его на экран), указав его тип, возникающее при выполнении кода:
List<String> list = new ArrayList<String>();
String s = list.get(18);
*/
public class Test_06 {
    public static void main(String[] args) {
        try{
            List<String> list = new ArrayList<String>();
            String s = list.get(18);
        }catch (Exception e){
            System.out.println("ArrayIndexOutOfBounds exc");
        }
    }
}
