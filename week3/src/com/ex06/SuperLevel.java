package com.ex06;

public class SuperLevel extends Player{
    @Override
    public void play(int time) {
        System.out.println("엄청 빨리 달립니다. ");
        for (int i = 0; i < time; i++)
            System.out.println("아주 높이 jump 합니다. ");
        System.out.println("한바퀴 돕니다");
    }
}
