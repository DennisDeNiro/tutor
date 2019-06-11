package com.company.lesson_23Exeption;

/* Исключение при работе со строками
Перехватить исключение (и вывести его на экран), указав его тип, возникающее при выполнении кода:
String s = null;
String m = s.toLowerCase();
*/
public class Test_04 {
    public static void main(String[] args) {

        try {
            String s = null;
            String m = s.toLowerCase();
        } catch (Exception e) {
            System.out.println("nullPointerExeption");
        }
    }
}
