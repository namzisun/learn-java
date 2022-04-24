package com.human;

public class Human {
    String name;
    String gender;
    int age;
    String marriage;
    int child;

    public Human(String name) {
        this.name = name;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public void setMarriage(String marriage) {
        this.marriage = marriage;
    }

    public void setChild(int child) {
        this.child = child;
    }

    public void getHuman() {
        System.out.println("이름은 " + name + "이고 나이는 " + age + "살 입니다. ");
        System.out.print("성별은 " + gender + "이며, " + marriage +"자 입니다. ");
        System.out.print("자녀는 " + child + "명이 있습니다. ");
    }
}
