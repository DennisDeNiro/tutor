package com.company.lesson_28;

/* Или «Корова», или «Кит», или «Собака», или «Неизвестное животное»
Написать метод, который определяет, объект какого класса ему передали, и возвращает результат – одно значение из: «Корова», «Кит», «Собака», «Неизвестное животное».
*/
public class Test_06 {
    public static void main(String[] args) {
        whatTheAnimal(new Cow());
    }

    private static void whatTheAnimal(Object o) {
        if (o instanceof Cow) {
            System.out.println("Я корова");
        }
        if (o instanceof Whale) {
            System.out.println("Я кит");
        }
        if (o instanceof Dog3) {
            System.out.println("Я собака");
        }
        if (o instanceof UnknowgAnimal) {
            System.out.println("Не известное животное ");
        }

    }
}


class Cow {
}

class Whale {
}

class Dog3 {
}

class UnknowgAnimal {
}