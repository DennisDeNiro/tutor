package com.company.lesson_36;

public class Hrivna extends Money {
    public Hrivna(int getAmount) {
        super(getAmount);
    }

    @Override
    int getAmount() {
        return super.getAmount();
    }

    @Override
    public String getCurrencyName() {
        return "HRN";
    }
}
