package ru.mirea.study.impl;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import ru.mirea.study.Context;
import ru.mirea.study.impl.MidpointRule;

import static org.junit.jupiter.api.Assertions.*;

class MidpointRuleTest {
    Context context;

    @BeforeEach
    void setUp() {
        context = new Context();
        context.setMethod(new MidpointRule());
    }

    @Test
    void calculate1() throws ArithmeticException {
        int n = 0;
        assertEquals(0.0, Math.round(context.calculateMethod(n) * 100.0) / 100.0);
    }

    @Test
    void calculate2() {
        int n = 5;
        assertEquals(149.38, Math.round(context.calculateMethod(n) * 100.0) / 100.0);
    }
}