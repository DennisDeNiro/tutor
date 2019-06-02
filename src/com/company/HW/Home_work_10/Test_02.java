package com.company.HW.Home_work_10;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

/*
        Реализовать 4 метода. Они должны возвращать список, который лучше всего подходит для выполнения данных операций
        (быстрее всего справится с большим количеством операций). Ничего измерять не нужно.

        Набор методов:
public static List getListForGet(){}
public static List getListForSet(){}
public static List getListForAddOrInsert(){}
public static List getListForRemove(){}
        */
public class Test_02 {
    public static void main(String[] args) {
        List list = new ArrayList();
        List list2 = new LinkedList();
        System.out.println(getListForGet(list));
        System.out.println(getListForSet(list2));
        System.out.println(getListForAddOrInsert(list2));
        System.out.println(getListForRemove(list2));
    }

    public static List getListForGet(List list) {
        return list;
    }

    public static List getListForSet(List list) {
        return list;
    }

    public static List getListForAddOrInsert(List list) {//add будет быстрее с arraylist insert c linked(смотря в каком случае от 100000==наоборот)
        return list;
    }

    public static List getListForRemove(List list) {// кроме начала списка

        return list;
    }
}
