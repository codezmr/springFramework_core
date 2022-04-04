package com.codezmr.test;

import java.util.HashMap;
import java.util.Map;

import org.springframework.beans.BeanUtils;
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
		
		System.out.println("Employee 1 Details.");
		System.out.println("----------------------");
		System.out.println("Employee Number     : "+ bw.getPropertyValue("eno"));
		System.out.println("Employee Name       : "+  bw.getPropertyValue("ename"));
		System.out.println("Employee Salary     : "+  bw.getPropertyValue("esal"));
		System.out.println("Employee Address    : "+  bw.getPropertyValue("eaddr"));
		System.out.println();
		
		
		//----------By Using Map Object--------------
		
		Map<String, Object> map = new HashMap<String, Object>();
		
		map.put("eno", 222);		
		map.put("ename", "codezmr");		
		map.put("esal", 200000);		
		map.put("eaddr", "India");	
		
		bw.setPropertyValues(map);
		
		Employee emp = (Employee) bw.getWrappedInstance();
		emp.getEmployeeDetails();
		
		//-----Check whether properties are readable/writable or not. 
		
		System.out.println(bw.isReadableProperty("eno"));
		System.out.println(bw.isReadableProperty("ename"));
		System.out.println(bw.isReadableProperty("esal"));
		System.out.println(bw.isReadableProperty("eaddr"));
		
		System.out.println();
		
		System.out.println(bw.isWritableProperty("eno"));
		System.out.println(bw.isWritableProperty("ename"));
		System.out.println(bw.isWritableProperty("esal"));
		System.out.println(bw.isWritableProperty("eaddr"));
		System.out.println();
		
		//copy one bean object to another bean object.
		
		Employee emp1 = new Employee();
		BeanUtils.copyProperties(emp, emp1);
		emp1.getEmployeeDetails();
		
	}

}
