package com.company.Test_33;

public enum Country {
    RUSSIAN("Россия"),
    UKRAINE("Украина"),
    MOLDOVA("Молдова"),
    BELARUSIA("Беларуссия");

    private String country;

    Country(String country) {
        this.country = country;
    }


    public String getCountry() {
        return country;
    }
}
