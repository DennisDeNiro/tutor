package com.company.HW.Home_work_12;
/*
1. Создать класс EnglishTranslator, который наследуется от абстрактного класса Translator.
   В классе Translator создать абстрактный метод getLanguage() и не абстрактный метод
    public String translate(), который возвращает строку "Я переводчик с " + getLanguage();
2. Реализовать все абстрактные методы.
3. Подумай, что должен возвращать метод getLanguage.
4. Программа должна выводить на экран "Я переводчик с английского".
5. Создать класс GermanyTranslator, который наследуется от абстрактного класса Translator.
6. Реализовать все абстрактные методы.
7. Подумай, что должен возвращать метод getLanguage.
8. Программа должна выводить на экран "Я переводчик с немецкого".
*/
public class Test_01 {
    public static void main(String[] args) {
        EnglishTranslator e = new EnglishTranslator();
        GermanyTranslator g = new GermanyTranslator();
        System.out.println(e.translate());
        System.out.println(g.translate());
    }
}

abstract class Translator{
    abstract String getLanguage();

    public String translate(){
        return String.format("Я переводчик с " + getLanguage());
    }
}
class EnglishTranslator extends Translator{
    @Override
    String getLanguage() {
        return String.format("Английского");
    }
}

class GermanyTranslator extends Translator{
    @Override
    String getLanguage() {
        return String.format("Немецкого");
    }
}