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

    }

    static class Cat {
        private String name;

        public Cat(String name) {
            this.name = name;
        }

        public String getName() {
            return name;
        }

        public void setName(String name) {
            this.name = name;
        }

        @Override
        public String toString() {
            return "Cat{" +
                    "name='" + name + '\'' +
                    '}';
        }
    }

    static class Dog {
        private String name;

        public Dog(String name) {
            this.name = name;
        }

        public String getName() {
            return name;
        }

        public void setName(String name) {
            this.name = name;
        }

        @Override
        public String toString() {
            return "Dog{" +
                    "name='" + name + '\'' +
                    '}';
        }
    }

    private static Set<Cat> createCats() {
        Set<Cat> set = new HashSet<>();
        set.add(new Cat("Мурзик"));
        set.add(new Cat("Тзик"));
        set.add(new Cat("Пузик"));
        set.add(new Cat("Tузик"));
        return set;
    }

    private static Set<String> createDogs() {
        Set<String> set1 = new HashSet<>();
        set1.add("Рокки");
        set1.add("Кетти");
        set1.add("Пират");
        return set1;
    }
// нужно вхять множество
    private static Set<Object> set(Set<Cat> set, Set<Dog> set1) {
        Set<Object> set2 = new HashSet<>();
        set2.addAll(set);
        set2.addAll(set1);
        return set2;
    }

    private static void removeCats(Set<Object> set2, Set<Cat> cats){
        Iterator<Object>iterator = set2.iterator();
        while(iterator.hasNext()){
            if(set2.contains(createCats())){
                set2.remove(createCats());
            }
        }

//        set2.removeAll(cats);
}
    private static void printPets(Set<Object> set2){
        for (Object s : set2) {
            System.out.println(s);
        }
    }
}


