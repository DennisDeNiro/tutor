package com.company.HW.Home_work_11;
/*
Создать 2 класса Сow и Whale.
В классе Cow создать метод getName(), который возвращает строку "Я - корова".
Унаследовать Whale от Cow
Переопределить метод getName в классе Whale(Кит), чтобы программа выдавала:
Я не корова, Я - кит.
*/
public class Home_work_03 {
    public static void main(String[] args) {
        Cow cow = new Cow("Корова");
        Whale whale = new Whale("Кит");
        cow.getName();
        whale.getName();
    }
}

class Cow{
    private String name;

    public Cow(String name) {
        this.name = name;
    }

    public String getName() {
        System.out.println("Я - корова");
        return name;

    }
}
class Whale extends Cow{
    private String name;

    public Whale(String name) {
        super(name);
    }

    @Override
    public String getName() {
        System.out.println("Я не корова, Я - кит.");
        return name;
    }
}