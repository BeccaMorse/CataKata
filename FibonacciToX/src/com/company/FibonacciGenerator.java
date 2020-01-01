package com.company;

public class FibonacciGenerator {
    private int numberOfIterations;
    private int[] fibonacciSequence;

    public FibonacciGenerator(int numberOfIterations) {
        this.numberOfIterations = numberOfIterations;
        if (numberOfIterations > 0) {
            fibonacciSequence = new int[numberOfIterations];
            populateFibonacciSequence(numberOfIterations);
        }
    }

    private void populateFibonacciSequence(int numberOfIterations) {

        if (numberOfIterations >= 2) {
            fibonacciSequence[1] = 1;
        }


    }

    public int getNumberOfIterations() {
        return numberOfIterations;
    }

    public int[] getFibonacciSequence() {
        return fibonacciSequence;
    }

}
