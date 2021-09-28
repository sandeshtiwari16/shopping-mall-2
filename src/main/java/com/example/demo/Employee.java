package com.example.demo;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
 
@Entity
public class Employee {
    private Integer id;
    private String name;
    private String dob;
    private String salary;
    private String address;
    private String designation;
    private String shop;
    
    public Employee() {}
    
	public Employee(Integer id, String name, String dob, String salary, String address, String designation, String shop) {
		super();
		this.id = id;
		this.name = name;
		this.dob = dob;
		this.salary = salary;
		this.address = address;
		this.designation=designation;
		this.shop=shop;
	}

	@Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getDob() {
		return dob;
	}

	public void setDob(String dob) {
		this.dob = dob;
	}

	public String getSalary() {
		return salary;
	}

	public void setSalary(String salary) {
		this.salary = salary;
	}

	public String getAddress() {
		return address;
	}

	public void setAddress(String address) {
		this.address = address;
	}

	public String getDesignation() {
		return designation;
	}

	public void setDesignation(String designation) {
		this.designation = designation;
	}

	public String getShop() {
		return shop;
	}

	public void setShop(String shop) {
		this.shop = shop;
	}
	@Override
	public String toString() {
		return "employee [id=" + id + ", name=" + name + ", dob=" + dob + ", salary=" + salary + ", address=" + address + ", designation=" + designation + ", shop=" + shop
				+ "]";
	}
}