package com.assignment.task.pojo;

import java.util.Objects;

public class EmployeeWithEqualsOnly extends Employee{

	public EmployeeWithEqualsOnly(int id, String firstName, String lastName) {
		super(id, firstName, lastName);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj) {
			return true;
		}
		if (obj == null || getClass() != obj.getClass()) {
			return false;
		}
		EmployeeWithEqualsOnly equalsOnly = (EmployeeWithEqualsOnly) obj;
		return id == equalsOnly.id &&
				Objects.equals(firstName, equalsOnly.firstName) &&
				Objects.equals(lastName, equalsOnly.lastName);
	}
	
	

}
