package com.ex05;

public class Eagle extends Animal {
    @Override
    public void move() {
        System.out.println("독수리가 하늘로 날아갑니다.");
    }
    public void fly() {
        System.out.println("독수리가 날개를 쭉 펴고 멀리 날아갑니다.");
    }
}
