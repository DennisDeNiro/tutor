package com.company.lesson_34;

import com.company.lesson_01.User;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.LinkedList;
import java.util.List;

/* User, Looser, Coder and Proger
1. Ввести [в цикле] с клавиатуры несколько строк (ключей).
Строки(ключи) могут быть такими: "user", "looser", "coder", "proger".
Ввод окончен, когда строка не совпадает ни с одной из выше указанных.
1.1. Создать интерфейс Person, в нём создать 4 вложенных класса:
- User, с методом live() - который выводит на экран строку типа Usually I just live.
- Looser, с методом doNothing() - который выводит на экран строку типа Usually I do nothing.
- Coder, с методом coding() - который выводит на экран строку типа Usually I create code.
- Proger, с методом enjoy() - который выводит на экран строку типа Wonderful life!.
2. Для каждой введенной строки нужно:
2.1. Создать соответствующий объект [см Person.java], например, для строки "user" нужно создать объект класса User.
2.2. Передать этот объект в метод doWork.
3. Написать реализацию метода doWork, который:
3.1. Вызывает метод live() у переданного обекта, если этот объект (person) имеет тип User.
3.2. Вызывает метод doNothing(), если person имеет тип Looser.
3.3. Вызывает метод coding(), если person имеет тип Coder.
3.4. Вызывает метод enjoy(), если person имеет тип Proger.
*/
public class Test_01 {
    public static void main(String[] args) throws IOException {
        BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
        String key = null;
        while (true) {
            key = bf.readLine();
            if (key.equals("user")) {
                Person p = new Person.User();
                doWork(p);
            }
            if (key.equals("looser")) {
                Person p1 = new Person.Looser();
                doWork(p1);
            }
            if (key.equals("coder")) {
                Person p2 = new Person.Coder();
                doWork(p2);
            }
            if (key.equals("proger")) {
                Person p3 = new Person.Proger();
                doWork(p3);
            } else {
                break;
            }
        }
    }

    public static void doWork(Person person) {
        if (person instanceof Person.User) {
            ((Person.User) person).live();
        }
        if (person instanceof Person.Looser) {
            ((Person.Looser) person).doNothing();
        }
        if (person instanceof Person.Coder) {
            ((Person.Coder) person).coding();
        }
        if (person instanceof Person.Proger) {
            ((Person.Proger) person).enjoy();
        }
    }
}

interface Person {
    class User implements Person {
        void live() {
            System.out.println("Usually I just live.");
        }
    }

    class Looser implements Person {
        void doNothing() {
            System.out.println("Usually I do nothing.");
        }
    }

    class Coder implements Person {
        void coding() {
            System.out.println("Usually I create code.");
        }
    }

    class Proger implements Person {
        void enjoy() {
            System.out.println("Wonderful life!.");
        }
    }
}