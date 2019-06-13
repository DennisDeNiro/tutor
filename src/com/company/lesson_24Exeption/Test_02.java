package com.company.lesson_24Exeption;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

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

    private static boolean readDate() throws IOException {
        BufferedReader  bf =new BufferedReader(new InputStreamReader(System.in));
        String a = bf.readLine();
        while(true) {
            try {
                int number = Integer.parseInt(a);
                if (number)
                    return true;
            } catch (Exception e) {
                System.out.print("Ввелите число");
                return false;
            }
        }

    }

}
