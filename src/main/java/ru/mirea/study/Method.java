package ru.mirea.study;

public interface Method {
    int a = 1;
    int b = 9;

    double calculate(int n);

    default double function(double x) {
        // Here you can change f(x) into another function
        return (2 * x + 1) * Math.log(x);
    }

    default double getDelta(int n) {
        double delta = 0.0;
        try {
            if (n != 0) {
                delta = (b - a) / ((double) n);
            } else {
                delta = (b - a) / n;
            }
        } catch (ArithmeticException e) {
            System.out.println("Divisor is 0. Division by 0 not possible");
        }
        return delta;
    }
}
