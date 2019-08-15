package com.company.Test_33;

public enum Currency {
    USD("USD Description"),
    UAH("UAH Description");

    private String value;

    Currency(String value) {
        this.value = value;
    }

    public String getValue() {
        return value;
    }
}
