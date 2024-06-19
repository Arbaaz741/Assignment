package com.assignment.task;

import static org.junit.jupiter.api.Assertions.assertEquals;

import java.util.HashSet;
import java.util.Set;

import org.junit.Test;

import com.assignment.task.pojo.Employee;
import com.assignment.task.pojo.EmployeeWithEqualsOnly;
import com.assignment.task.pojo.EmployeeWithHashcodeAndEquals;
import com.assignment.task.pojo.EmployeeWithHashcodeOnly;

public class EmployeeTest {
	
	@Test
	public void employeeWithoutHashcodeAndEqualsTest() {
		Employee employee1 = new Employee(1, "Arbaaz", "Shaikh");
		Employee employee2 = new Employee(1, "Arbaaz", "Shaikh");
		
		Set<Employee> employeeSet = new HashSet<>();
		employeeSet.add(employee1);
		employeeSet.add(employee2);
		
		assertEquals(2, employeeSet.size());
	}
	
	@Test
	public void employeeWithHashcodeTest() {
		EmployeeWithHashcodeOnly employee1 = new EmployeeWithHashcodeOnly(1, "Arbaaz", "Shaikh");
		EmployeeWithHashcodeOnly employee2 = new EmployeeWithHashcodeOnly(1, "Arbaaz", "Shaikh");
		
		Set<EmployeeWithHashcodeOnly> employeeSet = new HashSet<>();
		employeeSet.add(employee1);
		employeeSet.add(employee2);
		
		assertEquals(2, employeeSet.size());
	}
	
	@Test
	public void employeeWithEqualsTest() {
		EmployeeWithEqualsOnly employee1 = new EmployeeWithEqualsOnly(1, "Arbaaz", "Shaikh");
		EmployeeWithEqualsOnly employee2 = new EmployeeWithEqualsOnly(1, "Arbaaz", "Shaikh");
		
		Set<EmployeeWithEqualsOnly> employeeSet = new HashSet<>();
		employeeSet.add(employee1);
		employeeSet.add(employee2);
		
		assertEquals(2, employeeSet.size());
	}
	
	@Test
	public void employeeWithHashcodeAndEqualsTest() {
		EmployeeWithHashcodeAndEquals employee1 = new EmployeeWithHashcodeAndEquals(1, "Arbaaz", "Shaikh");
		EmployeeWithHashcodeAndEquals employee2 = new EmployeeWithHashcodeAndEquals(1, "Arbaaz", "Shaikh");
		
		Set<EmployeeWithHashcodeAndEquals> employeeSet = new HashSet<>();
		employeeSet.add(employee1);
		employeeSet.add(employee2);
		
		assertEquals(1, employeeSet.size());
	}

}
