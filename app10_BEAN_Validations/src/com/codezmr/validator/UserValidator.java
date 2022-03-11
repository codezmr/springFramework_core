package com.codezmr.validator;

import java.io.IOException;
import java.util.Properties;

import org.springframework.core.io.Resource;
import org.springframework.core.io.support.PropertiesLoaderUtils;
import org.springframework.validation.Errors;
import org.springframework.validation.Validator;

import com.codezmr.beans.User;

public class UserValidator implements Validator {

	private Resource resource;
	
	public Resource getResource() {
		return resource;
	}

	public void setResource(Resource resource) {
		this.resource = resource;
	}

	@Override
	public boolean supports(Class<?> cls) {
		
		return User.class.equals(cls);
	}

	@Override
	public void validate(Object obj, Errors errors) {
		try {
		    
			User user = (User) obj;
			
			Properties prop = PropertiesLoaderUtils.loadProperties(resource);
		
			
			if(user.getUname() == null || user.getUname().equals("")){
				
				errors.rejectValue("uname", "error.uname.required", prop.getProperty("error.uname.required"));
			  }
		       
			if(user.getUpwd() == null || user.getUpwd().equals("")){
				
				errors.rejectValue("upwd", "error.upwd.required", prop.getProperty("error.upwd.required"));
			  }
		       
			if(user.getUage() == 0){
				
				errors.rejectValue("uage", "error.uage.required", prop.getProperty("error.uage.required"));
			  }
			
			if(user.getUemail() == null || user.getUemail().equals("")){
				
				errors.rejectValue("uemail", "error.uemail.required", prop.getProperty("error.uemail.required"));
			  }
			
			if(user.getUmobile() == null || user.getUmobile().equals("")){
				
				errors.rejectValue("umobile", "error.umobile.required", prop.getProperty("error.umobile.required"));
			  }

		} catch (IOException e) {
			
			e.printStackTrace();
		}
	}

}
