package com.company.lesson_25;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;

/* Количество букв
Ввести с клавиатуры 10 строчек и подсчитать в них количество различных букв (для 33 букв алфавита).  Вывести результат на экран.
String abc = "абвгдеёжзийклмнопрстуфхцчшщъыьэюя";
Пример вывода:
а 5
б 8
в 3
г 7
д 0
…
я 9
*/
// TODO: 11.07.2019
public class Test_03 {
    public static void main(String[] args) throws IOException {
        BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));

        ArrayList<String> list = new ArrayList<>();
        for (int i = 0; i < 4; i++) {
            String st = bf.readLine();
            list.add(st);
        }
        String abc = "абвгдеёжзийклмнопрстуфхцчшщъыьэюя";
        char[] chars = abc.toCharArray();
        ArrayList<Character> list1 = new ArrayList();
        for (int i = 0; i < chars.length; i++) {
            list1.add(chars[i]);
        }


        for (Character ch : list1) {
            int count = 0;
            for (String st : list) {
                for (int i = 0; i < st.length(); i++) {
                    if (st.charAt(i) == ch) {
                        count++;
                    }
                }
            }
            System.out.println(count + " " + ch);
        }


//        for (char x : list1) { //перебираем алфавит к char x
//            for (String s : list) {// идем по строке и записываем каждую букву в s
//                for (char z : s.toCharArray()) {// раскладываем строку в буквенный массив и присваеваем каждую букву в переменную char z
//                    if (x == z) {
//                        abccount++;
//                    }
//                }
//                System.out.println(x + " " + abccount);
//                abccount = 0;
//            }
//
//        }

    }
}
