package ru.mirea.study;

public class Context {
    private Method method;

    public void setMethod (Method method){
        this.method = method;
    }

    public double calculateMethod(int n) {
        return method.calculate(n);
    }
}
