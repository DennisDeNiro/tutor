package com.company.lesson_21;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

/* Номер месяца
Программа вводит с клавиатуры имя месяца и выводит его номер на экран в виде: «May is 5 month».

        map.put("January",1);
        map.put("February",2);
        map.put("March",3);
        map.put("April",4);
        map.put("May",5);
        map.put("June",6);
        map.put("July",7);
        map.put("August",8);
        map.put("September",9);
        map.put("October",10);
        map.put("November",11);
        map.put("December",12);
*/

public class Test_03 {
    public static void main(String[] args) throws IOException {
        Map<String, Integer> map = mapAdd();
        String s = searchMonth();
        getMonth(map, s);
    }

    private static Map<String, Integer> mapAdd() {
        Map<String, Integer> map = new HashMap<>();
        map.put("January", 1);
        map.put("February", 2);
        map.put("March", 3);
        map.put("April", 4);
        map.put("May", 5);
        map.put("June", 6);
        map.put("July", 7);
        map.put("August", 8);
        map.put("September", 9);
        map.put("October", 10);
        map.put("November", 11);
        map.put("December", 12);
        return map;
    }

    private static String searchMonth() throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        String name = bufferedReader.readLine();
        return name;
    }

    private static void getMonth(Map<String, Integer> map1, String name) {
        Iterator<Map.Entry<String, Integer>> iter = map1.entrySet().iterator();
        while (iter.hasNext()) {
            Map.Entry<String, Integer> text = iter.next();
            if (text.getKey().equals(name)) {
                System.out.println(text.getValue() + " - " + text.getKey());
            }
        }
    }
}
