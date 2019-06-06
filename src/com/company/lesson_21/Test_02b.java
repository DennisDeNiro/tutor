package com.company.lesson_21;

import com.sun.xml.internal.bind.v2.schemagen.xmlschema.List;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

public class Test_02b {
    public static void main(String[] args) {

        Map<String, String> map1 = takeMap();
//        deleteName(map1);

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

    private static void deleteName(Map<String, String> map1, String value) {
        HashMap<String, String>hashMap = new HashMap<>(map1);
        for(Map.Entry<String,String>pair: hashMap.entrySet()){
        if (pair.getValue().equals(value)){
            map1.remove(pair.getKey());
        }
        }
    }
    }


