package com.codezmr.beans;

public class Employee {

		private int eno;
		private String ename;
		private float esal;
		private String eaddr;
		
		
		public int getEno() {
			return eno;
		}
		public void setEno(int eno) {
			this.eno = eno;
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
		public String getEaddr() {
			return eaddr;
		}
		public void setEaddr(String eaddr) {
			this.eaddr = eaddr;
		}
		
		public void getEmployeeDetails() {
			
			System.out.println("Employee Details");
			System.out.println("--------------------");
			System.out.println("Employee Number     : "+ eno);
			System.out.println("Employee Name       : "+ ename);
			System.out.println("Employee Salary     : "+ esal);
			System.out.println("Employee Address    : "+ eaddr);
		}
}
