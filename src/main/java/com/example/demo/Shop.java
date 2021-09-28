package com.example.demo;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
 
@Entity
public class Shop {
    private Integer id;
    private String s_category;
    private String s_name;
    private String s_status;
    private String s_owner;
    private String lease_status;
    
    
    public Shop() {}
    


	public Shop(Integer id, String s_category, String s_name, String s_status, String s_owner, String lease_status) {
		super();
		this.id = id;
		this.s_category = s_category;
		this.s_name = s_name;
		this.s_status = s_status;
		this.s_owner = s_owner;
		this.lease_status = lease_status;
	}

	@Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
	public Integer getId() {
		return id;
	}



	public void setId(Integer id) {
		this.id = id;
	}



	public String getS_category() {
		return s_category;
	}



	public void setS_category(String s_category) {
		this.s_category = s_category;
	}



	public String getS_name() {
		return s_name;
	}



	public void setS_name(String s_name) {
		this.s_name = s_name;
	}



	public String getS_status() {
		return s_status;
	}



	public void setS_status(String s_status) {
		this.s_status = s_status;
	}



	public String getS_owner() {
		return s_owner;
	}



	public void setS_owner(String s_owner) {
		this.s_owner = s_owner;
	}



	public String getLease_status() {
		return lease_status;
	}



	public void setLease_status(String lease_status) {
		this.lease_status = lease_status;
	}



	@Override
	public String toString() {
		return "Shop [id=" + id + ", s_category=" + s_category + ", s_name=" + s_name + ", s_status=" + s_status
				+ ", s_owner=" + s_owner + ", lease_status=" + lease_status + "]";
	}



	
	
}