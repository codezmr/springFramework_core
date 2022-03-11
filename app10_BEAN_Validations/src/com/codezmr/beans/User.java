package com.codezmr.beans;

 public class User {
  private String uname;
  private String upwd;
  private int uage;
  private String uemail;
  private String umobile;
  
	public String getUname() {
		return uname;
	}
	public void setUname(String uname) {
		this.uname = uname;
	}
	public String getUpwd() {
		return upwd;
	}
	public void setUpwd(String upwd) {
		this.upwd = upwd;
	}
	public int getUage() {
		return uage;
	}
	public void setUage(int uage) {
		this.uage = uage;
	}
	public String getUemail() {
		return uemail;
	}
	public void setUemail(String uemail) {
		this.uemail = uemail;
	}
	public String getUmobile() {
		return umobile;
	}
	public void setUmobile(String umobile) {
		this.umobile = umobile;
	}
	
	public void getUserDetails() {
		System.out.println("User Deatils");
		System.out.println("--------------------");
		System.out.println("User Name        : "+ uname);
		System.out.println("User Password    : "+ upwd);
		System.out.println("User Age         : "+ uage);
		System.out.println("User Email       : "+ uemail);
		System.out.println("User Mobile      : "+ umobile);
		System.out.println("--------------------");
	
	}

	
	
	
	
	
	
	
	
	
	
	
}
