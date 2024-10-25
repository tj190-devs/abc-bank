package com.bank.Abc;

public abstract class Account {
    public double balance;

    public Account(double currentBalance) {
        this.balance = currentBalance;
    }

    public double getBalance() {
        return balance;
    }

    public void deposit(double amount){
        if(amount > 0){
            balance += amount;
            System.out.println("Deposited amount:" + amount + "New Balance after depositing amount :" + balance);
        }else {
            System.out.println("Invalid deposit amount");
        }
    }

    public void withDraw(double amount){
        if(amount > 0 && amount <=balance){
            balance -= amount;
            System.out.println("Withdraw amount:" + amount + "New Balance after withdrawing : " + balance);
        }else {
            System.out.println("Invalid or Insufficient balance");
        }
    }

    public abstract double calcInterest();
}
