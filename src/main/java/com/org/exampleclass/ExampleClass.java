package com.org.exampleclass;

public class ExampleClass {

    public double dimMe(double x, double y) {

        double result = x / y;

        if (Double.isInfinite(result)){
            throw new IllegalArgumentException("Division by zero is not allowed.");
        }

        return result;
    }

}
