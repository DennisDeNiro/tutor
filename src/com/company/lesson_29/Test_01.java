package com.company.lesson_29;
/*
    Создать интерфейс Drink и класс AlcoholicBeer
    В интерфейсе Drink создай метод isAlcoholic();
    Добавь к классу AlcoholicBeer интерфейс Drink и реализуй все нереализованные методы.
    Метод  toString в классе AlcoholicBeer должен выводить на экран "Напиток алкогольный", если isAlcoholic() возвращает true,
    иначе вывести на экран надпись "Напиток безалкогольный".
*/
public class Test_01 {
    public static void main(String[] args) {
       Drink drink = new AlcoholicBeer();
        System.out.println(drink.toString());
    }
}

interface Drink{
    boolean isAlcoholic();
}

class AlcoholicBeer implements Drink{

    @Override
    public boolean isAlcoholic() {

        return true;
    }

    @Override
    public String toString() {
        String alcoholic = "";
        alcoholic += " " + ((isAlcoholic() ? "алко" : "не алко"));
        return alcoholic;
    }
}