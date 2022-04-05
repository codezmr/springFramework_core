package com.codezmr.beans;

public class Employee {
	
	private String eid;
	private String ename;
	private float esal;
	private EmployeeAddress eaddr;
	
	public String getEid() {
		return eid;
	}
	public void setEid(String eid) {
		this.eid = eid;
	}
	public String getEname() {
		return ename;
	}
	public void setEname(String ename) {
		this.ename = ename;
	}
	public float getEsal() {
		return esal;
	}
	public void setEsal(float esal) {
		this.esal = esal;
	}
	
	
	public EmployeeAddress getEaddr() {
		return eaddr;
	}
	public void setEaddr(EmployeeAddress eaddr) {
		this.eaddr = eaddr;
	}
	
	
	public void getEmployeDetails() {
		System.out.println("Employee Details");
		System.out.println("---------------------------");
		System.out.println("Employee Id      : "+eid);
		System.out.println("Employee Name    : "+ename);
		System.out.println("Employee Salary  : "+esal);
		System.out.println();
		System.out.println("Employee Address Details ");
		System.out.println("----------------------------");
		System.out.println("House No : "+eaddr.getHno());
		System.out.println("Street   : "+eaddr.getStreet());
		System.out.println("City     : "+eaddr.getCity());
		System.out.println("State    : "+eaddr.getState());
		System.out.println("Country  : "+eaddr.getCountry());

	}
	
}
