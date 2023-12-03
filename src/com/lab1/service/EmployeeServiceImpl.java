package com.lab1.service;

import java.util.Random;

import com.lab1.model.Employee;

public class EmployeeServiceImpl implements  EmployeeService{

	@Override
	public String generateEmailID(String fname, String lname, String depName) {
		
		return fname+lname+"."+depName+"@greatlearning.com";
	}

	@Override
	public String generatePassword() {
		String caps="ABCDEFGHIJKLMNOPQRSTUVWXYZ"; //26
		String lower="abcdefghijklmnopqrstuvwxyz"; //26
		String nums="0123456789"; //10
		String splchars="!@#$%^&*()"; //9
		String combined=caps+lower+nums+splchars; //71		
		String myPass="";
		Random random = new Random();
		for(int i=1; i<=8; i++) {
		myPass+=String.valueOf(combined.charAt(random.nextInt(combined.length())));
						
		}
		return myPass;

	}

	@Override
	public void ShowEmployeeDetails(Employee e) {
		System.out.println("Dear "+e.getFirstName()+" your generated credentials are as follows");
	    System.out.println("************************************");
//		System.out.println("Employee first name is :"+e.getFirstName());
//		System.out.println("Employee last name is :"+e.getLastName());
	    System.out.println(" "+e.getFirstName()+" "+e.getLastName());
		System.out.println(" Email I'D : "+e.getEmail());
		System.out.println(" Password : "+e.getPasswords());
	}
	

}
