package com.codezmr.test;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.codezmr.beans.Account;

public class Test {

	public static void main(String[] args) {
		
		ApplicationContext context = new ClassPathXmlApplicationContext("/com/codezmr/resources/applicationContext.xml");
		Account account = (Account)context.getBean("account");
		account.createAccount();
		account.searchAccount();
		account.updateAccount();
		account.deleteAccount();
		
	}

}
