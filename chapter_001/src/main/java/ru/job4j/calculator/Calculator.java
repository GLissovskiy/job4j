package ru.job4j.calculator;

public class Calculator {
    public double add(double first, double second) {
        return first + second;
    }

    public double add(double first, double second, double third) {
        return add(
                first,
                add(second, third)
        );
    }

    public double substract(double first, double second) {
        return first - second;
    }

    public double div(double first, double second) {
        return first / second;
    }

    public double multiple(double first, double second) {
        return first * second;
    }
}
