package ru.mirea.study.impl;

import ru.mirea.study.Method;

import java.util.Random;

public class MonteCarlo implements Method {

    @Override
    public double calculate(int n) {
        int in = 0;
        int out = 0;
        double min = 0;
        double max = function(b);
        double rectangle = (b - a) * max;
        double x, y;
        for (int i = 0; i < n; i++) {
            x = a + new Random().nextDouble() * (b - a);
            y = min + new Random().nextDouble() * (max - min);
            if (y > function(x)) {
                out++;
            } else {
                in++;
            }
        }
        return in / ((double) n) * rectangle;
    }
}
