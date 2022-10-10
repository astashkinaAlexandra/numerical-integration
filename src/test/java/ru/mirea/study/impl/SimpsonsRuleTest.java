package ru.mirea.study.impl;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import ru.mirea.study.Context;
import ru.mirea.study.impl.SimpsonsRule;

import static org.junit.jupiter.api.Assertions.*;

class SimpsonsRuleTest {
    Context context;

    @BeforeEach
    void setUp() {
        context = new Context();
        context.setMethod(new SimpsonsRule());
    }

    @Test
    void calculate1() throws ArithmeticException {
        int n = 0;
        assertEquals(0.0, context.calculateMethod(n));
    }

    @Test
    void calculate2() {
        int n = 5;
        assertEquals(130.28, Math.round(context.calculateMethod(n) * 100.0) / 100.0);
    }
}