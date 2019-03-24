package com.company.lesson_03;

import javax.imageio.IIOException;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/*
1) Создать метод convert, который должен конвертировать гривны в доллары. В метод должен приходить один аргумент (к-во гривен). Метод должен возвращать к-во долларов.
2) Создать метод percent, который принимает один аргумент (число) и возвращает это же число + 10% от него.
3) Создать метод print, который принимает один аргумент (строку) и выводит эту строку 4 раза в консоль.
*/
public class Test_03 {
    public static void main(String[] args) throws IOException {
        BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
        System.out.println("Введите число");
        String st = bf.readLine();
        int number = Integer.parseInt(st);
//        int s = Integer.parseInt("Text");
        System.out.println("convert = " + convert(number));
        System.out.println("percent = " + percent(number));
//        System.out.println("print = +" + print(s);

    }

    public static double convert(double grivna) {
        return grivna/27.3;
    }

    public static double percent(double number){
        return number*0.1+number;
    }

    public static void print(int s){
        System.out.println(s);
        System.out.println(s);
        System.out.println(s);
        System.out.println(s);
    }
}
