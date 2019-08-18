package com.company.lesson_33;

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
        Hen hen = new RussianHen(Country.RUSSIAN.getCountry(), 25);
        Hen hen1 = new UkrainianHen(Country.UKRAINE.getCountry(), 20);
        Hen hen2 = new MoldovanHen(Country.MOLDOVA.getCountry(), 15);
        Hen hen3 = new BelarusianHen(Country.BELARUSIA.getCountry(), 10);

        System.out.println(hen.getDescription());
        System.out.println(hen1.getDescription());
        System.out.println(hen2.getDescription());
        System.out.println(hen3.getDescription());

        System.out.println();
    }
     public  class HenFactory{
        public String getHen(String country){
            if (Country.RUSSIAN.equals(getHen(country))){
               return "Это порода кур России";
            }else if (Country.UKRAINE.equals(getHen(country))){
                return "Это порода кур Украины";
            }else if (Country.MOLDOVA.equals(getHen(country))){
                return "Это порода кур Молдовы";
            }else if (Country.BELARUSIA.equals(getHen(country))){
                return "Это порода кур Беларусь";
            }
            return country;
        }
//           switch (Country.valueOf(country)){
//               case RUSSIAN:
//                   System.out.println("Это порода кур России");
//               case UKRAINE:
//                   System.out.println("Это порода кур Украины");
//               case MOLDOVA:
//                   System.out.println("Это порода кур Молдовы");
//               case BELARUSIA:
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