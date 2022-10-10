package impl;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import ru.mirea.study.Context;
import ru.mirea.study.impl.TrapezoidalRule;

import static org.junit.jupiter.api.Assertions.*;

class TrapezoidalRuleTest {
    Context context;

    @BeforeEach
    void setUp() {
        context = new Context();
        context.setMethod(new TrapezoidalRule());
    }

    @Test
    void calculate1() throws ArithmeticException {
        int n = 0;
        assertEquals(0.0, context.calculateMethod(n));
    }

    @Test
    void calculate2() {
        int n = 5;
        assertEquals(150.50, Math.round(context.calculateMethod(n) * 100.0) / 100.0);
    }
}