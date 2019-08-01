package com.company.lesson_31;

import java.util.logging.Handler;

/* Битва роботов
1. Создать класс Robot, BodyPart интерфейсы Attackable,Defensable и абстрактный класс AbstractRobot
2. В классе BodyPart создать переменную String bodyPart; добавить 4 объекта - части тела ( рука, нога, голова, грудь).
 Сделать объекты неизменяемыми.
3. В интерфейсе Attackable создать метод BodyPart attack();
4. В интерфейсе Defensable создать метод BodyPart defense();
5. В классе AbstractRobot создать переменные private String name; private static int hitCount;
6 В классе AbstractRobot создать логику атаки и защиты. Реализовать интерфейсы Attackable и Defensable
6.1 В методах attack() и defense() инициализировать переменную hitCount рандомным числом от 1 до 4.
    В зависимости от результата инициализации должна быть атакована и защищена определенная часть тела робота.
7. Унаследовать класс Robot от AbstractRobot. В классе Robot создать конструктор супер класса.
8. В выполняющем классе создать метод doMove(AbstractRobot robotFirst, AbstractRobot robotSecond).
8.1 В методе doMove реализовать логику вывода на экран надписи "%s атаковал робота %s, атакована %s, защищена %s"
*/
public class Test_02 {
    public static void main(String[] args) {
        Robot robot = new Robot("Vs");
        Robot robot1 = new Robot("sse");

    }
}

class Robot extends AbstractRobot {
    public Robot(String name) {
        super(name);
    }

    public static void doMove(AbstractRobot robotFirst, AbstractRobot robotSecond) {
        System.out.format("%s атаковал робота %s, атакована %s, защищена %s");
    }
}

class BodyPart {
    private String bodyPart;
    public final static BodyPart Hand = new BodyPart("HAND");
    public final static BodyPart Leg = new BodyPart("LEG");
    public final static BodyPart Head = new BodyPart("HEAD");
    public final static BodyPart Body = new BodyPart("BODY");

    public BodyPart(String bodyPArt) {
        this.bodyPart = bodyPArt;
    }

    @Override
    public String toString() {
        return this.bodyPart;
    }
}

interface Attackable {
    BodyPart attack();
}

interface Defensable {
    BodyPart defense();
}

abstract class AbstractRobot implements Attackable, Defensable {
    private String name;
    private static int hitCount;

    public AbstractRobot(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public static int getHitCount() {
        return hitCount;
    }

    public static void setHitCount(int hitCount) {
        AbstractRobot.hitCount = hitCount;
    }

    @Override
    public BodyPart attack() {
        hitCount = (int) (Math.random() * 4) + 1;
        if (hitCount == 1) {
            return BodyPart.Hand;
        } else if (hitCount == 2) {
            return BodyPart.Leg;
        } else if (hitCount == 3) {
            return BodyPart.Head;
        } else if (hitCount == 4) {
            return BodyPart.Body;
        }
        return attack();
    }

    @Override
    public BodyPart defense() {
        hitCount = (int) (Math.random() * 4) + 1;
        if (hitCount == 1) {
            return BodyPart.Hand;
        } else if (hitCount == 2) {
            return BodyPart.Leg;
        } else if (hitCount == 3) {
            return BodyPart.Head;
        } else if (hitCount == 4) {
            return BodyPart.Body;
        }
        return defense();
    }
}