package ru.mirea.study.impl;

import ru.mirea.study.Method;

public class MidpointRule implements Method {

    @Override
    public double calculate(int n) {
        double delta = getDelta(n);
        double sumMid = 0;
        double x;
        for (int i = 0; i < n; i++) {
            x = a + (2 * i + 1) * delta / 2;
            sumMid = sumMid + delta * function(x);
        }
        return sumMid;
    }
}
