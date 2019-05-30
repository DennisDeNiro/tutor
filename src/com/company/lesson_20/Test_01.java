package com.company.lesson_20;

import java.sql.SQLOutput;
import java.util.*;

/*
 Вывод на экран элементов Set, List, Map используя итератор
*/
public class Test_01 {
    public static void main(String[] args) {
        Set<String> set = new HashSet<>();
        set.add("text");
        set.add("text1");
        set.add("text2");
        set.add("text3");
        set.add("text4");

        Iterator<String>iterator = set.iterator();
        while(iterator.hasNext()){
            String text = iterator.next();
            System.out.println(text);
        }


        List<String>list = new ArrayList<>();
        list.add("text");
        list.add("text1");
        list.add("text2");
        list.add("text3");
        list.add("text4");

        Iterator<String>iterator1 = list.iterator();
        while(iterator1.hasNext()){
            String text = iterator1.next();
            System.out.println(text);
        }

        Map<String, Integer>map = new HashMap();
        map.put("text6",1);
        map.put("text1",2);
        map.put("text2",2);
        map.put("text3",3);
        map.put("text1",5);
        Iterator<Map.Entry<String, Integer>>iterator2 = map.entrySet().iterator();
        while (iterator2.hasNext()){
            Map.Entry<String, Integer>text = iterator2.next();
            System.out.println(text.getValue()+" -- "+ text.getKey());
        }
    }
}
