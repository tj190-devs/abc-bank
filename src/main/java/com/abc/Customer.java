package com.bank.Abc;

import java.util.ArrayList;
import java.util.List;

public class Customer {

    private String name;
    private List<Account> accounts;

    public Customer(String name) {
        this.name = name;
        this.accounts = new ArrayList<>();
    }
    public String getName() {
        return name;
    }
    public List<Account> getAccounts() {
        return accounts;
    }
    public void addAccounts(Account account) {
        accounts.add(account);
    }

    public double getTotalBalance(){
        return accounts.stream()
                .mapToDouble(Account::getBalance)
                .sum();
    }

    public double calcTotalInterest(){
        return accounts.stream()
                .mapToDouble(Account::calcInterest)
                .sum();
    }

    @Override
    public String toString() {
        return "Customer{" +
                "name='" + name + '\'' +
                ", accounts=" + accounts +
                '}';
    }
}
