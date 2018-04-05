package com.prokarma.java8.examples.labda_expressions.model;

public class Employee {
	
	
	private int empNo;
	private String empName;

	public Employee(int empNo, String empName) {
		super();
		this.empNo = empNo;
		this.empName = empName;
	}
	
	
	public int getEmpNo() {
		return empNo;
	}
	public void setEmpNo(int empNo) {
		this.empNo = empNo;
	}
	public String getEmpName() {
		return empName;
	}
	public void setEmpName(String empName) {
		this.empName = empName;
	}
	
	
	@Override
	public boolean equals(Object obj) {
		Employee emp = (Employee)obj;
		return	emp.getEmpName().equalsIgnoreCase(this.empName);
	}
	
	@Override
	public int hashCode() {
		return empNo;
	}


	@Override
	public String toString() {
		return "Employee [empNo=" + empNo + ", empName=" + empName + "]";
	}
	
	 
	
}
