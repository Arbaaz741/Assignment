package com.assignment.task;

import java.util.Set;
import java.util.TreeSet;

import com.assignment.task.pojo.EmployeeWithHashcodeAndEquals;

public class TreeSetDefaultSorting {

	public static void main(String[] args) {
		Set<EmployeeWithHashcodeAndEquals> employeeSet = new TreeSet<>();
		
		employeeSet.add(new EmployeeWithHashcodeAndEquals(2,"Arbaaz","Shaikh"));
		employeeSet.add(new EmployeeWithHashcodeAndEquals(1,"Salman","Khan"));
		employeeSet.add(new EmployeeWithHashcodeAndEquals(3,"Shah Rukh","Khan"));
		
		System.out.println("Employee default sorting ");
		employeeSet.stream().forEach(employee -> {
			System.out.println(employee);
		});
	}

}
