package com.company.lesson_31;

import java.lang.ref.PhantomReference;
import java.lang.ref.SoftReference;
import java.lang.ref.WeakReference;

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
        Robot robot = new Robot("Vs", 22, 50);
        Robot robot1 = new Robot("ss", 33, 43);

        doMove(robot, robot1);
        doMove(robot1, robot);
        doMove(robot, robot1);
        doMove(robot1, robot);
        doMove(robot, robot1);
        doMove(robot1, robot);
    }


    public static void doMove(AbstractRobot robotFirst, AbstractRobot robotSecond) {
        System.out.println(String.format("%s атаковал робота %s, атакована %s, защищена %s, сил отнято %s, жизни робота %s"
                , robotFirst.toString(), robotSecond.toString(), robotFirst.attack(), robotSecond.defense()
        ));
//        if (robotFirst.attack() == robotSecond.defense()) {
//            System.out.println("урон не нанесен");
//        } else {
//            System.out.println(robotSecond.defense() + " % " + "урона нанесено");
//        }
//        System.out.println("жизни робота " + robotFirst.power() + " = " + robotFirst.hellspoint() + " - " + robotSecond.hellspoint());
//    }
    }
}
    class Robot extends AbstractRobot {
        public Robot(String name, int power, int hellspoint) {
            super(name, power, hellspoint);
        }
    }

    class BodyPart {
        private String bodyPart;
    public final static BodyPart HAND = new BodyPart("HAND");
    public final static BodyPart LEG = new BodyPart("LEG");
    public final static BodyPart HEAD = new BodyPart("HEAD");
    public final static BodyPart BODY = new BodyPart("BODY");

        public BodyPart(String bodyPart) {
            this.bodyPart = bodyPart;
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
    private static int hitCount;

        private String name;
        private int power;
        private int hellspoint;

        public AbstractRobot(String name, int power, int hellspoint) {
            this.name = name;
            this.power = power;
            this.hellspoint = hellspoint;
        }

        public String getName() {
            return name;
        }

        public void setName(String name) {
            this.name = name;
        }

        public int getPower() {
            return power;
        }

        public void setPower(int power) {
            this.power = power;
        }

        public int getHellspoint() {
            return hellspoint;
        }

        public void setHellspoint(int hellspoint) {
            this.hellspoint = hellspoint;
        }

    public static int getHitCount() {
        return hitCount;
    }

    public static void setHitCount(int hitCount) {
        AbstractRobot.hitCount = hitCount;
    }

        @Override
        public String toString() {
            return this.name;
        }

        @Override
        public BodyPart attack() {
            hitCount = (int) (Math.random() * 4) + 1;

            BodyPart bodyPart = null;
            if (hitCount == 1) {
                bodyPart = BodyPart.HAND;
            } else if (hitCount == 2) {
                bodyPart = BodyPart.LEG;
            } else if (hitCount == 3) {
                bodyPart = BodyPart.HEAD;
            } else if (hitCount == 4) {
                bodyPart = BodyPart.BODY;
            }
            return bodyPart;
        }

        @Override
        public BodyPart defense() {
            hitCount = (int) (Math.random() * 4) + 1;
            if (hitCount == 1) {
                return BodyPart.HAND;
            } else if (hitCount == 2) {
                return BodyPart.LEG;
            } else if (hitCount == 3) {
                return BodyPart.HEAD;
            } else if (hitCount == 4) {
                return BodyPart.BODY;
            } else {
                throw new RuntimeException("Unexpected exception!");
            }
        }
    }

