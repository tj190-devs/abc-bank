package com.bank.Abc;

public class MaxiSavingAccount extends Account{
    private static final double start_rate = 0.02;
    private static final double middle_rate = 0.05;
    private static final double end_rate = 0.10;
    private static final double first_value = 1000;
    private static final double second_value = 2000;

    public MaxiSavingAccount(double currentBalance) {
        super(currentBalance);
    }

    @Override
    public double calcInterest() {
        if(balance <= first_value){
            return  balance * start_rate;
        }else if(balance <=second_value){
            return first_value * start_rate + (balance - first_value) * middle_rate;
        }else {
            return  first_value * start_rate + (second_value - first_value) * middle_rate + (balance-second_value) * end_rate;
        }
    }
}
