package com.java.designPatterns;

class Employee{
	private static Employee emp;
	private Employee() {
		System.out.println("Object created first time");
	}
	public static Employee getEmployee() {
		if(emp==null)
		{
			return new Employee();
		}
		else {
			return emp;
		}
	}
}

public class SingeltonDesignPatternExample {

	public static void main(String[] args) {
		Employee.getEmployee();

	}
}
