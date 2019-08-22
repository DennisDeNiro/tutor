package com.company.lesson_33;

import static com.company.lesson_33.Country.*;

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
        System.out.println(HenFactory.getHen(RUSSIAN));
        System.out.println(HenFactory.getHen(UKRAINE));
        System.out.println(HenFactory.getHen(BELARUSSIA));
        System.out.println(HenFactory.getHen(MOLDOVA));
    }

   public static class HenFactory{
        public static Hen getHen(Country country){
            switch (country) {
                case RUSSIAN:
                    return new RussianHen(RUSSIAN.getCountry(), 23);
                case UKRAINE:
                    return new UkrainianHen(UKRAINE.getCountry(), 20);
                case MOLDOVA:
                    return new MoldovanHen(MOLDOVA.getCountry(), 15);
                case BELARUSSIA:
                    return new BelarusianHen(BELARUSSIA.getCountry(), 10);
                default:
                    throw new IllegalArgumentException("Argument country is invalid");
            }
        }

//           switch (Country.valueOf(country)){
//               case RUSSIAN:
//                   System.out.println("Это порода кур России");
//               case UKRAINE:
//                   System.out.println("Это порода кур Украины");
//               case MOLDOVA:
//                   System.out.println("Это порода кур Молдовы");
//               case BELARUSSIA:
//                   System.out.println("Это порода кур Беларусь");
//           }
//           return country;
//        }
    }
}

abstract class Hen {
    private String country;
    private int egg;

    public abstract int getCountOfEggsPerMonth();


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
    public int getCountOfEggsPerMonth() {
        return this.getEgg();
    }

    @Override
    public int getEgg() {
        return super.getEgg();
    }

    @Override
    public String getDescription() {
        return super.getDescription() + " Моя страна - " + getCountry() + ". Я несу " + getEgg() + " яиц в месяц.";
    }
}

class UkrainianHen extends Hen {

    @Override
    public int getCountOfEggsPerMonth() {
        return this.getEgg();
    }

    public UkrainianHen(String country, int egg) {
        super(country, egg);
    }


    @Override
    public String getDescription() {
        return super.getDescription() + " Моя страна - " + getCountry() + ". Я несу " + getEgg() + " яиц в месяц.";
    }
}

class MoldovanHen extends Hen {

    public MoldovanHen(String country, int egg) {
        super(country, egg);
    }

    @Override
    public int getCountOfEggsPerMonth() {
        return this.getEgg();
    }

    @Override
    public String getDescription() {
        return super.getDescription() + " Моя страна - " + getCountry() + ". Я несу " + getEgg() + " яиц в месяц.";
    }
}

class BelarusianHen extends Hen {

    public BelarusianHen(String country, int egg) {
        super(country, egg);
    }

    @Override
    public int getCountOfEggsPerMonth() {
        return this.getEgg();
    }

    @Override
    public String getDescription() {
        return super.getDescription() + " Моя страна - " + getCountry() + ". Я несу " + getEgg() + " яиц в месяц.";
    }
}