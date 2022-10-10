package ru.mirea.study.impl;

import ru.mirea.study.Method;

public class MidpointRule implements Method {

    @Override
    public double calculate(int n) {
        double delta = 0.0;
        try {
            if (n != 0) {
                delta = (b - a) / ((double) n);
            } else {
                delta = (b - a) / n;
            }
        } catch (ArithmeticException e) {
            System.out.println("Divisor is 0. Division by 0 not possible");
        }
        double sumMid = 0;
        double x;
        for (int i = 0; i < n; i++) {
            x = a + (2 * i + 1) * delta / 2;
            sumMid = sumMid + delta * function(x);
        }
        return sumMid;
    }
}
