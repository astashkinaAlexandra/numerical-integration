package ru.mirea.study.impl;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import ru.mirea.study.Context;
import ru.mirea.study.impl.LeftRiemannSum;

import static org.junit.jupiter.api.Assertions.*;

class LeftRiemannSumTest {
    Context context;

    @BeforeEach
    void setUp() {
        context = new Context();
        context.setMethod(new LeftRiemannSum());
    }

    @Test
    void calculate1() {
        int n = 1;
        assertEquals(0.0, context.calculateMethod(n));
    }

    @Test
    void calculate2() throws ArithmeticException {
        int n = 0;
        assertEquals(0.0, context.calculateMethod(n));
    }

    @Test
    void calculate3() {
        int n = 5;
        assertEquals(117.10, Math.round(context.calculateMethod(n) * 100.0) / 100.0);
    }
}