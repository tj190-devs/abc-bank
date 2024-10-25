package com.bank.Abc;

public class SavingAccount extends Account{
    private static final double value = 1000;
    private static final double initial_rate=0.001;
    private static final double extend_rate=0.002;

    public SavingAccount(double currentBalance) {
        super(currentBalance);
    }

    @Override
    public double calcInterest() {
        if(balance <= value){
            return balance * initial_rate;
        }else {
            // use formula so that it can balance after 1000
            return value * initial_rate + (balance-value)*extend_rate;
        }
    }
}
