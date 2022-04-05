package com.codezmr.editor;

import org.springframework.beans.propertyeditors.PropertiesEditor;

import com.codezmr.beans.EmployeeAddress;

public class EmployeeAddressEditor extends PropertiesEditor {
	
	@Override
	public void setAsText(String text) throws IllegalArgumentException {
		
		String[] str = text.split("-");
		
		EmployeeAddress eaddr = new EmployeeAddress();
		eaddr.setHno(str[0]);
		eaddr.setStreet(str[1]);
		eaddr.setCity(str[2]);
		eaddr.setState(str[3]);
		eaddr.setCountry(str[4]);
		
		super.setValue(eaddr);
	}
}
