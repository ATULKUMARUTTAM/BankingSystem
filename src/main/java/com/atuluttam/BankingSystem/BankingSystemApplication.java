package com.atuluttam.BankingSystem;

import com.atuluttam.BankingSystem.Model.customer;
import com.atuluttam.BankingSystem.Service.customerService;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

@SpringBootApplication
public class BankingSystemApplication {

	public static void main(String[] args) {

		ApplicationContext ctx =  SpringApplication.run(BankingSystemApplication.class, args);
		System.out.println("Hello World!!!");
		customer obj1 =  ctx.getBean(customer.class);
		obj1.setAccno(100);
		obj1.setName("James");
		obj1.setBalance(10000);

		customerService CS =  ctx.getBean(customerService.class);
		CS.saveCutsomer(obj1);
	}

}
