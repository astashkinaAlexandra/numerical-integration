package ru.mirea.study;

public interface Method {
    int a = 1;
    int b = 9;

    double calculate(int n);

    default double function(double x) {
        // Here you can change f(x) into another function
        return (2 * x + 1) * Math.log(x);
    }
}
