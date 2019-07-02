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
          Drink1 drink1 =new Cola();
        System.out.println(print());
    }
    private static void print(Drink1 d){
        if (d.isAlcoholic()){
            System.out.println("Алкогольный напиток");
        }else{
            System.out.println("Без алкогольный");
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