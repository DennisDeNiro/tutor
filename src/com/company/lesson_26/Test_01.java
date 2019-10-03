package com.company.lesson_26;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/* Одинаковые слова в списке
Ввести с клавиатуры в список 5 слов. Нужно подсчитать количество одинаковых слов в списке.
Результат нужно представить в виде словаря Map<String, Integer>, где первый параметр – уникальная строка,
а второй – число, сколько раз данная строка встречалась в списке.
Вывести содержимое словаря на экран.
В тестах регистр (большая/маленькая буква) влияет на результат.
*/

//вариант count
public class Test_01 {
    public static void main(String[] args) throws IOException {
        Map<String, Integer> map = countWords(fillList());
        for (Map.Entry<String, Integer> entry : map.entrySet()) {
            System.out.println(entry);
        }
    }

    private static List<String> fillList() throws IOException {
        BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
        List<String> list = new ArrayList<>();
        for (int i = 0; i < 5; i++) {
            list.add(bf.readLine());
        }
        return list;
    }

    private static Map<String, Integer> countWords(List<String> list){
        Map<String, Integer> result = new HashMap<>();

        for (String word : list) {
            if(result.containsKey(word)){
                result.put(word, result.get(word) + 1);
            } else {
                result.put(word, 1);
            }
        }

        return result;
    }


    private static Map<String, Integer> countWords1(List<String>list){
            Map<String,Integer>result = new HashMap<>();


            return result;
    }


}
