package com.company.lesson_23Exeption;

import com.company.lesson_01.User;

import java.util.HashMap;
import java.util.Map;

/*
*
* 0[LinkedList<Map.Entry> 16, 32] 1[LinkedList<Map.Entry> 33] 2[] 3[] 4[36] 5[5] 6[] [] [] [] [] [] ... // size = 16 -> 32 // 5 % 32 // loadFactor = 0.75
*
*/
public class Test_01 {
    public static void main(String[] args) {
        Map<Integer, String> map = new HashMap<Integer, String>();
        map.put(5, "text1");
        map.put(16, "text2");
        map.put(16, "te");
        map.put(32, "text2");
        map.put(33, "text3");
        map.put(36, "text4");

        String str = "text";
        str = str.substring(1,3);
        System.out.println(str);

        for (Map.Entry<Integer, String> entry : map.entrySet()) {
            System.out.println(entry);
        }
    }
}
