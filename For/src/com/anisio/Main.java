package com.anisio;

public class Main {

    public static void main(String[] args) {

        for (int i=2; i < 9; i++){
            System.out.println("10 000 at " + i + "% interest is: " + String.format("%.2f",calculateInterest(10000, i)));
        }

    }

    public static double calculateInterest (double ammount, double interestRate) {
        return (ammount*(interestRate/100));
    }
}
