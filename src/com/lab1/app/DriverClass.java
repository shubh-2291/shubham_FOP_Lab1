package com.lab1.app;

import java.util.Scanner;

import com.lab1.model.Employee;
import com.lab1.service.EmployeeServiceImpl;

public class DriverClass {

	public static void main(String[] args) {
		EmployeeServiceImpl empImpl = new EmployeeServiceImpl();
		Scanner scanner = new Scanner(System.in);
		System.out.println("Please Enter your First name");
		String firstName=scanner.next();
		System.out.println("Please Enter your Last name");
		String lastName=scanner.next();
		
		System.out.println("1. Technical");
		System.out.println("2. Admin");
		System.out.println("3. Human Resource");
		System.out.println("4. Legal");
		
		System.out.println("please choose dept");
		int choice = scanner.nextInt();
		String genEmail="";
		String genPassword="";
		
		switch(choice) {
		case 1: genEmail=empImpl.generateEmailID( firstName.toLowerCase(), lastName.toLowerCase(), "tech".toLowerCase()); break;
		case 2: genEmail=empImpl.generateEmailID( firstName.toLowerCase(), lastName.toLowerCase(), "admin".toLowerCase()); break;
		case 3: genEmail=empImpl.generateEmailID( firstName.toLowerCase(), lastName.toLowerCase(), "hr".toLowerCase()); break;
		case 4: genEmail=empImpl.generateEmailID( firstName.toLowerCase(), lastName.toLowerCase(), "legal".toLowerCase()); break;
		default : System.out.println("Please enter valid input");
		}
		
		genPassword=empImpl.generatePassword();
		Employee e1 = new Employee();
		e1.setFirstName(firstName);
		e1.setLastName(lastName);
		e1.setEmail(genEmail);
		e1.setPasswords(genPassword);
		
		empImpl.ShowEmployeeDetails(e1);
		
		scanner.close();
	}

}
