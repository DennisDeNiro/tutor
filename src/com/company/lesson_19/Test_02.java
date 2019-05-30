package com.company.lesson_19;

import java.util.ArrayList;
import java.util.Date;
import java.util.LinkedList;
import java.util.List;

/* Измерить сколько времени занимает 10 тысяч вставок для каждого списка
Измерить, сколько времени занимает 10 тысяч вставок для каждого списка.
Метод getTimeMsOfInsert должен вернуть время его исполнения в миллисекундах.
*/
public class Test_02 {
    public static void main(String[] args) {
       List list = new ArrayList();
       List list2 = new LinkedList();
       System.out.println(getTimeMsOfInsert(fill(list)));
       System.out.println(getTimeMsOfInsert(fill(list2)));
    }

    private static List fill(List list){
        for (int i = 0; i < 10000; i++) {
            list.add(new Object());
        }
        return list;
    }

    private static void insertion(List list){
        for (int i = 0; i < 10000; i++) {
            list.add(0, new Object());
        }
    }

    private static long getTimeMsOfInsert(List list) {
        Date startDate = new Date();
        insertion(list);
        Date endDate = new Date();
        return endDate.getTime() - startDate.getTime();
    }
}
//зачем сдесб два листа
