package com.codezmr.validator;

import org.springframework.validation.Errors;
import org.springframework.validation.Validator;

import com.codezmr.beans.User;

public class UserValidator implements Validator {

	@Override
	public boolean supports(Class<?> cls) {
		
		return User.class.equals(cls);
	}

	@Override
	public void validate(Object obj, Errors errors) {
		User user = (User) obj;
		if(user.getUname() == null || user.getUname().equals("")){
			
			errors.rejectValue("uname", "error.uname.required", "User Name Is Required!!");
		  }
	       
		if(user.getUpwd() == null || user.getUpwd().equals("")){
			
			errors.rejectValue("upwd", "error.upwd.required", "User Password Is Required!!");
		  }
	       
		if(user.getUage() == 0){
			
			errors.rejectValue("uage", "error.uage.required", "User Age Is Required!!");
		  }
		
		if(user.getUemail() == null || user.getUemail().equals("")){
			
			errors.rejectValue("uemail", "error.uemail.required", "User Email Is Required!!");
		  }
		
		if(user.getUmobile() == null || user.getUmobile().equals("")){
			
			errors.rejectValue("umobile", "error.umobile.required", "User Mobile Is Required!!");
		  }

	}

}
