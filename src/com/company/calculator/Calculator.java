package com.company.calculator;

import java.util.function.*;

public class Calculator {

    static Supplier<Calculator> instance = () -> new Calculator();

    BinaryOperator<Integer> plus = (x, y) -> x + y;
    BinaryOperator<Integer> minus = (x, y) -> x - y;
    BinaryOperator<Integer> multiply = (x, y) -> x * y;

    BinaryOperator<Integer> divide = (x, y) -> { //divide by zero is a bad practik(
        if (y == 0) {
            throw new ArithmeticException("Divide by zero");
        } else return x / y;
    };
    UnaryOperator<Integer> pow = x -> x * x;
    UnaryOperator<Integer> abs = x -> x > 0 ? x : x * -1;

    Predicate<Integer> isPositive = x -> x > 0;
    Predicate<Integer> isNegative = x -> x < 0;

    Consumer<Integer> println = x -> System.out.println("Result: " + x);
    Consumer<Boolean> printlnB = b -> System.out.println("Result: " + b);
}
