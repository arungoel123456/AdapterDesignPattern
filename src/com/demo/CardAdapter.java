package com.demo;

import com.demo.interfaces.*;

public class CardAdapter implements BankAccount {

    private CreditCard creditCard;

    public CardAdapter(CreditCard creditCard) {
        this.creditCard = creditCard;
    }

    @Override
    public String getAccountNumber() {
        return creditCard.getCardNumber();
    }

    @Override
    public int getBalance() {
        return creditCard.getCardLimit();
    }
}
