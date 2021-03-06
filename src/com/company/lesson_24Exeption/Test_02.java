package com.company.lesson_24Exeption;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;

/* Метод в try..catch
Вводить с клавиатуры числа. Код по чтению чисел с клавиатуры вынести в отдельный метод readData.
Обернуть все тело (весь код внутри readData, кроме объявления списка, где будут храниться числа и BufferedReader-а)
этого метода в try..catch.
Если пользователь ввёл какой-то текст, вместо ввода числа,
то метод должен перехватить исключение и вывести на экран все введенные числа в качестве результата.
Числа выводить с новой строки сохраняя порядок ввода.
*/
public class Test_02 {
    public static void main(String[] args) throws IOException {
        readDate();
    }

    private static void readDate() throws IOException {
        BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
        List<Integer> list = new ArrayList<>();

        try {
            while (true) {
                int number = Integer.parseInt(bf.readLine());
                list.add(number);
            }
        } catch (Exception e) {
            for (Integer integer : list) {
                System.out.println(integer);
            }
        }
    }
}
