package com.kodnest.hibernateproject1;


@Table
public class Employee {
	
	int Id;
	String Name;
	int Salary;
	String Department;
	
	public Employee() {
		super();
		// TODO Auto-generated constructor stub
	}
	
	public Employee(int id, String name, int salary, String department) {
		super();
		Id = id;
		Name = name;
		Salary = salary;
		Department = department;
	}

	public Employee(String name, int salary, String department) {
		super();
		Name = name;
		Salary = salary;
		Department = department;
	}

	public int getId() {
		return Id;
	}

	public void setId(int id) {
		Id = id;
	}

	public String getName() {
		return Name;
	}

	public void setName(String name) {
		Name = name;
	}

	public int getSalary() {
		return Salary;
	}

	public void setSalary(int salary) {
		Salary = salary;
	}

	public String getDepartment() {
		return Department;
	}

	public void setDepartment(String department) {
		Department = department;
	}

	@Override
	public String toString() {
		return "Employee [Id=" + Id + ", Name=" + Name + ", Salary=" + Salary + ", Department=" + Department + "]";
	}

	

	

}
