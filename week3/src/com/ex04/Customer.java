package com.ex04;

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
        bonusPoint = 0;
    }

    public void calcPrice(int price) {
        bonusPoint += 0.01 * price;
        showPriceInfo(price);
    }

    public void showPriceInfo(int price) {
        System.out.println(name + "님이 " + price + "원 지불하셨습니다.");
        System.out.println(name + "님의 현재 보너스 포인트는 " + bonusPoint + "점입니다.");
    }

    public String showCustomerInfo() {
        return (name + "님의 등급은 "
                + grade + "이며, 보너스 포인트는 "
                + bonusPoint + "입니다");
    }


}
