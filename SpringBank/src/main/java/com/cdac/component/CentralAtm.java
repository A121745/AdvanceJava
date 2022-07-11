package com.cdac.component;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class CentralAtm implements Atm {
	@Autowired
	private Bank bank;
	public void withdraw(int acno, double amount) {
		// TODO Auto-generated method stub
		System.out.println("Customer at StateBank wants to withdraw money..");
		bank.withdraw(12345, acno, amount);

	}
	public void diposit(int acno, double amount) {
		
		System.out.println("Customer at StateBank wants to deposit money..");
		bank.diposit(12346, acno, amount);
	}

}
