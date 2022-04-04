package com.codezmr.test;

import org.springframework.beans.BeanWrapper;
import org.springframework.beans.BeanWrapperImpl;

import com.codezmr.beans.Employee;

public class Test {

	public static void main(String[] args) {
		
		BeanWrapper bw = new BeanWrapperImpl(Employee.class);
		bw.setPropertyValue("eno", 111);
		bw.setPropertyValue("ename", "ZMR");
		bw.setPropertyValue("esal", 170000);
		bw.setPropertyValue("eaddr", "India");
		
		System.out.println("Employee Details.");
		System.out.println("----------------------");
		System.out.println("Employee Number     : "+ bw.getPropertyValue("eno"));
		System.out.println("Employee Name       : "+  bw.getPropertyValue("ename"));
		System.out.println("Employee Salary     : "+  bw.getPropertyValue("esal"));
		System.out.println("Employee Address    : "+  bw.getPropertyValue("eaddr"));

	}

}
