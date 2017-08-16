package com.yourspraveen.sample.java;

import java.util.HashSet;
import java.util.Set;

public class NumberClassifier {
    private Set<Integer> factors;
    private int number;

    public NumberClassifier(int number) throws InvalidNumberException {
        if (number < 1)
            throw new InvalidNumberException("Can't classify negative numbers");
        this.number = number;
        factors = new HashSet<Integer>();
        factors.add(1);
        factors.add(this.number);
    }

    public static boolean isPerfect(int number) throws InvalidNumberException {
        return new NumberClassifier(number).isPerfect();
    }

    private boolean isFactor(int factor) {
        return number % factor == 0;
    }

    public Set<Integer> getFactors() {
        return factors;
    }

    private void calculateFactors() {
        for (int i = 1; i <= Math.sqrt(number) + 1; i++)
            if (isFactor(i)) {
                addFactor(i);
            }
    }

    private void addFactor(int factor) {
        factors.add(factor);
        factors.add(number / factor);
    }

    private int sumOfFactors() {
        calculateFactors();
        int sum = 0;
        for (int i : factors)
            sum += i;
        return sum;
    }

    public boolean isPerfect() {
        return sumOfFactors() - number == number;
    }

    public boolean isAbundant() {
        return sumOfFactors() - number > number;
    }

    public boolean isDeficient() {
        return sumOfFactors() - number < number;
    }
}
