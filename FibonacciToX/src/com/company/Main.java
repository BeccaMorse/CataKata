package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        //take input
        //convert to integer

        //output the sequence
        System.out.println("Input a positive integer between 1 and 46 to generate a Fibonacci Sequence");
        Scanner scanner = new Scanner(System.in);
        int iterations = Integer.parseInt(scanner.nextLine());

        if (iterations > 0 && iterations < 47) {

            FibonacciGenerator fibonacciGenerator = new FibonacciGenerator(iterations);

            System.out.println("Now Generating " + iterations + " integers in the Fibonacci Sequence...");

            int[] sequence = fibonacciGenerator.getFibonacciSequence();

            for (int i = 0; i < iterations; i++) {
                System.out.print(sequence[i] + " ");
                if (i % 10 == 0) {
                    System.out.println();
                }
            }

        } else {
            System.out.println("Please limit your entry to an integer between 1 and 46. Try again.");

        }


    }
}
