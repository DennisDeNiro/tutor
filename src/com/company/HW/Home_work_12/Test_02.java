package com.company.HW.Home_work_12;
/*
1. Создать интерфейс Weather с методом getWeatherType().
2. Создать интерфейс WeatherType с перечнем погодных условий.
3. В классе Today реализовать интерфейс Weather.
4. В классе Today создать переменную String type;
5. Подумай, как связан параметр String type с методом getWeatherType().
6. Переопределить метод toString() в классе Today, что бы он выводил на экран надпись %s for today, где %s - тип погоды
*/
public class Test_02 {
    public static void main(String[] args) {
        Today td = new Today();
        td.toString();
    }
}

interface Weather {
    void getWeatherType();
}

interface WeatherType{
   String weatherTypeWinter = "Snow";
   String weatherTypeSun = "Sun";
   String weahterTypeRain = "Rain";
}

class Today implements Weather{
    public String type;

    @Override
    public void getWeatherType() {
        this.type = type;
    }

    @Override
    public String toString() {
        return String.format("%s+ for today",type);
    }
}