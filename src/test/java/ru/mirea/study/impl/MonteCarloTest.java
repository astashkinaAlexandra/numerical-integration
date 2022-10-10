package ru.mirea.study.impl;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import ru.mirea.study.Context;
import ru.mirea.study.impl.MonteCarlo;

import static org.junit.jupiter.api.Assertions.*;

class MonteCarloTest {
    Context context;

    @BeforeEach
    void setUp() {
        context = new Context();
        context.setMethod(new MonteCarlo());
    }

    @Test
    void calculate1() {
        int n = 0;
        assertEquals(Double.NaN, context.calculateMethod(n));
    }

    @Test
    void calculate2() {
        int n = 5;
        assertEquals(66.80, Math.round(context.calculateMethod(n) * 100.0) / 100.0);
    }
}