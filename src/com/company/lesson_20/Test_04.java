package com.company.lesson_20;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

/*
Создать словарь (Map<String, String>) занести в него десять записей по принципу «Фамилия» - «Имя».
Проверить сколько людей имеют совпадающие с заданным имя или фамилию.
  map.put("Sim1", "Simn");
        map.put("Simn", "Tomn");
        map.put("Simn", "Arbusn");
        map.put("Baby", "Simn");
        map.put("Art", "Simn");
        map.put("Sim", "Dogn");
        map.put("Eat", "Eatn");
        map.put("Food", "Foodn");
        map.put("Gevey", "Geveyn");
        map.put("Hugs", "Hugsn");
*/
public class Test_04 {
    public static void main(String[] args) throws IOException {
        BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
        System.out.println("Введите имя и фамилию");
        String s = bf.readLine();
        String s1 = bf.readLine();

        haveAnotherName(takeMap());
    }

    public static Map<String, String> takeMap() {
        Map<String, String> map = new HashMap<>();
        map.put("Simn", "Tomn");
        map.put("Simn", "Arbusn");
        map.put("Baby", "Simn");
        map.put("Art", "Simn");
        map.put("Sim", "Dogn");
        map.put("Eat", "Eatn");
        map.put("Food", "Foodn");
        map.put("Gevey", "Geveyn");
        map.put("Hugs", "Hugsn");
        return map;
    }

    public static void haveAnotherName(Map<String, String> map,String s) {
        Iterator<Map.Entry<String, String>> iterator = map.entrySet().iterator();
        int count = 0;
        while (iterator.hasNext()) {
            Map.Entry<String, String> text = iterator.next();
            if (text.getKey().equals(s)) {
                count++;
            }
        }
    }
}
