package com.cdac.component;

import org.springframework.stereotype.Component;

@Component
public class StateBank implements Bank {

	public void withdraw(int atmid, int acno, double amount) {
		// TODO Auto-generated method stub
		System.out.println("welecome u are in State bank");

	}

	public void diposit(int atmid, int acno, double amount) {
	
		System.out.println("welecome u are in State bank deposit machine");
	}

}
