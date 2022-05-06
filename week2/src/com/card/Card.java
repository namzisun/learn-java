package com.card;

public class Card {
    private static int cardSerialNumber = 10000;
    private int cardNumber;

    public Card() {
        cardNumber = ++cardSerialNumber;
    }

    public int getCardNumber() {
        return cardNumber;
    }
}
