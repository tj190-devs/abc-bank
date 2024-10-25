package com.bank.Abc;

import ch.qos.logback.core.net.SyslogOutputStream;
import org.springframework.stereotype.Component;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
@Component
public class Bank {
    private  List<Customer> customers;

    public Bank(){
        this.customers = new ArrayList<>();
    }

    // returning all list of customers
    public List<Customer> getCustomers() {
        return customers;
    }

    // returning first Customer value by checking null value as well
    public Customer getFirstCustomer(){
       if(!customers.isEmpty()){
           return customers.get(0);
       }
       return null;
    }
     // adding customers in list
    public void addCustomer(Customer customer){
        System.out.println(customer.toString());

        customers.add(customer);
    }

    public double getTotalInterestPaid(){
        return customers.stream()
                .mapToDouble(Customer :: calcTotalInterest)
                .sum();
    }

    @Override
    public String toString() {
        return "Bank{" +
                "customers=" + customers +
                '}';
    }
}
