package com.example.pc.coincointracker.Models;

/**
 * Created by pc on 23/03/2018.
 */

public class Wallet {
    private double Balance;
    private static final double CAPACITY = 30.0;

    public Wallet(double initialBalance) {
        Balance = initialBalance;
    }

    public void deposit(double amount) throws Exception {
        if ((Balance + amount) > CAPACITY) {
            throw new Exception("Too many coins!");
        }

        Balance += amount;
    }

    public void withdraw(double amount) throws Exception {
        if (amount > Balance) {
            throw new Exception("Not enough cash!");
        }

        Balance -= amount;
    }

    public double getBalance() {
        return Balance;
    }
}
