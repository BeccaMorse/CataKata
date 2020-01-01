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
    void inputZeroYieldsNull() {
        FibonacciGenerator fibonacciGenerator = new FibonacciGenerator(0);
        assertNull(fibonacciGenerator.getFibonacciSequence());
    }

    @Test
    void sequenceIndex0Equals0() {
        FibonacciGenerator fibonacciGenerator = new FibonacciGenerator(3);
        assertEquals(0,fibonacciGenerator.getFibonacciSequence()[0]);
    }

    @Test
    void sequenceIndex1Equals1() {
        FibonacciGenerator fibonacciGenerator = new FibonacciGenerator(3);
        assertEquals(1,fibonacciGenerator.getFibonacciSequence()[1]);
    }

    @Test
    void sequenceIndex2Equals1() {
        FibonacciGenerator fibonacciGenerator = new FibonacciGenerator(3);
        assertEquals(1,fibonacciGenerator.getFibonacciSequence()[2]);
    }

    @Test
    void sequenceIndex3Equals2() {
        FibonacciGenerator fibonacciGenerator = new FibonacciGenerator(3);
        assertEquals(1,fibonacciGenerator.getFibonacciSequence()[2]);
    }

    @Test
    void sequenceIndex4Equals3() {
        FibonacciGenerator fibonacciGenerator = new FibonacciGenerator(3);
        assertEquals(1,fibonacciGenerator.getFibonacciSequence()[2]);
    }

    @Test
    void negativeIterationsFails() {
        FibonacciGenerator fibonacciGenerator = new FibonacciGenerator(-12);
        assertNull(fibonacciGenerator.getFibonacciSequence());
    }
}