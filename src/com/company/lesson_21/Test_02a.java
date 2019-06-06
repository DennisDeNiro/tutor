package com.company.lesson_21;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

public class Test_02a {
    public static void main(String[] args) {

        Map<String, String> map1 = takeMap();
//        System.out.println(deleteName());
    }

    private static Map<String, String> takeMap() {
        Map<String, String> map = new HashMap<>();
        map.put("Rooney", "Leo");
        map.put("Lloris", "Hugo");
        map.put("Messi", "Leo");
        map.put("Ronaldo", "Cristiano");
        map.put("Maldini", "Paolo");
        map.put("Indzaghi", "Pipo");
        map.put("Del Piero", "Alesandro");
        map.put("Balotelli", "Mario");
        map.put("Gotze", "Mario");
        map.put("Gomez", "Mario");
        return map;
    }

    private static int deleteName(Map<String, String> map,String name) {
        int count = 0;
       for(String tmp: map.keySet()){
           if (name.equals(tmp)){
               count++;
           }
       }
       return count;
    }
}
