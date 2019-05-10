package com.company.lesson_15;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;

/* Буква «р» и буква «л»
1. Создай список слов, заполни его самостоятельно.
2. Метод fix должен:
2.1. удалять из списка строк все слова, содержащие букву «р»
2.2. удваивать все слова содержащие букву «л».
2.3. если слово содержит и букву «р» и букву «л», то оставить это слово без изменений.
2.4. с другими словами ничего не делать.

Пример:
лира
лоза
роза

Выходные данные:
лира
лоза
лоза
*/
// TODO: 08.05.2019  
public class Test_02 {
    public static void main(String[] args) throws IOException {
        BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
        List<String> list = new ArrayList<>();
        for (int i = 0; i < 3; i++) {
            String s = bf.readLine();
            list.add(s);
        }
        fix(list);
        for (String s : list) {
            System.out.println(s);
        }

    }

    //contains дальше remove ,add
    public static void fix(List<String> list) {
        for (int i = 0; i < 3; i++) {
            if (list.get(i).contains("р") && list.get(i).contains("л")) {
                continue;
            }
            else if (list.get(i).contains("р")) {
                list.remove(list.get(i));
                break;
            }
             if (list.get(i).contains("л")) {
                list.add(list.get(i));
            }

        }
    }
}
