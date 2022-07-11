package com.cdac.component;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component("hdfcAtm-v2")

public class CentralAtm1 implements Atm1 {

	
		@Autowired
		private Bank1 bank1;
		public void withdraw1(int acno, double amount) {
			// TODO Auto-generated method stub
			System.out.println("Customer at StateBank wants to withdraw money..");
			bank1.withdraw1(12345, acno, amount);

		}
	}


