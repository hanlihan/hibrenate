package com.ittx.hibate.model;

import java.util.Set;

/*
 * 多对一
 * 职工
 */
public class Employee {
    private int id;
    private String name;
    private int salary;//工资
    private Department departments ;
    
	public Employee(String name, int salary) {
		super();
		this.name = name;
		this.salary = salary;
	}
	public Employee(int id, String name, int salary, Department departments) {
		super();
		this.id = id;
		this.name = name;
		this.salary = salary;
		this.departments = departments;
	}
	public Employee() {
		
	}
	public Employee(int id, String name, int salary) {
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
	public int getSalary() {
		return salary;
	}
	public void setSalary(int salary) {
		this.salary = salary;
	}
	public Department getDepartments() {
		return departments;
	}
	public void setDepartments(Department departments) {
		this.departments = departments;
	}
	@Override
	public String toString() {
		return "Employee [id=" + id + ", name=" + name + ", salary=" + salary + ", departments=" + departments + "]";
	}
	
	
}
