package com.yurgen.calculator;

public class Calculator {
    int left;
    int right;
    char operation;

    public Calculator(int left, int right, char operation){
        this.left = left;
        this.right = right;
        this.operation = operation;
    }

    double calculate() {
        double result = 0;
        if (operation == '+') {
            result = left + right;
        } else if (operation == '-') {
            result = left - right;
        } else if (operation == '*') {
            result = left * right;
        } else if (operation == '/') {
            result = left / right;
        }
        return result;

    }
}


