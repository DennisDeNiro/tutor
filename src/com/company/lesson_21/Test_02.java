package com.company.lesson_21;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

/* Удалить людей, имеющих одинаковые имена
Создать словарь (Map<String, String>) занести в него десять записей по принципу «фамилия» - «имя».
Удалить людей, имеющих одинаковые имена.

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
*/
public class Test_02 {
    public static void main(String[] args) {
        Map<String, String> map = takeMap();
        deleteName(map);
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

    private static Map.Entry<String, String> deleteName(Map<String, String> map) {
        Iterator<Map.Entry<String, String>> iterator = map.entrySet().iterator();
        int count=0;
        while (iterator.hasNext()) {
            Map.Entry<String, String> text = iterator.next();
            if (text.getValue() != text.getValue() + 1) {
                return text;
            }else{
                count++;
            }

        }

        return (Map.Entry<String, String>) iterator;
    }
}
