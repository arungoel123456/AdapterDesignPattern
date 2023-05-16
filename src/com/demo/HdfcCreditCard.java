package com.demo;

import com.demo.interfaces.*;

public class HdfcCreditCard implements CreditCard {
    private String cardNumber;
    private int cardLimit;

    public HdfcCreditCard(String cardNumber, int cardLimit) {
        this.cardNumber = cardNumber;
        this.cardLimit = cardLimit;
    }

    @Override
    public String getCardNumber() {
        return cardNumber;
    }

    public void setCardNumber(String cardNumber) {
        this.cardNumber = cardNumber;
    }

    @Override
    public int getCardLimit() {
        return cardLimit;
    }

    public void setCardLimit(int cardLimit) {
        this.cardLimit = cardLimit;
    }
}
