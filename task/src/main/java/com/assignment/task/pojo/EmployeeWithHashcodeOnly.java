package com.assignment.task.pojo;

import java.util.Objects;

public class EmployeeWithHashcodeOnly extends Employee {

	public EmployeeWithHashcodeOnly(int id, String firstName, String lastName) {
		super(id, firstName, lastName);
	}

	@Override
	public int hashCode() {
		return Objects.hash(id,firstName,lastName);
	}
	
	

}
