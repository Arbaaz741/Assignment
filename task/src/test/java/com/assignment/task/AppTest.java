package com.assignment.task;

import static org.junit.Assert.*;
import static org.junit.jupiter.api.Assertions.assertEquals;

import java.util.HashSet;
import java.util.Set;

import org.junit.Test;

import com.assignment.task.pojo.Employee;

/**
 * Unit test for simple App.
 */
public class AppTest 
{
    /**
     * Rigorous Test :-)
     */
    @Test
    public void shouldAnswerWithTrue()
    {
        assertTrue( true );
    }
    
    @Test
    public void calculateAdditionTest() {
    	Task task = new Task();
    	int result = task.addition(5, 6);
    	assertEquals(11, result, "5 + 6 should be equal to 11");
    }
    
    @Test
	public void employeeWithoutHashcodeAndEqualsTest() {
		Employee employee1 = new Employee(1, "Arbaaz", "Shaikh");
		Employee employee2 = new Employee(1, "Arbaaz", "Shaikh");
		
		Set<Employee> employeeSet = new HashSet<>();
		employeeSet.add(employee1);
		employeeSet.add(employee2);
		
		assertEquals(2, employeeSet.size());
	}
}
