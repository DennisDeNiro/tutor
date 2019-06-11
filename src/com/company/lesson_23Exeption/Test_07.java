package com.company.lesson_23Exeption;

import java.util.HashMap;
import java.util.Map;

/* Исключение при работе с коллекциями Map
Перехватить исключение (и вывести его на экран), указав его тип, возникающее при выполнении кода:
Map<String, String> map = new HashMap<String, String>(null);
map.put(null, null);
map.remove(null);
*/
public class Test_07 {
    public static void main(String[] args) {
        try{
            Map<String, String> map = new HashMap<String, String>(null);
            map.put(null, null);
            map.remove(null);
        }catch (NullPointerException e){
            System.out.println("NullPointer exc");
        }
    }
}
