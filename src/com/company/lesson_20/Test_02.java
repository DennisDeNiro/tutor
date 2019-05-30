package com.company.lesson_20;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

/* Вывести на экран список ключей
Есть коллекция HashMap<String, String>, туда занесли 3 различные пары.
При помощи метода printKeys:
Вывести на экран список ключей, каждый элемент с новой строки.
*/
public class Test_02 {
    public static void main(String[] args) {
        printKey(takeKey());
        printValue(takeKey());
    }

    public static HashMap<String, String> takeKey(){
        HashMap<String,String>hashMap = new HashMap<>();
        hashMap.put("Вася","Оля");
        hashMap.put("Коля","Даша");
        hashMap.put("Влад","Катя");
        return hashMap;
    }

    public static void printKey(HashMap<String, String>hashMap){
        Iterator<Map.Entry<String, String>>iterator = hashMap.entrySet().iterator();
        while(iterator.hasNext()){
            Map.Entry<String,String>text = iterator.next();
            System.out.println(text.getKey());
        }

    }
    public static void printValue(HashMap<String, String>hashMap){
        Iterator<Map.Entry<String, String>>iterator = hashMap.entrySet().iterator();
        while(iterator.hasNext()){
            Map.Entry<String,String>text = iterator.next();
            System.out.println(text.getValue());
        }
    }
}
