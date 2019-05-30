package com.company.lesson_19;

import java.util.*;

/*
Collection
- List
 - ArrayList
 - LinkedList
 - Vector
- Set
 - HashSet
 - LinkedHashSet
 - TreeSet
- Map
 - HashMap
 - LinkedHashMap
 - TreeMap
 - Hashtable
- Queue
 */
public class Test_04 {
    public static void main(String[] args) {
        Set<String> set = new HashSet<>();
        set.add("text1");
        set.add("text2");
        set.add("text3");
        set.add("text1");
        set.add("text4");

        Iterator<String> iterator = set.iterator();
        while (iterator.hasNext()){
            String text = iterator.next();
            if(text.equals("text2")) {
                iterator.remove();
                break;
            }
            System.out.println(text);
        }


        Map<String, Integer> map = new HashMap<>();
        map.put("text1", 1);
        map.put("text2", 1);
        map.put("text3", 2);
        map.put("text4", 3);
        map.put("text3", 4);

        Iterator<Map.Entry<String, Integer>> mapIter = map.entrySet().iterator();
        while (mapIter.hasNext()){
            Map.Entry<String, Integer> text = mapIter.next();
            System.out.println(text.getKey() + " - " + text.getValue());
        }


//        for (Map.Entry<String, Integer> entry : map.entrySet()) {
//            System.out.println(entry.getKey() + "  " + entry.getValue());
//        }
    }
}
