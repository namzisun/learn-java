package com.ex06;

public class BeginnerLevel extends Player{
    @Override
    public void play(int time) {
        System.out.println("천천히 달립니다. ");
        for (int i = 0; i < time; i++)
            System.out.println("Jump 할 줄 모르지롱. ");
        System.out.println("Turn 할 줄 모르지롱");
    }
}
