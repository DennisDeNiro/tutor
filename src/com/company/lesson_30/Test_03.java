package com.company.lesson_30;
/*
1. Создать классы Person, RepkaStory и интерфейс RepkaItem
2. В интерфейсе RepkaItem создать метод String getNamePadezh();
3. Реализовать интерфейс RepkaItem в классе Person.
5. В классе Person создать переменные  String name, String namePadezh;
6. В классе Person реализовать метод pull(Person person), который выводит фразу типа '<name> за <person>'. Пример:
Бабка за Дедку
Дедка за Репку
7. Создать метод tell в классе RepkaStory.
8. С помощью цикла реализовать метод tell, который должен выполнять логику вывода на экран с помощью метода pull(Person person)
9. Выполнить метод main
 List<Person> plot = new ArrayList<Person>();
        plot.add(new Person("Репка", "Репку"));
        plot.add(new Person("Дедка", "Дедку"));
        plot.add(new Person("Бабка", "Бабку"));
        plot.add(new Person("Внучка", "Внучку"));
        RepkaStory.tell(plot);
*/

import javax.rmi.CORBA.Util;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class Test_03 {
    public static void main(String[] args) {
        List<Person> plot = new ArrayList<Person>();
        plot.add(new Person("Репка", "Репку"));
        plot.add(new Person("Дедка", "Дедку"));
        plot.add(new Person("Бабка", "Бабку"));
        plot.add(new Person("Внучка", "Внучку"));
        RepkaStory.tell(plot);
    }
}

class Person implements RepkaItem {
    private String name;
    private String namePadezh;

    public Person(String name, String namePadezh) {
        this.name = name;
        this.namePadezh = namePadezh;
    }

    @Override
    public String getNamePadezh() {
        return namePadezh;
    }

    public String pull(Person person) {
        return String.format(person.name + "за" + person.getNamePadezh());
    }
}

class RepkaStory {
    public static void tell(List<Person> plot) {
                for (int i = 0; i < plot.size(); i++) {
                    System.out.println(plot.get(i));
        }
    }
}

interface RepkaItem {
    String getNamePadezh();
}
