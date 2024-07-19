package com.org.exampleclass;

import com.pholser.junit.quickcheck.From;
import org.junit.runner.RunWith;
import edu.berkeley.cs.jqf.fuzz.*;

import static org.junit.jupiter.api.Assertions.assertEquals;

@RunWith(JQF.class)
public class ExampleClassFuzzTest {

    @Fuzz
    public void testFuzzDimMe(@From(DoubleGenerator.class) Double a, @From(DoubleGenerator.class) Double b){
        double expectedResult = a / b;
        ExampleClass exampleClass = new ExampleClass();
        double actualResult = exampleClass.dimMe(a, b);
        assertEquals(expectedResult, actualResult);
    }

}
