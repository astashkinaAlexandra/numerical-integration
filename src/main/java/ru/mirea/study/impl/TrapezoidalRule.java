package ru.mirea.study.impl;

import ru.mirea.study.Method;

public class TrapezoidalRule implements Method {

    @Override
    public double calculate(int n) {
        double delta = getDelta(n);
        double sumTrap = 0;
        double x1, x2;
        for (int i = 0; i < n; i++) {
            x1 = a + i * delta;
            x2 = a + (i + 1) * delta;
            sumTrap = sumTrap + (delta / 2) * (function(x1) + function(x2));
        }
        return sumTrap;
    }
}
