package com.calculator;

public class Calculator {
    public double calculator(int a, int b, char oper) {
        double result = 0.0;

        switch (oper) {
            case '+':
                result = a + b;
                break;
            case '-':
                result = a - b;
                break;
            case '*':
                result = a * b;
                break;
            case '/':
                result = (double) a / b;
                break;
        }
        return result;
    }
}
