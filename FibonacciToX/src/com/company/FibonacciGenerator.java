package com.company;

public class FibonacciGenerator {
    private int numberOfIterations;
    private int[] fibonacciSequence;

    public FibonacciGenerator(int numberOfIterations) {
        this.numberOfIterations = numberOfIterations;
        if (numberOfIterations > 0) {
            this.fibonacciSequence = new int[numberOfIterations];
            populateFibonacciSequence(numberOfIterations);
        }
    }

    private void populateFibonacciSequence(int numberOfIterations) {

        if (numberOfIterations >= 2) {
            fibonacciSequence[1] = 1;
        }
        for (int i = 2 ; i < numberOfIterations ; i++) {
            fibonacciSequence[i] = fibonacciSequence[i-1] + fibonacciSequence [i-2];
        }


    }

    public int getNumberOfIterations() {
        return numberOfIterations;
    }

    public int[] getFibonacciSequence() {
        return fibonacciSequence;
    }

}
