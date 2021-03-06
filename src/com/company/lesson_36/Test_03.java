package com.company.lesson_36;

import java.util.ArrayList;
import java.util.List;

/* Валюты
1. Создать абстрактный класс Money
1.0 Реализуй метод getAmount в классе Money:
1.1. Подумай, какого типа нужно создать приватную переменную, если метод getAmount будет ее возвращать.
1.2. Создай приватную переменную этого типа и верни ее в методе getAmount.
1.3. В конструкторе присвой ей значение, полученное параметром.
1.4. Создай абстрактный метод    String getCurrencyName();
2. В отдельном файле создай класс Hrivna.
3. Наследуй класс Hrivna от класса Money.
4. В классе Hrivna реализуй метод getCurrencyName, который возвращает "HRN".
5. В отдельном файле создай класс USD.
6. Наследуй класс USD от класса Money.
7. В классе USD реализуй метод getCurrencyName, который возвращает "USD".
8. В выполняющем классе Solution создать вложенный класс Person:
8.1 Создать во вложенном классе 2 переменные: name - имя, allMoney - список со всей валютой у объекта.
8.2 В конструкторе присвой значение name, полученное параметром.
8.3 Подумай, объекты каких классов можно добавить в список(лист) allMoney.
8.4 Добавь в конструктор класса Person заполнение листа allMoney объектами всех возможных классов.
9. В выполняющем методе создать объект с типом Person.
10. Вывести на экран надпись типа - person.name + " имеет заначку в размере " + money.getAmount() + " " + money.getCurrencyName()
*/
// TODO: 04.09.2019
public class Test_03 {
    public static void main(String[] args) {
        Hrivna money = new Hrivna(457);
        USD money1 = new USD(55);
        List<Money> list = new ArrayList<>();
        list.add(money);
        list.add(money1);

        Person person = new Person("Vasya", list);
        for (int i = 0; i < person.getList().size(); i++) {
            System.out.println(person.name + " имеет заначку в размере " + person.getList().get(i).getAmount() + person.getList().get(i).getCurrencyName());
        }
    }

    static class Person {
        private String name;
        private List<Money> list = new ArrayList();


        public Person(String name) {
            this.name = name;
        }

        public Person(String name, List<Money> list) {
            this.name = name;

        }

        public String getName() {
            return name;
        }

        public List<Money> getList() {
            return list;
        }

        public void setName(String name) {
            this.name = name;
        }

        public void setList(List<Money> list) {
            this.list = list;
        }


    }
}

abstract class Money {

    private int getAmount;

    public Money(int getAmount) {
        this.getAmount = getAmount;
    }

    int getAmount() {
        return getAmount;
    }

    public abstract String getCurrencyName();
}



