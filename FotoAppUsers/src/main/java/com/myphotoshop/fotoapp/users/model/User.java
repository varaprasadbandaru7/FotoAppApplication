package com.myphotoshop.fotoapp.users.model;

import javax.validation.constraints.Email;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;

public class User {
	private String userid;
	@NotNull(message="First Name cannot be null")
	private String firstName;
	@NotNull(message="Last Name cannot be null")
	private String lastName;
	@NotNull(message="Email cannot be null")
	@Email
	private String email;
	@NotNull(message="Password cannot be null")
	@Size(min=8,max=15,message="Password should be between 8 to 15 characters")
	private String password;
	
	public String getUserid() {
		return userid;
	}

	public void setUserid(String userid) {
		this.userid = userid;
	}
	public String getFirstName() {
		return firstName;
	}

	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}

	public String getLastName() {
		return lastName;
	}

	public void setLastName(String lastName) {
		this.lastName = lastName;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public void setPassword(String password) {
		this.password = password;
	}
	
	public String getPassword() {
		return password;
	}

}
