package com.assignment.task;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class SquareAndEvenSquareNumbers {

	public static void main(String[] args) {
		List<Integer> numList = Arrays.asList(7,9,2,4,0,8);
		
		List<Integer> squareNumList = numList.stream().map(number -> number * number)
				.collect(Collectors.toList());
		
		List<Integer> evenSquareNumList = numList.stream().filter(number -> number % 2 == 0)
				.map(number -> number * number).collect(Collectors.toList());
		
		System.out.println("Original Numbers: " + numList);
		System.out.println("Square Numbers: " + squareNumList);
		System.out.println("Even Square Numbers: " + evenSquareNumList);

	}

}
