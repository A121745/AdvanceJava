package com.cdac.component;

import org.springframework.stereotype.Component;

@Component("icicibank-v2")

public class StateBank1 implements Bank1 {
	public void withdraw1(int atmid, int acno, double amount) {
		// TODO Auto-generated method stub
		System.out.println("welecome u are in State bank");

	}
	

}
