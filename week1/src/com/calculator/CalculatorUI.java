package com.calculator;

import java.util.Scanner;

public class CalculatorUI {
    private com.calculator.Calculator cal = new com.calculator.Calculator();

    public void getInput() {
        Scanner sc = new Scanner(System.in);

        System.out.println("첫번째 숫자를 입력하세요.");
        int a = sc.nextInt();

        System.out.println("연산기호를 입력하세요.");
        char oper = sc.next().charAt(0);

        System.out.println("두번째 숫자를 입력하세요.");
        int b = sc.nextInt();

        double result = cal.calculator(a, b, oper);

        System.out.println("계산결과는 " + result + "입니다.");
    }
}
