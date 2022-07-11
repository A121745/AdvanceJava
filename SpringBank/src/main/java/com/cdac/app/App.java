package com.cdac.app;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.cdac.component.Atm;
import com.cdac.component.Atm1;

public class App {



	public static void main(String[] args) {
		ApplicationContext	ctx = new ClassPathXmlApplicationContext("Myconfig.xml");
		
		Atm1 atm1=(Atm1) ctx.getBean("hdfcAtm-v2");
		atm1.withdraw1(202020203, 5000);

	}

}
