package com.prokarma.java8.examples.labda_expressions;

import java.util.ArrayList;
import java.util.List;

public class LambdaExpForLoopDemo {

	public static void main(String[] args) {
		
		
		LambdaExpForLoopDemo  loopDemo = new LambdaExpForLoopDemo();
		
		List<String> employeeNames = loopDemo.getAllEmployeeNames();
		
		
		for (String empName : employeeNames) {
			System.out.println("Without lambda exp : " + empName);
		}
		
		
		System.out.println("-----------------------------------------");
		employeeNames.forEach(
				(temp) -> {
					System.out.println("Using lambda exp : "+temp);
					System.out.println(" second expression : Hello ... " + temp);
				}
				);
	
	
	}

	public List<String> getAllEmployeeNames(){
		
		List<String> names = new ArrayList<>();
		
		names.add(" Employee 1");
		names.add(" Employee 2");
		names.add(" Employee 3");
		names.add(" Employee 4");
		names.add(" Employee 5");
		names.add(" Employee 6");
		names.add(" Employee 7");
		names.add(" Employee 8");
		names.add(" Employee 9");
		names.add(" Employee 10");
		
		return names;
		
	}
	
	
}
