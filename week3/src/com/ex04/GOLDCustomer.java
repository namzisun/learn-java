package com.ex04;

public class GOLDCustomer extends Customer{

    public GOLDCustomer() {
    }

    public GOLDCustomer(int id, String name) {
        super(id, name);
        grade = "GOLD";
    }

    @Override
    public void calcPrice(int price) {
        bonusPoint += price*0.02;
        price *= 0.9;
        showPriceInfo(price);
    }

}
