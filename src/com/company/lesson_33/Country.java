package com.company.lesson_33;

public enum Country {
    RUSSIAN("Россия"),
    UKRAINE("Украина"),
    MOLDOVA("Молдова"),
    BELARUSSIA("Беларуссия");

    private String country;

    Country(String country) {
        this.country = country;
    }


    public String getCountry() {
        return country;
    }
}
