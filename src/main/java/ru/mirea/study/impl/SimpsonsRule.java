package ru.mirea.study.impl;

import ru.mirea.study.Method;

public class SimpsonsRule implements Method {

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
        double sumSimpson = 0;
        double x;
        for (int i = 0; i <= n; i++) {
            x = a + i * delta;
            if (x == a || x == b) {
                sumSimpson = sumSimpson + (delta / 3) * (function(x));
            } else if (i % 2 == 1) {
                sumSimpson = sumSimpson + (delta / 3) * 4 * (function(x));
            } else if (i % 2 == 0) {
                sumSimpson = sumSimpson + (delta / 3) * 2 * (function(x));
            }
        }
        return sumSimpson;
    }
}
