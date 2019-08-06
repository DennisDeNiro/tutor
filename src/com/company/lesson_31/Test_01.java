package com.company.lesson_31;

import com.sun.xml.internal.ws.wsdl.writer.document.soap.Body;

//import static com.company.lesson_31.BodyPart.HAND;

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
//public class Test_01 {
//    public static void main(String[] args) {
//        Robot robot = new Robot("Vasya");
//}
//}
//
//class Robot extends AbstractRobot {
//    public Robot(String name) {
//        super(name);
//    }
//
//    public static void doMove(AbstractRobot robotFirst, AbstractRobot robotSecond) {
//        System.out.format("%s атаковал робота %s, атакована %s, защищена %s");
//    }
//}
//
//class BodyPart{
//    private String bodyPart;
//    public final static BodyPart HAND = new BodyPart("HAND");
//    public  final static BodyPart LEG = new BodyPart("LEG");
//    public final static BodyPart GOLOVA = new BodyPart("Golova");
//    public final static BodyPart BODY = new BodyPart("BODY");
//
//
//    public BodyPart(String bodyPart) {
//        this.bodyPart = bodyPart;
//    }
//
//    @Override
//    public String toString() {
//        return this.bodyPart;
//    }
//}
//
//interface Attackable {
//      BodyPart_attack();
//}
//
//interface Defensable {
//      BodyPart_defense();
//}
//
//abstract class AbstractRobot implements Attackable, Defensable {
//    private String name;
//    private static int hitCount;
//
//
//    public AbstractRobot(String name) {
//        this.name = name;
//    }
//
//    public String getName() {
//        return name;
//    }
//
//    public void setName(String name) {
//        this.name = name;
//    }
//
//    public static int getHitCount() {
//        return hitCount;
//    }
//
//    public static void setHitCount(int hitCount) {
//        AbstractRobot.hitCount = hitCount;
//    }
//
//    @Override
//    public BodyPart_attack() {
//         hitCount = (int) (Math.random() * 4);
//        if (hitCount == 0) {
//            return BodyPart.BODY;
//        }
//        if (hitCount == 1) {
//            return 1;
//        }
//        if (hitCount == 2) {
//            return 2;
//        }
//        if (hitCount == 3) {
//            return 3;
//        }
//        return hitCount;
//    }
//
//    @Override
//    public int BodyPart_defense() {
//        int hitCount = (int) (Math.random() * 4);
//        if (hitCount == 0) {
//            return 0;
//        }
//        if (hitCount == 1) {
//            return 1;
//        }
//        if (hitCount == 2) {
//            return 2;
//        }
//        if (hitCount == 3) {
//            return 3;
//        }
//        return hitCount;
//    }
//}