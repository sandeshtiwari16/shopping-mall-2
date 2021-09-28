package com.example.demo;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
 
@Entity
public class Mall {
    private Integer id;
    private String admin_name;
    private String mall_name;
    private String location_;
    private String category_;
    
    
    public Mall() {}


	public Mall(Integer id, String admin_name, String mall_name, String location_, String category_) {
		super();
		this.id = id;
		this.admin_name = admin_name;
		this.mall_name = mall_name;
		this.location_ = location_;
		this.category_ = category_;
	}


	@Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
	public Integer getId() {
		return id;
	}


	public void setId(Integer id) {
		this.id = id;
	}


	public String getAdmin_name() {
		return admin_name;
	}


	public void setAdmin_name(String admin_name) {
		this.admin_name = admin_name;
	}


	public String getMall_name() {
		return mall_name;
	}


	public void setMall_name(String mall_name) {
		this.mall_name = mall_name;
	}


	public String getLocation_() {
		return location_;
	}


	public void setLocation_(String location_) {
		this.location_ = location_;
	}


	public String getCategory_() {
		return category_;
	}


	public void setCategory_(String category_) {
		this.category_ = category_;
	}


	@Override
	public String toString() {
		return "Mall [id=" + id + ", admin_name=" + admin_name + ", mall_name=" + mall_name + ", location_=" + location_
				+ ", category_=" + category_ + "]";
	}
   	
	
}