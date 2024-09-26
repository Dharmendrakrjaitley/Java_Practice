package com.interview.practise;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

class Employee{
	public int id;
	public String name;
	public long salary;
	
	public Employee()
	{
		
	}
	
	public Employee(int id, String name, long salary) {
		super();
		this.id = id;
		this.name = name;
		this.salary = salary;
	}
	
	
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public long getSalary() {
		return salary;
	}
	public void setSalary(long salary) {
		this.salary = salary;
	}

	@Override
	public String toString() {
		return "Employee [id=" + id + ", name=" + name + ", salary=" + salary + "]";
	}
	
	
}


class Student implements Comparable<Student>
{
	private int id;
	private String name;
	private long Salary;

	
	public Student(int id, String name, long salary) {
		super();
		this.id = id;
		this.name = name;
		Salary = salary;
	}
	
	
	
	
	@Override
	public String toString() {
		return "Student [id=" + id + ", name=" + name + ", Salary=" + Salary + "]";
	}




	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public long getSalary() {
		return Salary;
	}
	public void setSalary(long salary) {
		Salary = salary;
	}




	@Override
	public int compareTo(Student o) {
		// TODO Auto-generated method stub
		return (int) (this.getSalary() - o.getSalary());
	}
	
	
}


class NameComparator implements Comparator<Employee>
{

	@Override
	public int compare(Employee o1, Employee o2) {
		// TODO Auto-generated method stub
		return o1.getName().compareTo(o2.getName());
	}
	
}

class SalaryComparator implements Comparator<Employee>
{
	@Override
	public int compare(Employee o1, Employee o2) {
		// TODO Auto-generated method stub
		return (int) (o2.getSalary()- o1.getSalary());
	}
}


public class TestClass {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		List<Employee> employees=new ArrayList<Employee>();
		
		employees.add(new Employee(1, "Rahul", 10000));
		employees.add(new Employee(2, "Sunny", 9000));
		employees.add(new Employee(3, "Manish", 12000));
		employees.add(new Employee(4, "Navin", 8000));
		
		// For students
		
		List<Student> students= new ArrayList<Student>();
		students.add(new Student(1, "Soham", 10000));
		students.add(new Student(2, "Rohit", 9000));
		students.add(new Student(3, "Abhishek", 12000));
		students.add(new Student(4, "Sudhir", 8000));
		

//		for (Employee employee : employees) {
//			System.out.println(employee.getName());
//		}
		
		//before sorting
		//System.out.println(employees);
		System.out.println(students);
		
		//after sorting
		//Collections.sort(employees, new NameComparator());
		Collections.sort(employees, new SalaryComparator());
		
		Collections.sort(students);
		
//		Collections.sort(employees, (o1,o2)->{
//			return (int) (o2.getSalary()- o1.getSalary());
//		});
		
		System.out.println(students);
		
		String str="Dharmendra";
		System.out.println(str.charAt(3));


	}

}
