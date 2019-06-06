package com.company.lesson_22;
/*
Задача: Программа определяет, какая семья (фамилию) живёт в указанном городе.
Пример ввода:
Москва
Ивановы
Киев
Петровы
Лондон
Абрамовичи

Лондон

Пример вывода:
Абрамовичи
*/

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

public class Test_03 {
    public static void main(String[] args) throws IOException {
        Map<String,String>map = entryMap();
        String s =searchFamily();
        takeFamily(map,s);
    }

    private static Map<String, String> entryMap(){
        Map<String, String>map = new HashMap<>();
        map.put("Москва","Ивановы");
        map.put("Киев","Петровы");
        map.put("Лондон","Абрамовичи");
        return map;
    }

    private static String searchFamily() throws IOException {
        BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
        String s = bf.readLine();
        return s;
    }

    private static Map<String,String> takeFamily(Map<String,String>map, String value) {
        Iterator<Map.Entry<String, String>> map1 = map.entrySet().iterator();
        while (map1.hasNext()) {
            Map.Entry<String, String> text = map1.next();
            if (text.getKey().equals(value)) {
                System.out.println(text.getValue());
            }
        }

        return map;
    }
}
