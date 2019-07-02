package com.company.lesson_29;
/* Пиво и кола
Создать интерфейс Drink и классы Cola и Beer
В интерфейсе Drink создай метод isAlcoholic();
Реализуй интерфейс Drink в классах Beer и Cola.
Создать метод print, который должен определить какой напиток пришел ему в параметрах, алкогольный или безалкогольный.
И вывести на экран соответствующую запись.
*/
public class Test_02 {
    public static void main(String[] args) {
          Drink1 drink1 = new Cola();
          Drink1 drink2 = new Beer();
          print(drink1);
          print(drink2);
    }

    private static void print(Drink1 d){
        if (d.isAlcoholic()){
            System.out.println(d.getClass().getSimpleName() + " - aлкогольный напиток");
        }else{
            System.out.println(d.getClass().getSimpleName() + " - bезалкогольный");
        }
    }
}

interface Drink1{
    boolean isAlcoholic();
}

class Cola implements Drink1{
    @Override
    public boolean isAlcoholic() {
        return false;
    }
}

class Beer implements Drink1{
    @Override
    public boolean isAlcoholic() {
        return true;
    }
}