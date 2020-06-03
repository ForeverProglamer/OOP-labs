package com.company;

public class Letter {
    private boolean isUpperCase;
    private boolean isVowel;
    private char symbol; // A, a

    public Letter(char symbol) {
        this.symbol = symbol;
    }

    @Override
    public String toString() {
        return "" + symbol;
    }
}