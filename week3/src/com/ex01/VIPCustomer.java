package com.ex01;

public class VIPCustomer extends Customer {
    public VIPCustomer() {
    }

    public VIPCustomer(int id, String name) {
        super(id, name);
        grade = "VIP";
    }

    @Override
    public int calcPrice(int price) {
        bonusPoint += 0.05 * price;
        price *= 0.9;
        return price;
    }
}
