package com.company.lesson_18;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

// Посчитать сколько дней прошло с начала года. Используйте класс Date.
public class Test_07 {
    public static void main(String[] args) throws ParseException {
        Date todaydate = new Date();
        todaydate.setHours(0);
        todaydate.setMinutes(0);
        todaydate.setSeconds(0);
        todaydate.setMonth(0);
        todaydate.setDate(1);
        Date neyyeardate = new Date();
        long date = todaydate.getTime() - neyyeardate.getTime();
        long Day = 24 * 60 * 60 * 1000;
        int dayCount = (int) (date / Day);
        System.out.println("Дней с Нового года прошло : " + dayCount);
    }
}
