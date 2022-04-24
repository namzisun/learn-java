package com.human;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Human jane = new Human("jane");

        Scanner sc = new Scanner(System.in);

        System.out.println("나이를 입력하세요.");
        jane.setAge(sc.nextInt());
        System.out.println("성별을 입력하세요.(여성/남성)");
        jane.setGender(sc.next());
        System.out.println("결혼여부를 입력하세요. (기혼/미혼)");
        jane.setMarriage(sc.next());
        System.out.println("자녀명수를 입력하세요.");
        jane.setChild(sc.nextInt());

        jane.getHuman();
    }
}
