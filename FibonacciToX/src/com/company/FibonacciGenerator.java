package com.company;

public class FibonacciGenerator {
    private int numberOfIterations;
    private int[] fibonacciSequence;

    public FibonacciGenerator(int numberOfIterations) {
        this.numberOfIterations = numberOfIterations;
        fibonacciSequence = new int[numberOfIterations];
    }


    public int getNumberOfIterations() {
        return numberOfIterations;
    }

    public int[] getFibonacciSequence() {
        return fibonacciSequence;
    }

}
