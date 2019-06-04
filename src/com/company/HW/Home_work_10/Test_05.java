package com.company.HW.Home_work_10;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

/*
Есть класс Cat с полем имя (name, String).
Создать коллекцию HashMap<String, Cat>.
Добавить в коллекцию 10 котов, в качестве ключа использовать имя кота из массива:
 String[] cats = new String[] {"васька", "мурка", "дымка", "рыжик", "серый", "снежок", "босс", "борис", "визя", "гарфи"};
 В качестве значения использовать экземпляр кота, с переданным именем из массива в конструктор.
 В классе Cat метод toString() должен переводить переданное в конструктор имя в верхний регистр ( метод toUpperCase() )
Вывести результат на экран, каждый элемент с новой строки.
Вывести результат на экран в виде:
васька - ВАСЬКА
мурка - МУРКА
...
*/
public class Test_05 {
    public static void main(String[] args) {
        String[] cats = new String[]{"васька", "мурка", "дымка", "рыжик", "серый", "снежок", "босс", "борис", "визя", "гарфи"};
        HashMap<String, Cat> text = сatsAddToMap(cats);

        for (Map.Entry<String, Cat> animal: text.entrySet()){
            System.out.println(animal.getValue()+" - "+animal.getKey());
        }

    }

    public static HashMap<String, Cat> сatsAddToMap(String[] cats) {
        HashMap<String, Cat> text = new HashMap<String, Cat>();
        for (String s : cats) {
            text.put(s, new Cat(s));
        }
        return text;
    }

    public static class Cat {
        String name;

        public Cat(String name) {
            this.name = name;
        }


        public String toString() {
            return name != null ? name.toUpperCase() : null;
        }
    }
}


