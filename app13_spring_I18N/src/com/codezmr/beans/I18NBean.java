package com.codezmr.beans;

import java.util.Locale;

import org.springframework.context.MessageSource;

public class I18NBean {
	private MessageSource messageSource;

	
	public void setMessageSource(MessageSource messageSource) {
		this.messageSource = messageSource;
	}
	
	public void displayMessage() {
		
		Locale l1 = new Locale("en", "US");
		Locale l2 = new Locale("it", "IT");
		Locale l3 = new Locale("fr", "FR");
		
		System.out.println("Message : "+messageSource.getMessage("welcome", new Object[] {"en","US"}, l1));
		System.out.println("Message : "+messageSource.getMessage("welcome", new Object[] {"it","IT"}, l2));
		System.out.println("Message : "+messageSource.getMessage("welcome", new Object[] {"fr","FR"}, l3));

	}
}
