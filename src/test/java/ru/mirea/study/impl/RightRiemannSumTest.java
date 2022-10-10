package ru.mirea.study.impl;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import ru.mirea.study.Context;
import ru.mirea.study.impl.RightRiemannSum;

import static org.junit.jupiter.api.Assertions.*;

class RightRiemannSumTest {
    Context context;

    @BeforeEach
    void setUp() {
        context = new Context();
        context.setMethod(new RightRiemannSum());
    }

    @Test
    void calculate1() throws ArithmeticException {
        int n = 0;
        assertEquals(0.0, Math.round(context.calculateMethod(n) * 100.0) / 100.0);
    }

    @Test
    void calculate2() {
        int n = 5;
        assertEquals(183.89, Math.round(context.calculateMethod(n) * 100.0) / 100.0);
    }
}