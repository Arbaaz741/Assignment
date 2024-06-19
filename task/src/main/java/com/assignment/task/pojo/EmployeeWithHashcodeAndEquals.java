package com.assignment.task.pojo;

import java.util.Objects;

public class EmployeeWithHashcodeAndEquals extends Employee implements Comparable<EmployeeWithHashcodeAndEquals>{

	public EmployeeWithHashcodeAndEquals(int id, String firstName, String lastName) {
		super(id, firstName, lastName);
	}
	
	@Override
	public int hashCode() {
		return Objects.hash(id,firstName,lastName);
	}
	
	@Override
	public boolean equals(Object obj) {
		if (this == obj) {
			return true;
		}
		if (obj == null || getClass() != obj.getClass()) {
			return false;
		}
		EmployeeWithHashcodeAndEquals hashcodeAndEquals = (EmployeeWithHashcodeAndEquals) obj;
		return id == hashcodeAndEquals.id &&
				Objects.equals(firstName, hashcodeAndEquals.firstName) &&
				Objects.equals(lastName, hashcodeAndEquals.lastName);
	}
	
	

	@Override
	public String toString() {
		return "Employee [id=" + id + ", firstName=" + firstName + ", lastName=" + lastName + "]";
	}

	@Override
	public int compareTo(EmployeeWithHashcodeAndEquals o) {
		int lastNameCompare = this.lastName.compareTo(o.lastName);
		if(lastNameCompare == 0) {
			return this.firstName.compareTo(o.firstName);
		}
		return lastNameCompare;
	}

}
