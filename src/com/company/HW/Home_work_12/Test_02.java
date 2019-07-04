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
        Today td = new Today(WeatherType.WEATHER_TYPE_RAIN);
        System.out.println(td);

        Today td1 = new Today();
        td1.setType(WeatherType.WEATHER_TYPE_SUN);
        System.out.println(td1);
    }
}

interface Weather {
    String getWeatherType();
}

interface WeatherType{
   public final static String WEATHER_TYPE_WINTER = "Snow";
   String WEATHER_TYPE_SUN = "Sun";
   String WEATHER_TYPE_RAIN = "Rain";
}

class Today implements Weather{
    private String type;
    public Today() {
    }
    public Today(String type) {
        this.type = type;
    }

    @Override
    public String getWeatherType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    @Override
    public String toString(){
        return String.format("%s for today", getWeatherType());
    }
}