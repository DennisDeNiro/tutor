package com.company.HW.Home_work_10;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

/*
Создать коллекцию HashMap<String, String>, занести туда 4 пары строк:
арбуз - ягода, банан - трава, вишня - ягода, груша - фрукт
Вывести содержимое коллекции на экран, каждый элемент с новой строки.
Пример вывода (тут показана только одна строка):
груша - фрукт
*/
public class Test_04 {
    public static void main(String[] args) {
        returnHashMap(fillHashMap());
    }

    public static HashMap<String, String> fillHashMap() {
        HashMap<String, String> hashMap = new HashMap<>();
        hashMap.put("арбуз", "ягода");
        hashMap.put("банан", "трава");
        hashMap.put("вишня", "ягода");
        hashMap.put("груша", "фрукт");
        return hashMap;
    }

    public static void returnHashMap(HashMap<String, String> hashMap) {
        Iterator<Map.Entry<String, String>> iterator = hashMap.entrySet().iterator();
        while (iterator.hasNext()) {
            Map.Entry<String, String> text = iterator.next();
            System.out.println(text.getKey() + " - " + text.getValue());
        }
    }
}
