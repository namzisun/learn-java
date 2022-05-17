package com.ex06;

public class AdvancedLevel extends Player{
    @Override
    public void play(int time) {
        System.out.println("빨리 달립니다. ");
        for (int i = 0; i < time; i++)
            System.out.println("높이 jump 합니다. ");
        System.out.println("Turn 할 줄 모르지롱");
    }
}
