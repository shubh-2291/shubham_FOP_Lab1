package com.lab1.service;

import com.lab1.model.Employee;

public interface EmployeeService {
	public String generateEmailID(String fname, String lname, String depName );
    public String generatePassword();
	public void ShowEmployeeDetails(Employee e);
}
