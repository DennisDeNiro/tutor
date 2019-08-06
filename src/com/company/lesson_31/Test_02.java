package com.company.lesson_31;

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

        doMove(robot, robot1);
        doMove(robot1, robot);
        doMove(robot, robot1);
        doMove(robot1, robot);
        doMove(robot, robot1);
        doMove(robot1, robot);
    }

    public static void doMove(AbstractRobot robotFirst, AbstractRobot robotSecond) {
        System.out.println(String.format("%s атаковал робота %s, атакована %s, защищена %s", robotFirst.toString()
                , robotSecond.toString(), robotFirst.attack(), robotSecond.defense(), robotFirst.power(), robotSecond.power()
                , robotFirst.hellspoint(),robotSecond.hellspoint()));
    }
}

class Robot extends AbstractRobot {
    public Robot(String name) {
        super(name);
    }

    @Override
    public Hellspoint hellspoint() {
        return super.hellspoint();
    }

    @Override
    public Power power() {
        return super.power();
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

interface Power {
    Power power();
}

interface Hellspoint {
    Hellspoint hellspoint();
}

abstract class AbstractRobot implements Attackable, Defensable, Power, Hellspoint {
    private String name;
    private static int hitCount;
    private static int power;
    private static int hellspoint;


    public AbstractRobot(String name) {
        this.name = name;
    }

    public AbstractRobot(int power) {
        this.power = power;
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

    public static int getPower() {
        return power;
    }

    public static void setPower(int power) {
        AbstractRobot.power = power;
    }

    public static int getHellspoint() {
        return hellspoint;
    }

    public static void setHellspoint(int hellspoint) {
        AbstractRobot.hellspoint = hellspoint;
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

    public Power power() {
        power = (int) (Math.random() * 4) + 1;
        if (power == 1) {
            return (Power) BodyPart.HAND;
        } else if (power == 2) {
            return (Power) BodyPart.LEG;
        } else if (power == 3) {
            return (Power) BodyPart.HAND;
        } else if (power == 4) {
            return (Power) BodyPart.BODY;
        } else
            throw new RuntimeException("UnexpectedPOWER exeption!");
    }

    @Override
    public Hellspoint hellspoint() {
        power = (int) (Math.random() * 4) + 1;
        if (power == 1) {
            return (Hellspoint) BodyPart.HAND;
        } else if (power == 2) {
            return (Hellspoint) BodyPart.LEG;
        } else if (power == 3) {
            return (Hellspoint) BodyPart.HAND;
        } else if (power == 4) {
            return (Hellspoint) BodyPart.BODY;
        } else
            throw new RuntimeException("UnexpectedHellspoint exeption!");
    }
}
