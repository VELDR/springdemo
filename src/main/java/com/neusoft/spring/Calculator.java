package com.neusoft.spring;

public class Calculator implements CalculatorService{
    public double add(double x, double y) {
        return x + y;
    }

    public double substract(double x, double y) {
        return x - y;
    }

    public double multiply(double x, double y) {
        return x * y;
    }

    public double divide(double x, double y) {
        return x / y;
    }

}
