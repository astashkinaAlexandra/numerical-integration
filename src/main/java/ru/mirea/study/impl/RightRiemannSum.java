package ru.mirea.study.impl;

import ru.mirea.study.Method;

public class RightRiemannSum implements Method {

    @Override
    public double calculate(int n) {
        double delta = (b - a) / ((double) n);
        double sumRight = 0;
        double x;
        for (int i = 1; i <= n; i++) {
            x = a + (i) * delta;
            sumRight = sumRight + delta * function(x);
        }
        return sumRight;
    }
}
