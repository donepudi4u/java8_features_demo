package com.prokarma.java8.examples.labda_expressions;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

import com.prokarma.java8.examples.labda_expressions.model.Employee;

public class LambdaExpComparator {
	
	
	public static void main(String[] args) {
		
		LambdaExpComparator comparator = new LambdaExpComparator();
				
		List<Employee> allEmployees = comparator.getAllEmployees();
		
		
		allEmployees.forEach(employee -> {
			System.out.println(employee);
			
		});
		
		/*Comparator<Employee> comapare = (empOne,empTwo) -> {
			return empOne.getEmpName().compareTo(empTwo.getEmpName());
			
		};*/
		
		Collections.sort(allEmployees, (empOne,empTwo) -> {
//			return empOne.getEmpName().compareTo(empTwo.getEmpName());
			if(empOne.getEmpNo() > empTwo.getEmpNo())
				return 1;
			if (empOne.getEmpNo() < empTwo.getEmpNo())
				return -1;
			else {
				return 0;
			}
			
		});
		
		
		System.out.println("After sorting vlaues");
		allEmployees.forEach(employee -> {
			
			System.out.println(employee);
			
		});
		
		
		
		
	}

	List<Employee> getAllEmployees(){
		List<Employee> employees = new ArrayList<>();
		employees.add(new Employee(1, "one"));
		employees.add(new Employee(9, "two"));
		employees.add(new Employee(3, "three"));
		employees.add(new Employee(7, "four"));
		employees.add(new Employee(5, "five"));
		employees.add(new Employee(2, "six"));
		return employees;		
		
	}
	
	
}
