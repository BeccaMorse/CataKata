package com.company;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class FibonacciGeneratorTest {

    @Test
    void constructorSetsNumberOfIterations() {
        FibonacciGenerator fibonacciGenerator = new FibonacciGenerator(3);
        assertEquals(3,fibonacciGenerator.getNumberOfIterations());
        assertEquals(3, fibonacciGenerator.getFibonacciSequence().length);
    }

    @Test
    void sequenceIndex2Equals1() {
        FibonacciGenerator fibonacciGenerator = new FibonacciGenerator(3);
        assertEquals(1,fibonacciGenerator.getFibonacciSequence()[2]);
    }
//    @Test
//    void negativeIterationsFails() {
//        FibonacciGenerator fibonacciGenerator = new FibonacciGenerator(-12);
//
//    }
}