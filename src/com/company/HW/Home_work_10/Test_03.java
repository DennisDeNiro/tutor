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
public class Test_03 {
    public static void main(String[] args) {
        Set<String>set = new HashSet<>();
        set.add("арбуз");
        set.add("банан");
        set.add("вишня");
        set.add("груша");
        set.add("дыня");
        toScreen(set);
        for(int i=0; i<set.size();i++) {
            System.out.print(toScreen(set));//получаеться чтоб сделать списо нужно создавать метод?
        }
    }

    public static Set toScreen(Set<String>set){
        Iterator<String> iterator = set.iterator();
           return set;
    }
}
