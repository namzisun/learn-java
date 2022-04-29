package com.trans;

public class Student {

    private String name;
    private int grade;
    private int wallet;

    public Student(String name, int wallet) {
        this.name = name;
        this.wallet = wallet;
    }

    public void takeBus(Bus bus) {
        bus.setMoney(1000);
        bus.setPassenger(1);
        wallet -= 1000;
    }

    public void takeSubway(Subway subway) {
        subway.setMoney(1200);
        subway.setPassenger(1);
        wallet -= 1200;
    }

    public void showInfo() {
        System.out.println(name + "님의 남은 돈은 " + wallet + "원 입니다");
    }
}
