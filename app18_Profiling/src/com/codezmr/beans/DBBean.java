package com.codezmr.beans;

public class DBBean {
	private String driverClass;
	private String driverURL;
	private String dbUserName;
	private String dbPassword;
	
	public String getDriverClass() {
		return driverClass;
	}
	public void setDriverClass(String driverClass) {
		this.driverClass = driverClass;
	}
	public String getDriverURL() {
		return driverURL;
	}
	public void setDriverURL(String driverURL) {
		this.driverURL = driverURL;
	}
	public String getDbUserName() {
		return dbUserName;
	}
	public void setDbUserName(String dbUserName) {
		this.dbUserName = dbUserName;
	}
	public String getDbPassword() {
		return dbPassword;
	}
	public void setDbPassword(String dbPassword) {
		this.dbPassword = dbPassword;
	}
	
	public void displayDBDetails() {
		
		System.out.println("Data Base Deatils");
		System.out.println("-----------------------");
		System.out.println("Driver Class : "+ driverClass);
		System.out.println("Driver URL   : "+ driverURL);
		System.out.println("DB User Name : "+ dbUserName);
		System.out.println("DB Password  : "+ dbPassword);
	}
	
}
