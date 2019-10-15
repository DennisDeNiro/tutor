package com.company.lesson_42;

/*
1. В выполняющем классе создать переменную isStopped, присвоить ей значение false
2. Создать класс Clock, унаследовать его от Thread
3. В классе Clock:
- создать параметры cityName, hours, minutes, seconds - пдумать, какой тип у каждого параметра
- создать конструктор и инициализировать все параметры класса, так же запустить нить в конструкторе
- создать и реализовать логику метода printTime так, чтобы каждую секунду выдавалось время начиная с установленного в конструкторе
Пример:
В г. Лондон сейчас 23:59:58!
В г. Лондон сейчас 23:59:59!
В г. Лондон сейчас полночь!
В г. Лондон сейчас 0:0:1!
- создать метод run:
 -- пока переменная isStopped равняется false выполнять метод printTime;
 -- отлавливать все checked исключения.
4. В выполняющем методе:
- создать объект класса Clock
- отправить главную нить в сон на 4 секунды
- поменять значение переменной isStopped на true
- отправить главную нить в сон на 1 секунду
*/

public class Test_05London {
    static boolean isStopped = false;

    public static void main(String[] args) throws InterruptedException {
        Clock clock = new Clock("Лондон", 23, 59, 59);
        Thread.sleep(4000);
        isStopped = true;
        Thread.sleep(1000);
    }

    public static class Clock extends Thread {
        private String cityName;
        private int hours;
        private int minutes;
        private int seconds;

        public Clock(String cityName, int hours, int minutes, int seconds) {
            this.cityName = cityName;
            this.hours = hours;
            this.minutes = minutes;
            this.seconds = seconds;
            start();
        }

        public void printTime() throws InterruptedException {
           seconds++;
            if (seconds == 60) {
                minutes++;
                seconds = 0;
                 if (minutes == 60) {
                    hours++;
                    minutes = 0;
                    seconds = 0;
                    if (hours == 24) {
                        hours = 0;
                    }
                }
            }
            Thread.sleep(1000);
            if (hours == 0 && minutes == 0 && seconds == 0) {
                System.out.println(String.format("в г.%s сейчас полночь!", cityName));
            } else {
                System.out.println(String.format("в г.%s сейчас  %d:%d:%d", cityName, hours, minutes, seconds));
            }
        }


        @Override
        public void run() {
            while (!isStopped) {
                try {
                    printTime();
                } catch (Exception e) {
                    e.printStackTrace();
                }
            }
        }
    }


}
