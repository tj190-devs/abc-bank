package com.bank.Abc;

public class CheckingAccount extends Account{
    private static final double INTEREST_RATE = 0.001;
    public CheckingAccount(double currentBalance) {
        super(currentBalance);
    }

    @Override
    public double calcInterest() {
        return INTEREST_RATE * balance;
    }
}
