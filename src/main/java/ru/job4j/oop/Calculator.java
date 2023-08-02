package ru.job4j.oop;

public class Calculator {

    private static int x = 5;

    public static int sum(int y) {
        return x + y;
    }

    public static int minus(int a) {
        return a - x;
    }

    public static int multiply(int b) {
        return b * x;
    }

    public int divide(int c) {
        return c / x;
    }

    public int sumAllOperation(int d) {
        return sum(d) + minus(d) + multiply(d) + divide(d);
    }

    public static void main(String[] args) {
        int sum = sum(10);
        System.out.println(sum);
        int minus = minus(10);
        System.out.println(minus);
        int multiply = multiply(10);
        System.out.println(multiply);
        Calculator calculator = new Calculator();
        int div = calculator.divide(10);
        System.out.println(div);
        int sumAll = calculator.sumAllOperation(10);
        System.out.println(sumAll);
    }
}