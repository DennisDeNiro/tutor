package lesson_36;

/*
1.1 Создать класс Constants с переменными:
String WANT_STRING = "Я хочу ездить на ";
String LUXURIOUS_CAR = "роскошной машине";
String CHEAP_CAR = "дешевой машине";
String FERRARY_NAME = "Феррари";
String LANOS_NAME = "Ланосе";
1.2 Для вывода использовать можно только переменные из класса Constants.
2. Создать класс Ferrari, реализуйте метод printlnDesire, чтобы он выводил на экран "Я хочу ездить на Феррари".
3. Создать класс Lanos, реализуйте метод printlnDesire, чтобы он выводил на экран "Я хочу ездить на Ланосе".
4. Создайте класс LuxuriousCar(РоскошнаяМашина).
5. Создайте класс CheapCar(ДешеваяМашина).
6. Унаследуйте Ferrari и Lanos от CheapCar и LuxuriousCar, подумайте, какой класс для кого.
7. В классе LuxuriousCar реализуйте метод printlnDesire, чтобы он выводил на экран "Я хочу ездить на роскошной машине".
8. В классе CheapCar реализуйте метод printlnDesire, чтобы он выводил на экран "Я хочу ездить на дешевой машине".
9. В класах LuxuriousCar и CheapCar для метода printlnDesire расставьте различными способами модификаторы доступа так,
чтобы в классах Ferrari и Lanos выполнялось расширение видимости.
10. В выполняющем методе вызовите метод printlnDesire() у всех классов, в который он реализован.
*/
public class Test_02 {
    public static void main(String[] args) {
        Ferrari f = new Ferrari();
        Lanos l = new Lanos();
        CheapCar c = new CheapCar();
        LuxuriousCar lux = new LuxuriousCar();
        System.out.println(f.printlnDesire());
        System.out.println(l.printlnDesire());
        System.out.println(c.printlnDesire());
        System.out.println(lux.printlnDesire());

    }
}

interface Constants {
    String WANT_STRING = "Я хочу ездить на ";
    String LUXURIOUS_CAR = "роскошной машине";
    String CHEAP_CAR = "дешевой машине";
    String FERRARY_NAME = "Феррари";
    String LANOS_NAME = "Ланосе";
}

class Ferrari extends LuxuriousCar{
    protected String printlnDesire() {
        return Constants.WANT_STRING+Constants.FERRARY_NAME;
    }
}

class Lanos extends CheapCar {
   protected String printlnDesire() {
        return Constants.WANT_STRING+Constants.LANOS_NAME;
    }
}

class LuxuriousCar  {

    String printlnDesire() {
        return Constants.WANT_STRING+Constants.LUXURIOUS_CAR;
    }
}

class CheapCar {

    String printlnDesire() {
        return Constants.WANT_STRING+Constants.CHEAP_CAR;
    }
}