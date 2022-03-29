package com.codezmr.test;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.codezmr.beans.I18NBean;

public class Test {

	public static void main(String[] args) {
		
		ApplicationContext context = new ClassPathXmlApplicationContext("/com/codezmr/resources/applicationContext.xml");
		
		I18NBean bean = (I18NBean) context.getBean("i18nBean");
		bean.displayMessage();
	
	}

}
