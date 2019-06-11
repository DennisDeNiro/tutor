package com.company.lesson_22;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

/* Множество всех животных
1. Внутри класса Solution создать public static классы Cat, Dog.
2. Реализовать метод createCats, котороый должен возвращать множество с 4 котами.
3. Реализовать метод createDogs, котороый должен возвращать множество с 3 собаками.
4. Реализовать метод join, котороый должен возвращать объединенное множество всех животных - всех котов и собак.
5. Реализовать метод removeCats, котороый должен удалять из множества pets всех котов, которые есть в множестве cats.
6. Реализовать метод printPets, котороый должен выводить на экран всех животных, которые в нем есть. Каждое животное с новой строки
*/
public class Test_04 {
    public static void main(String[] args) {
        Cat cat = new Cat();
        Dog dog = new Dog();
//        removeCats();
//        Set<String>set = set();
    }

    static class Cat {

    }

    static class Dog {

    }

    private static Set<String> createCats() {
        Set<String> set = new HashSet<>();
        set.add("Мурзик");
        set.add("Тзик");
        set.add("Пузик");
        set.add("Tузик");
        return set;
    }

    private static Set<String> createDogs() {
        Set<String> set1 = new HashSet<>();
        set1.add("Рокки");
        set1.add("Кетти");
        set1.add("Пират");
        return set1;
    }

    private static Set<String> set(Set set, Set set1) {
        Set<Set> set2 = new HashSet<>();
        set2.add(set);
        set2.add(set1);
        return set;
    }

    private static Set<String> removeCats(Set<String>set2){
        Iterator<String>iterator = set2.iterator();
        while(iterator.hasNext()){
            if(set2.contains(createCats())){
                set2.remove(createCats());
            }
        }
        return set2;
    }
//    private static Set<String> printPets(Set<String>set2){
//     Set<String>set = removeCats();
//        return set;
//    }
}


