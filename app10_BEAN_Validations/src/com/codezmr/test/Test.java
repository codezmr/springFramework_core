package com.codezmr.test;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.validation.MapBindingResult;
import org.springframework.validation.ObjectError;

import com.codezmr.beans.User;
import com.codezmr.validator.UserValidator;

public class Test {

	public static void main(String[] args) {
		ApplicationContext context = new ClassPathXmlApplicationContext("/com/codezmr/resources/applicationContext.xml");
		
		User user = (User)context.getBean("userBean");
		
		user.getUserDetails();
		
		System.out.println();
		
		UserValidator userValidator = (UserValidator)context.getBean("userValidator");
		Map<String, String> map = new HashMap<String, String>();
		MapBindingResult result = new MapBindingResult(map, "com.codezmr.beans.User");
		userValidator.validate(user, result);
		List<ObjectError> list = result.getAllErrors();
		
		for(ObjectError error: list) {
			System.out.println(error.getDefaultMessage());
		}
	}

}
