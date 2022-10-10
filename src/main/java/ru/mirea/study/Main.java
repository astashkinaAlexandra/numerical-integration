package ru.mirea.study;

import ru.mirea.study.impl.*;

import java.util.Scanner;

public class Main {
    static Context context = new Context();

    public static void main(String[] args) {
        System.out.println("f(x) = (2x+1)*ln(x)");
        System.out.println("Calculate the integral of f(x)dx over the closed interval [1,9]");
        System.out.println("Method:");
        System.out.println("1. Riemann Sum");
        System.out.println("2. Midpoint Rule");
        System.out.println("3. Trapezoidal Rule");
        System.out.println("4. Simpson's Rule");
        System.out.println("5. Monte Carlo simulation");
        System.out.println("X. Exit");
        System.out.println("\nChoose a method: ");
        String input = "";

        userChoice(input);
    }

    public static void userChoice(String input) {
        Scanner scanner = new Scanner(System.in);

        while (!input.equals("X")) {
            input = scanner.nextLine().trim();

            switch (input) {
                // Riemann Sum
                case "1":
                    System.out.println("\nRiemann Sum");
                    System.out.println("Number of sub-intervals:");
                    int n = scanner.nextInt();
                    context.setMethod(new LeftRiemannSum());
                    double leftRiemannSum = context.calculateMethod(n);
                    context.setMethod(new RightRiemannSum());
                    double rightRiemannSum = context.calculateMethod(n);
                    double averageRiemannSum = (leftRiemannSum + rightRiemannSum) / 2;
                    System.out.println("Integral ≈ (Left + Right) / 2 = " + averageRiemannSum);
                    break;
                // Midpoint Rule
                case "2":
                    System.out.println("\nMidpoint Rule");
                    System.out.println("Number of sub-intervals:");
                    n = scanner.nextInt();
                    context.setMethod(new MidpointRule());
                    double midpointRule = context.calculateMethod(n);
                    System.out.println("Integral ≈ Midpoint Rule Sum = " + midpointRule);
                    break;
                // Trapezoidal Rule
                case "3":
                    System.out.println("\nTrapezoidal Rule");
                    System.out.println("Number of sub-intervals:");
                    n = scanner.nextInt();
                    context.setMethod(new TrapezoidalRule());
                    double trapezoidalRule = context.calculateMethod(n);
                    System.out.println("Integral ≈ Trapezoidal Rule Sum = " + trapezoidalRule);
                    break;
                // Simpson's Rule
                case "4":
                    System.out.println("\nSimpson's 1/3 Rule");
                    System.out.println("Number of sub-intervals:");
                    n = scanner.nextInt();
                    context.setMethod(new SimpsonsRule());
                    double simpsonsRule = context.calculateMethod(n);
                    System.out.println("Integral ≈ Simpson's Rule Sum = " + simpsonsRule);
                    break;
                // Monte Carlo simulation
                case "5":
                    System.out.println("\nMonte Carlo simulation");
                    System.out.println("Number of dots:");
                    n = scanner.nextInt();
                    context.setMethod(new MonteCarlo());
                    double MonteCarlo = context.calculateMethod(n);
                    System.out.println("Integral ≈ Inside dots / Total dots * Rectangle area = " + MonteCarlo);
                    break;
                // Exit
                case "X":
                    break;
            }
        }
        System.out.println("Exit!");
    }
}
