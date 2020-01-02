package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        //take input
        //convert to integer

        //output the sequence
        System.out.println("Input a positive integer to generate a Fibonacci Sequence");
        Scanner scanner = new Scanner(System.in);
        int iterations = Integer.parseInt(scanner.nextLine());

        FibonacciGenerator fibonacciGenerator = new FibonacciGenerator(iterations);

        System.out.println("Now Generating " + iterations + " integers in the Fibonacci Sequence...");

        int[] sequence = fibonacciGenerator.getFibonacciSequence();

        for (int i = 0 ; i < iterations ; i++) {
        System.out.print(sequence[i] + " ");
        }
    }
}
