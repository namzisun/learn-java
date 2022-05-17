package com.ex04;

public class VIPCustomer extends Customer {
    private int csNum;

    public VIPCustomer() {
    }

    public VIPCustomer(int id, String name) {
        super(id, name);
        grade = "VIP";
        csNum = 12345;
    }

    @Override
    public void calcPrice(int price) {
        bonusPoint += 0.05 * price;
        price *= 0.9;
        showPriceInfo(price);
    }

    @Override
    public String showCustomerInfo() {
        return (super.showCustomerInfo() + ". 담당 상담원 번호는 " + csNum + "입니다");
    }
}
