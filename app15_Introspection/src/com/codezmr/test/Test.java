package com.codezmr.test;

import java.beans.BeanInfo;
import java.beans.Introspector;
import java.beans.MethodDescriptor;
import java.beans.PropertyDescriptor;

import com.codezmr.beans.Employee;

public class Test {

	public static void main(String[] args) throws Exception {
		
		BeanInfo beanInfo = Introspector.getBeanInfo(Employee.class);
		PropertyDescriptor[] propDesc = beanInfo.getPropertyDescriptors();
			for(PropertyDescriptor p : propDesc) {
				System.out.println("Prop Name : "+ p.getName());
				System.out.println("Prop Type  : "+ p.getPropertyType());
				System.out.println("Prop Read Methods : "+ p.getReadMethod());
				System.out.println("Prop Write Methods : "+ p.getWriteMethod());
				System.out.println("-------------------------");
			}
		
		MethodDescriptor[] md = beanInfo.getMethodDescriptors();
			for(MethodDescriptor m : md) {
				System.out.println(m);
			}
		
	}

}
