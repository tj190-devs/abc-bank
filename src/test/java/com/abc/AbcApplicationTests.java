package com.bank.Abc;

import org.junit.Before;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;

import static org.junit.jupiter.api.Assertions.assertEquals;

@SpringBootTest
class AbcApplicationTests {

	private Bank bank;
	private Customer customer;

	@Test
	public void testGetFirstCustomer() {
		bank = new Bank();
		customer = new Customer("Badshah");
		System.out.println(customer);
		bank.addCustomer(customer);
		assertEquals("Badshah",bank.getFirstCustomer().getName());
	}

	@Test
	public void testCalcInterest(){
		bank = new Bank();
		customer = new Customer("Badshah");
		System.out.println(customer);
		bank.addCustomer(customer);
		Account checkingAccount = new CheckingAccount(1000);
		customer.addAccounts(checkingAccount);
		assertEquals(1.0,customer.calcTotalInterest(),0.001);
	}
}
