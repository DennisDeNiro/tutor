package com.company.lesson_20;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

/* Удалить все числа больше 10
Создать множество чисел(Set<Integer>), занести туда 5 различных чисел.
При помощи метода  removeAllNumbersMoreThan10 удалить из множества все числа больше 10.
*/
public class Test_03 {
    public static void main(String[] args) {
       removeAllNumbersMoreThan10(setInteger());
    }

    public static Set<Integer> setInteger(){
        Set<Integer> set = new HashSet<>();
        set.add(0);
        set.add(5);
        set.add(10);
        set.add(15);
        set.add(20);
        return set;
    }

    public static void removeAllNumbersMoreThan10(Set<Integer>set){
        Iterator<Integer>iterator = set.iterator();
        while (iterator.hasNext()){
            int number = iterator.next();
            if (number>10){
                iterator.remove();
            }else
                System.out.println(number);
        }
    }
}

