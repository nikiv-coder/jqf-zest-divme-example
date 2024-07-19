package com.org.exampleclass;

import com.pholser.junit.quickcheck.generator.GenerationStatus;
import com.pholser.junit.quickcheck.generator.Generator;
import com.pholser.junit.quickcheck.random.SourceOfRandomness;

public class DoubleGenerator extends Generator<Double> {

    public DoubleGenerator(){
        super(Double.class);
    }

    @Override
    public Double generate(SourceOfRandomness random, GenerationStatus __ignore__) {
        Double result = random.nextDouble();
        return result;
    }

}
