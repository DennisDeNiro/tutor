package com.company.Test_33;

/* Куриная фабрика
Написать Фабрику(Factory) по производству кур(Hen)
1. Создать класс Hen
1.1. Сделать его абстрактным
1.2. Добавить в класс абстрактный метод  int getCountOfEggsPerMonth()
1.3. Добавить в класс метод String getDescription(), который возвращает строку "Я курица."

2. Создать класс RussianHen, который наследуется от Hen
3. Создать класс UkrainianHen, который наследуется от Hen
4. Создать класс MoldovanHen, который наследуется от Hen
5. Создать класс BelarusianHen, который наследуется от Hen

6. В каждом из четырех последних классов написать свою реализацию метода getCountOfEggsPerMonth.
Методы должны возвращать количество яиц в месяц от данного типа куриц.

7. В каждом из четырех последних классов написать свою реализацию метода getDescription.
Методы должны возвращать строку вида:
<getDescription() родительского класса>  + <" Моя страна - Sssss. Я несу N яиц в месяц.">
где Sssss - название страны
где N - количество яиц в месяц

8. В выполняющем классе создать класс HenFactory и реализовать в нём метод getHen,
 который возвращает соответствующую стране породу кур.
 Список стран вынести в отдельный интерфейс Country.
9. Все созданные вами классы должны быть в отдельных файлах
*/
public class Test_02 {
    public static void main(String[] args) {
        Hen hen = new RussianHen(Country.RUSSIAN.getCountry(),25);
        Hen hen1 = new UkrainianHen(Country.UKRAINE.getCountry(), 20);
        Hen hen2 = new MoldovanHen(Country.MOLDOVA.getCountry(), 15);
        Hen hen3 = new BelarusianHen(Country.BELARUSIA.getCountry(), 10);


        System.out.println(hen.getCountOfEggsPerMonth());
        System.out.println(hen1.getCountOfEggsPerMonth());
        System.out.println(hen2.getCountOfEggsPerMonth());
        System.out.println(hen3.getCountOfEggsPerMonth());
    }
}




abstract class Hen {
    private String country;
    private int egg;

    public abstract String getCountOfEggsPerMonth();


    public Hen(String country, int egg) {
        this.country = country;
        this.egg = egg;
    }

    public String getDescription() {
        return "Я курица.";
    }


    public String getCountry() {
        return country;
    }

    public void setCountry(String country) {
        this.country = country;
    }

    public int getEgg() {
        return egg;
    }

    public void setEgg(int egg) {
        this.egg = egg;
    }
}

class RussianHen extends Hen {

    public RussianHen(String country, int egg) {
        super(country, egg);
    }

    @Override
    public String getCountOfEggsPerMonth() {
        return getDescription() + " Моя страна - " + getCountry() + ". Я несу " + getEgg() + " яиц в месяц.";
    }

    @Override
    public String getDescription() {
        return super.getDescription();
    }
}

class UkrainianHen extends Hen {

    public UkrainianHen(String country, int egg) {
        super(country, egg);
    }

    @Override
    public String getCountOfEggsPerMonth() {
        return getDescription() + " Моя страна - " + getCountry() + ". Я несу " + getEgg() + " яиц в месяц.";
    }

    @Override
    public String getDescription() {
        return super.getDescription();
    }
}

class MoldovanHen extends Hen {

    public MoldovanHen(String country, int egg) {
        super(country, egg);
    }

    @Override
    public String getCountOfEggsPerMonth() {
        return getDescription() + " Моя страна - " + getCountry() + ". Я несу " + getEgg() + " яиц в месяц.";
    }

    @Override
    public String getDescription() {
        return super.getDescription();
    }
}

class BelarusianHen extends Hen {

    public BelarusianHen(String country, int egg) {
        super(country, egg);
    }

    @Override
    public String getCountOfEggsPerMonth() {
        return getDescription() + " Моя страна - " + getCountry() + ". Я несу " + getEgg() + " яиц в месяц.";
    }

    @Override
    public String getDescription() {
        return super.getDescription();
    }
}