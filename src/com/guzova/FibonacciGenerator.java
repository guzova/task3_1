package com.guzova;
/**
 * Created by GE70 on 26.09.2016.
 */
public class FibonacciGenerator {
    private int xn;
    private int xn_1;

    public FibonacciGenerator(int x0, int x1) {
        this.xn = x1;
        this.xn_1 = x0;
    }

    int next() {
        int temp = xn_1;
        xn_1 = xn;
        xn = temp + xn_1;
        return temp;
    }
}
