package com.kodnest.updateData;

import jakarta.persistence.Column;
import jakarta.persistence.Id;
import jakarta.persistence.Entity;
import jakarta.persistence.GenerationType;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Table;

@Entity
@Table(name="employee")

public class Employee {
@Id
@GeneratedValue(strategy = GenerationType.IDENTITY)
int Id;
@Column
String Name;
@Column
int Salary;
@Column
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
