package ru.mirea.study.impl;

import ru.mirea.study.Method;

public class LeftRiemannSum implements Method {

    @Override
    public double calculate(int n) {
        double delta = (b - a) / ((double) n);
        double sumLeft = 0;
        double x;
        for (int i = 0; i < n; i++) {
            x = a + (i) * delta;
            sumLeft = sumLeft + delta * function(x);
        }
        return sumLeft;
    }
}
