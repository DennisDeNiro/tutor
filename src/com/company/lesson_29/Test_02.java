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

    public boolean print(){
        if(isAlcoholic()){
            System.out.println("Без алкогольный");
        }
    }
}

class Beer implements Drink1{
    @Override
    public boolean isAlcoholic() {
        return true;
    }

    public boolean print(){
        if (isAlcoholic()){
            System.out.println("Алкогольный");
        }
    }
}