package com.automation.util;

import com.github.javafaker.Faker;

public class GenerateFakeTestData {

	private String emailid;
	private String firstname;
	private String lastname;

	Faker fkobj = new Faker();

	public String getEmailid() {
		return emailid;
	}

	public void setEmailid(String emailid) {
		this.emailid = emailid;

	}

	public String getFirstname() {
		return firstname;
	}

	public void setFirstname(String firstname) {
		this.firstname = firstname;
	}

	public String getLastname() {
		return lastname;
	}

	public void setLastname(String lastname) {
		this.lastname = lastname;
	}

}
