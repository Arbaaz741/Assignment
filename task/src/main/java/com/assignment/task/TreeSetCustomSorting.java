package com.assignment.task;

import java.util.Comparator;
import java.util.Set;
import java.util.TreeSet;

import com.assignment.task.pojo.EmployeeWithHashcodeAndEquals;

public class TreeSetCustomSorting {

	public static void main(String[] args) {
		Comparator<EmployeeWithHashcodeAndEquals> firstNameComparator = Comparator.comparing(EmployeeWithHashcodeAndEquals::getFirstName);
		Set<EmployeeWithHashcodeAndEquals> employeeSet = new TreeSet<>(firstNameComparator);
		
		employeeSet.add(new EmployeeWithHashcodeAndEquals(2,"Arbaaz","Shaikh"));
		employeeSet.add(new EmployeeWithHashcodeAndEquals(1,"Salman","Khan"));
		employeeSet.add(new EmployeeWithHashcodeAndEquals(3,"Shah Rukh","Khan"));
		
		System.out.println("Employee default sorting ");
		employeeSet.stream().forEach(employee -> {
			System.out.println(employee);
		});
	}

}
