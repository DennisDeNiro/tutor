package com.company.HW.Home_work_01;

public class Home_work_01 {
    public static void main(String[] args){
        //Цедочисленные типы
        byte a = 127;  //1 byte 8 bit
        short q = 32767; // 2 byte 16 bit
        int i = 2147483647; // 4 byte 32 bit
        long e = 9223372036854775807l; //16 byte 112bit

        //С плавающей точкой
        float f = 4.24f; // 4 byte
        double d = 14.581; // 8 byte

        //Символы
        char c = '7'; //2 byte

        //Булевые значения
        boolean bol = true; //1 byte



        System.out.println(a);
        System.out.println(q);
        System.out.println(i);
        System.out.println(e);

        System.out.println(f);
        System.out.println(d);

        System.out.println(c);

        System.out.println(bol);
    }
}