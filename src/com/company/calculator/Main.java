package com.company.calculator;

public class Main {

    public static void main(String[] args) {

        System.out.println("Task 1.1 Calculator");

        Calculator calculator = Calculator.instance.get();

        int a = calculator.plus.apply(1, 2);
        int b = calculator.minus.apply(1,1);
        try {
            int c = calculator.divide.apply(a, b);
            calculator.println.accept(c);
        } catch (ArithmeticException e) {
            System.out.println("Operation divide by zero is not possible.");
        }


    }
}
