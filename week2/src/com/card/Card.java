package com.card;

public class Card {
    private static int cardSerialNumer = 10000;
    private int cardNumber;

    public Card() {
        cardNumber = ++cardSerialNumer;
    }

    public int getCardNumber() {
        return cardNumber;
    }
}
