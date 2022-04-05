package com.codezmr.test;

import org.springframework.context.support.GenericXmlApplicationContext;

import com.codezmr.beans.DBBean;

public class Test {

	public static void main(String[] args) {

		System.setProperty("spring.profiles.active", "devlopment");
		
		GenericXmlApplicationContext context = new GenericXmlApplicationContext();
		context.load("/com/codezmr/resources/applicationContext-devlopment.xml","/com/codezmr/resources/applicationContext-production.xml");
		context.refresh();
		DBBean db = (DBBean)context.getBean("dbBean");
		db.displayDBDetails();
	}

}
