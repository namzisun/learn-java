package com.ex01;

public class Customer {
    public int bonusPoint;
    private int id;
    private String name;
    protected String grade;

    public Customer() {}

    public Customer(int id, String name) {
        this.id = id;
        this.name = name;
        this.grade = "SILVER";
    }

    public int calcPrice(int price) {
        bonusPoint += 0.01 * price;
        return price;
    }

    public String showCustomerInfo() {
        return (name + "님의 등급은 "
                + grade + "이며, 보너스 포인트는 "
                + bonusPoint + "입니다");
    }


}
