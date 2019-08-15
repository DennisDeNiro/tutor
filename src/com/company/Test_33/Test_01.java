package com.company.Test_33;

public class Test_01 {
    public static void main(String[] args) {
        Transaction transaction = new Transaction();
        transaction.setAmount(100);
        transaction.setCurrency(Currency.USD);

//        if (transaction.getCurrency().equals(Currency.USD)) {
//            System.out.println("USD donated. Amount = " + transaction.getAmount());
//        } else if (transaction.getCurrency().equals(Currency.UAH)) {
//            System.out.println("UAH donated. Amount = " + transaction.getAmount());
//        } else {
//
//        }

        switch (transaction.getCurrency()) {
            case UAH:
                System.out.println("UAH donated. Amount = " + transaction.getAmount());
                break;
            case USD:
                System.out.println("USD donated. Amount = " + transaction.getAmount());
                break;
            default:
                System.out.println("Default value.");
                break;
        }

        if(transaction.getCurrency().name().equals("USD")){
            System.out.println(transaction.getCurrency().getValue());
        }

    }
}

