package com.ex06;

public class Player {
    public static final int BEGINNER_LEVEL = 1;
    public static final int ADVANCED_LEVEL = 2;
    public static final int SUPER_LEVEL = 3;

    int level;

    public void play(int time) {
        Player hasALevel = new BeginnerLevel();
        if (this.level == ADVANCED_LEVEL) {
            hasALevel = new AdvancedLevel();
        } else if (this.level == SUPER_LEVEL) {
            hasALevel = new SuperLevel();
        }
        hasALevel.play(time);
    }

    public void upgradeLevel(int level) {
        this.level = level;
    }
}
