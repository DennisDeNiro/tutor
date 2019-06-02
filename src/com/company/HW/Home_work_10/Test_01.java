package com.company.HW.Home_work_10;

import java.util.ArrayList;
import java.util.Date;
import java.util.LinkedList;
import java.util.List;

/* Измерить сколько времени занимает 10 тысяч вызовов get для каждого списка
Измерить, сколько времени занимает 10 тысяч вызовов get для каждого списка.
Метод getTimeMsOfGet  должен вернуть время его исполнения в миллисекундах.
*/

//почему когда явно указываеться тип ощыбка
public class Test_01 {
    public static void main(String[] args) {
        List list = new ArrayList();
        List list2 = new LinkedList();
        System.out.println(getTimeMsOfGet(fill(list)));
        System.out.println(getTimeMsOfGet(fill(list2)));
    }

    public static List fill(List list) {
        for (int i = 0; i < 10000; i++) {
            list.add(new Object());
        }
        return list;
    }

    public static List getList(List list) {
        for (int i = 0; i < 10000; i++) {
            list.get(i);
        }
        return list;
    }

    public static long getTimeMsOfGet(List list) {
        Date date = new Date();
        getList(list);
        Date date1 = new Date();
        return date1.getTime() - date.getTime();
    }

}
