package com.company.HW.Home_work_10;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

/*
Создать коллекцию HashSet с типом элементов String.
Добавить в неё 5 строк: арбуз, банан, вишня, груша, дыня.
Вывести содержимое коллекции на экран, каждый элемент с новой строки.
Посмотреть, как изменился порядок добавленных элементов.
*/
public class Test_03a {
    public static void main(String[] args) {
        System.out.print(setIterator(setInteger()));
        System.out.print(setInteger());
    }

    public static Set<String> setInteger() {
        Set<String> set = new HashSet<>();
        set.add("арбуз");
        set.add("банан");
        set.add("вишня");
        set.add("груша");
        set.add("дыня");
        return set;
    }

    public static Set<String> setIterator(Set<String> set) {
        Iterator<String> iterator = set.iterator();
        return set;
    }
}
