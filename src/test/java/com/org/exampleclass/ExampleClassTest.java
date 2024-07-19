package com.org.exampleclass;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;

import org.junit.jupiter.api.Test;

public class ExampleClassTest {

    @Test
    void testDimMe_VerySmallNumerator_LargeDenominator() {
        ExampleClass exampleClass = new ExampleClass();
        double numerator = 10;
        double denominator = 2;
        double expectedResult = 5.0d;

        double actualResult = exampleClass.dimMe(numerator, denominator);

        assertEquals(expectedResult, actualResult);
    }

    @Test
    void testDimMe_VerySmallNumerator_ZeroDenominator_ThrowsArithmeticException() {
        ExampleClass exampleClass = new ExampleClass();
        double numerator = 5;
        double denominator = 0.0;

        assertThrows(IllegalArgumentException.class, () -> exampleClass.dimMe(numerator, denominator));
    }
}
