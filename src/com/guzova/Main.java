package com.guzova;

import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        FibonacciGenerator generator = getGeneratorFromInput(input);
        System.out.print("Input size: ");
        while (!input.hasNextInt())
            input.next();
        int size = input.nextInt();
        int[] array = new int[size];
        for (int i = 0; i < size; i++) {
            array[i] = generator.next();
        }
        System.out.println(Arrays.toString(array));

        System.out.println("Pascal's triangle. ");
        System.out.print("Input size: ");
        while (!input.hasNextInt())
            input.next();
        size = input.nextInt();
        Triangle triangle = new Triangle(size);
        List<List<Long>> pyramid = triangle.get();
        for (List<Long> row : pyramid) {
            System.out.println(row);
        }
    }

    private static FibonacciGenerator getGeneratorFromInput(Scanner input) {
        int x0, x1;
        System.out.println("Fibonacci numbers. ");
        System.out.print("Input x0: ");

        while (!input.hasNextInt())
            input.next();

        x0 = input.nextInt();
        System.out.print("Input x1: ");

        while (!input.hasNextInt())
            input.next();

        x1 = input.nextInt();
        return new FibonacciGenerator(x0, x1);
    }
}
