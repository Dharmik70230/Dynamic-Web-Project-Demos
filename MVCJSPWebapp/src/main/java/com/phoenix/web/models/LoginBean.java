package com.phoenix.web.models;
/* 
 * Auther : Dharmik Maru
 * Date : 26/06/2021
 * Version : 1.0
 * Copyright : Sterlite Technologies
 * 
 * */
public class LoginBean {
	
	//data members
	private String username;
	private String password;
	
	// getters and setters method for data member
	
	public String getUsername() {
		return username;
	}
	public void setUsername(String username) {
		this.username = username;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}

	public boolean isValid() {
		if(username!=null && password!=null
		&& username.equals("dharmik") && password.equals("d123")) {
			return true;			
		}else
			return false;
	}
}
