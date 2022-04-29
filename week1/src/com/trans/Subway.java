package com.trans;

public class Subway {
    private int line;
    private int passenger;
    private int money;

    public Subway(int line) {
        this.line = line;
        this.passenger = 0;
        this.money = 0;
    }

    public int getLine() {
        return line;
    }

    public void setLine(int line) {
        this.line = line;
    }

    public int getPassenger() {
        return passenger;
    }

    public void setPassenger(int passenger) {
        this.passenger += passenger;
    }

    public int getMoney() {
        return money;
    }

    public void setMoney(int money) {
        this.money += money;
    }

    public void showSubwayInfo() {
        System.out.println(line + "번 지하철의 승객은 " + passenger + "명 이고, 수입은 " + money + "원 입니다");
    }
}
