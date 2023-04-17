package com.automation.util;

import com.github.javafaker.Faker;

public class ConsumeTestData {

	public static void main(String[] args) {
		Faker fkobj=new Faker();
	GenerateFakeTestData tdobj=new GenerateFakeTestData();
    String FirstName=fkobj.address().firstName();
    tdobj.setFirstname(FirstName);
    System.out.println("firstname is:" + tdobj.getFirstname());
    String lastName=fkobj.address().lastName();
    tdobj.setLastname(lastName);
    System.out.println("lastname is:"+ tdobj.getLastname());
    String email=fkobj.internet().emailAddress();
    tdobj.setEmailid(email);
    System.out.println("Email Address is:"+tdobj.getEmailid());
    
    
    
    
	}

}
