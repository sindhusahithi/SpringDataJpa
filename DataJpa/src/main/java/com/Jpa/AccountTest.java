package com.Jpa;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class AccountTest {
	public static void main(String[] args) {
		AnnotationConfigApplicationContext appcontext = new AnnotationConfigApplicationContext();
		appcontext.scan("net.codejava.spring");
		appcontext.refresh();

		AccountService acountService = (AccountService) appcontext.getBean("AccountService");
		acountService.test();

		appcontext.close();
	}

}
