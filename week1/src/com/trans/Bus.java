package com.trans;

public class Bus {
    private int number;
    private int passenger;
    private int money;

    public Bus(int number) {
        this.number = number;
        this.passenger = 0;
        this.money = 0;
    }

    public int getNumber() {
        return number;
    }

    public void setNumber(int number) {
        this.number = number;
    }

    public int getPassenger() {
        return passenger;
    }

    public void setPassenger(int passenger) {
        this.passenger = passenger;
    }

    public int getMoney() {
        return money;
    }

    public void setMoney(int money) {
        this.money = money;
    }

    public void plusPassenger() {
        passenger++;
        money += 1000;
    }

    public void minusPassenger() {
        passenger--;
    }

    public void showBusInfo() {
        System.out.println(number + "번 버스의 승객은 " + passenger + "명 이고, 수입은 " + money + "원 입니다");
    }
}
