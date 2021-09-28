package com.example.demo;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
 
@Entity
public class Owner {
    private Integer id;
    private String name_;
    private String address_;
    private String dob_;
    private String shop_name;
    
    
    public Owner() {}


	public Owner(Integer id, String name_, String address_, String dob_, String shop_name) {
		super();
		this.id = id;
		this.name_ = name_;
		this.address_ = address_;
		this.dob_ = dob_;
		this.shop_name = shop_name;
	}


	@Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
	public Integer getId() {
		return id;
	}


	public void setId(Integer id) {
		this.id = id;
	}


	public String getName_() {
		return name_;
	}


	public void setName_(String name_) {
		this.name_ = name_;
	}


	public String getAddress_() {
		return address_;
	}


	public void setAddress_(String address_) {
		this.address_ = address_;
	}


	public String getDob_() {
		return dob_;
	}


	public void setDob_(String dob_) {
		this.dob_ = dob_;
	}


	public String getShop_name() {
		return shop_name;
	}


	public void setShop_name(String shop_name) {
		this.shop_name = shop_name;
	}


	@Override
	public String toString() {
		return "Owner [id=" + id + ", name_=" + name_ + ", address_=" + address_ + ", dob_=" + dob_ + ", shop_name="
				+ shop_name + "]";
	}
    
    

	
	
}