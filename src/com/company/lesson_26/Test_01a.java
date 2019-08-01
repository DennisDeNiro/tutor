package com.company.lesson_26;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;

/* Одинаковые слова в списке
Ввести с клавиатуры в список 5 слов. Нужно подсчитать количество одинаковых слов в списке.
Результат нужно представить в виде словаря Map<String, Integer>, где первый параметр – уникальная строка,
а второй – число, сколько раз данная строка встречалась в списке.
Вывести содержимое словаря на экран.
В тестах регистр (большая/маленькая буква) влияет на результат.
*/

//нужно булет еще проработать(сплит)
public class Test_01a {
    public static void main(String[] args) throws IOException {
        Map<String, Integer> map = takeMap(fillMap());
        for (Map.Entry<String,Integer>entry: map.entrySet()){
            System.out.println(entry);
        }
    }

    private static List<String> fillMap() throws IOException {
        BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
        List<String> list = new ArrayList<>();
        for (int i = 0; i < 5; i++) {
            String s = bf.readLine();
            list.add(s);
        }
        return list;
    }

    private static Map<String, Integer> takeMap(List<String> list) {
        Map<String, Integer> result = new HashMap<>();
        for (String s : list) {
            Integer oldCount = result.get(s);
            if (oldCount == null) {
                oldCount = 0;
            }
            result.put(s, oldCount + 1);
        }
        return result;
    }
}
//сделать через Entry map
// или с двумя форами